package com.test01._string.exer3;

/**
 * ClassName: User
 * Package: com.test01._string.exer3
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/6 下午 04:30
 * @Version 1.0
 */
public class User {
    private String name;
    private String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return name +"-"+ password;
    }
}
