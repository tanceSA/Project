package com.test06.project.team.domain;

/**
 * ClassName: Designer
 * Package: com.test06.project.team.domain
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/28 下午 03:17
 * @Version 1.0
 */
public class Designer extends Programmer {
    private double bonus;

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return getDetails()+"\t設計師\t"+ getStatus() + "\t"+ getBonus() +"\t\t\t" + getEquipment().getDescription();
    }
    public String getDetailsForTeam(){
        return getBasicDetailsForTeam()+"\t設計師\t"+getBonus();
    }
}
