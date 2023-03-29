package com.test06.project.team.domain;

/**
 * ClassName: PC
 * Package: com.test06.project.team.domain
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/28 下午 02:54
 * @Version 1.0
 */
public class PC implements Equipment {
    private String model;//型號
    private String display;//名稱


    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }
}
