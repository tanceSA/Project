package com.test06.project.team.domain;

/**
 * ClassName: NoteBook
 * Package: com.test06.project.team.domain
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/28 下午 02:57
 * @Version 1.0
 */
public class NoteBook implements Equipment{
    private String model;
    private double price;

    public NoteBook() {
    }
    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model + "(" + price + ")";
    }
}
