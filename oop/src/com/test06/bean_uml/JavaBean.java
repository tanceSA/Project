package com.test06.bean_uml;

/**
 * ClassName: JavaBean
 * Package: com.test06.bean
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/6 下午 02:19
 * @Version 1.0
 */
public class JavaBean {
    public JavaBean(){

    }

    private int id;
    private String name;
    private String email;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
