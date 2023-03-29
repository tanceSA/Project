package com.test06.project.team.domain;

/**
 * ClassName: Architect
 * Package: com.test06.project.team.domain
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/28 下午 03:19
 * @Version 1.0
 */
public class Architect extends Designer {
    private int stock;

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getDetails() + "\t設計師\t" + getStatus() + "\t" + getBonus() + "\t" + getStock() + "\t" + getEquipment().getDescription();
    }

    public String getDetailsForTeam(){
        return getBasicDetailsForTeam()+"\t架構師\t"+getBonus()+"\t"+getStock();
    }
}
