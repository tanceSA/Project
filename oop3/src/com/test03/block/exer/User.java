package com.test03.block.exer;

/**
 * ClassName: User
 * Package: com.test03.block.exer
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/14 下午 03:25
 * @Version 1.0
 */
public class User {
    private String userName;
    private String password;
    private long registrationTime;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }

    {
        System.out.println("新用戶註冊");
        registrationTime = System.currentTimeMillis();
    }
    public User() {
        userName = System.currentTimeMillis() + "";
        password = "123456";
    }
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
   public String getInfo() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", registrationTime=" + registrationTime +
                '}';
    }


}
