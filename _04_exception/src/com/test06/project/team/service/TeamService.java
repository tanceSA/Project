package com.test06.project.team.service;

import com.test06.project.team.domain.Architect;
import com.test06.project.team.domain.Designer;
import com.test06.project.team.domain.Employee;
import com.test06.project.team.domain.Programmer;

/**
 * ClassName: TeamService
 * Package: com.test06.project.team.service
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/28 下午 04:51
 * @Version 1.0
 */
public class TeamService {
    private int counter = 1;
    private final int MAX_MEMBER = 5;
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total = 0;

    public Programmer[] getTeam() {
        Programmer[] programmers = new Programmer[total];
        for (int i = 0; i < total; i++) {
            programmers[i] = team[i];
        }
        return programmers;
    }

    /**
     * @param e 待添加成員
     * @throws TeamException 添加失敗
     */
    public void addMember(Employee e) throws TeamException {

        if (total >= MAX_MEMBER) {
            throw new TeamException("成員已滿，無法添加");
        }
        if (!(e instanceof Programmer)) {
            throw new TeamException("該成員不是開發人員，無法添加");
        }
        Programmer p = (Programmer) e;
        Status status = p.getStatus();
        switch (status) {
            case BUSY:
                throw new TeamException("該名員工已經是某團隊成員");
            case VOCATION:
                throw new TeamException("該名員工正在休假，無法添加");
        }
        if (isExist(p)) {
            throw new TeamException("該員工已在本團隊中");
        }

        int proNum = 0, desNum = 0, ardNum = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                ardNum++;
            } else if (team[i] instanceof Designer) {
                desNum++;
            } else if (team[i] instanceof Programmer) {
                proNum++;
            }
        }

        if (p instanceof Architect) {
            if (ardNum >= 1)
                throw new TeamException("團隊中最多只能有1名架構師");
        } else if (p instanceof Designer) {
            if (desNum >= 2) {
                throw new TeamException("團隊中最多只能有2名i設計師");
            }
        } else {
            if (proNum >= 3)
                throw new TeamException("團隊中最多只能有3名程序員");
        }

        team[total++] = p;
        p.setMemberId(counter++);
        p.setStatus(Status.BUSY);
    }

    /**
     * 判斷p是否在本團隊當中
     *
     * @param p
     * @return
     */
    private boolean isExist(Programmer p) {
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == p.getId()) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param memberId 待刪除成員的ID
     * @throws TeamException 刪除失敗
     */
    public void removeMember(int memberId) throws TeamException {
        int i;
        for (i = 0; i < total; i++) {
            if (team[i].getMemberId() == memberId) {
                team[i].setStatus(Status.FREE);
                break;
            }
        }

        if (i == total)
            throw new TeamException("該成員不在團隊中，刪除失敗");

        for (int j = i; j < total - 1; j++) {
            team[j] = team[j + 1];
            team[--total] = null;
        }
    }
}
