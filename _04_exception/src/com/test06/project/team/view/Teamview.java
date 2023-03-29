package com.test06.project.team.view;


import com.test06.project.team.domain.Employee;
import com.test06.project.team.domain.Programmer;
import com.test06.project.team.service.NameListService;
import com.test06.project.team.service.TeamException;
import com.test06.project.team.service.TeamService;

public class TeamView {
	private NameListService listSvc = new NameListService();
	private TeamService teamSvc = new TeamService();

	public void enterMainMenu() {
		boolean loopFlag = true;
		char key = 0;

		do {
			if (key != '1') {
				listAllEmployees();
			}
			System.out.print("1-團隊列表  2-添加團隊成员  3-刪除團隊成員 4-退出   請選擇(1-4)：");
			key = TSUtility.readMenuSelection();
			System.out.println();
			switch (key) {
			case '1':
				listTeam();
				break;
			case '2':
				addMember();
				break;
			case '3':
				deleteMember();
				break;
			case '4':
				System.out.print("確認是否退出(Y/N)：");
				char yn = TSUtility.readConfirmSelection();
				if (yn == 'Y')
					loopFlag = false;
				break;
			}
		} while (loopFlag);
	}

	// 显示所有的员工成员
	private void listAllEmployees() {
		System.out
				.println("\n-------------------------------優尚開發團隊調度系統--------------------------------\n");
		Employee[] emps = listSvc.getAllEmployees();
		if (emps.length == 0) {
			System.out.println("沒有客戶記錄！");
		} else {
			System.out.println("ID\t姓名\t\t年齡\t薪資\t\t職稱\t\t狀態\t\t獎金\t\t股票\t\t領用設備");
		}
		for(int i = 0;i < emps.length;i++){
			System.out.println(" " + emps[i]);
		}
		System.out
				.println("-------------------------------------------------------------------------------");
	}

	// 显示开发团队成员列表
	private void listTeam() {
		System.out
				.println("\n--------------------團隊成員列表---------------------\n");
		Programmer[] team = teamSvc.getTeam();
		if (team.length == 0) {
			System.out.println("開發團隊目前沒有成員！");
		} else {
			System.out.println("TID/ID\t姓名\t\t年龄\t工資\t\t職稱\t\t獎金\t\t股票");
		}
		for (int i = 0; i < team.length; i++) {
			System.out.println(" " + team[i].getDetailsForTeam());
		}
		System.out
				.println("-----------------------------------------------------");
	}

	// 添加成员到团队
	private void addMember() {
		System.out.println("---------------------添加成员---------------------");
		System.out.print("請輸入要添加的員工ID:");
		int id = TSUtility.readInt();

		try {
			Employee e = listSvc.getEmployee(id);
			teamSvc.addMember(e);
			System.out.println("添加成功");
		} catch (TeamException e) {
			System.out.println("添加失敗，原因：" + e.getMessage());
		}
		// 按Enter键继续...
		TSUtility.readReturn();
	}

	// 從團隊中除指定id的成員
	private void deleteMember() {
		System.out.println("---------------------删除成员---------------------");
		System.out.print("請輸入要删除員工的TID：");
		int id = TSUtility.readInt();
		System.out.print("確認是否删除(Y/N)：");
		char yn = TSUtility.readConfirmSelection();
		if (yn == 'N')
			return;

		try {
			teamSvc.removeMember(id);
			System.out.println("删除成功");
		} catch (TeamException e) {
			System.out.println("删除失败，原因：" + e.getMessage());
		}
		// 按Enter繼續...
		TSUtility.readReturn();
	}

	public static void main(String[] args) {
		TeamView view = new TeamView();
		view.enterMainMenu();
	}
}
