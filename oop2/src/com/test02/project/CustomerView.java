package com.test02.project;

/**
 * ClassName: CustomerView
 * Package: com.test02.project.model
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/6 下午 04:49
 * @Version 1.0
 */
public class CustomerView {
    CustomerList customerList = new CustomerList(10);

    //進入主選單
    public void enterMainMenu() {
        boolean isFlag = true;
        while (isFlag) {
            //顯示主選單
            System.out.println("-客戶管理系統-");
            System.out.println("1 新 增 客 戶");
            System.out.println("2 編 輯 客 戶");
            System.out.println("3 刪 除 客 戶");
            System.out.println("4 客 戶 列 表");
            System.out.println("5 退 出 系 統");
            System.out.print("請選擇(1-5): ");
            //取得輸入值
            char key = CMUtility.readMenuSelection();
            switch (key) {
                case '1':
                    System.out.println("-新 增 客 戶-");
                    System.out.print("姓名: ");
                    String name = CMUtility.readString(5);
                    System.out.print("性別: ");
                    char gender = CMUtility.readChar();
                    System.out.print("年齡: ");
                    int age = CMUtility.readInt();
                    System.out.print("電話: ");
                    String phone = CMUtility.readString(10);
                    System.out.print("E-mail: ");
                    String email = CMUtility.readString(20);

                    Customer customer = new Customer(name, gender, age, phone , email);
                    boolean flag = customerList.addCustomer(customer);
                    if(flag){
                        System.out.println("新增成功!");
                    }
                    else {
                        System.out.println("名單已滿，無法新增");
                    }

                    break;
                case '2':

                    break;
                case '3':

                    break;
                case '4':

                    break;
                case '5':
                    System.out.print("確認退出系統(Y/N): ");
                    char isExit = CMUtility.readConfirmSelection();
                    if(isExit == 'Y'){
                        isFlag = false;
                    }
                    break;
            }
        }
    }

    private void addNewCustomer() {

    }

    private void modifyCustomer() {

    }

    private void deleteCustomer() {

    }

    private void listAllCustomers() {

    }

    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }
}
