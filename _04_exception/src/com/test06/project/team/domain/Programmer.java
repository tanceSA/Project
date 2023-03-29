package com.test06.project.team.domain;

import com.test06.project.team.service.Status;

import static com.test06.project.team.service.Status.FREE;

/**
 * ClassName: Progammer
 * Package: com.test06.project.team.domain
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/28 下午 03:05
 * @Version 1.0
 */
public class Programmer extends Employee{

    private int memberId;
    private Status status = FREE;
    private Equipment equipment;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return getDetails()+"\t程序員\t"+ getStatus() + "\t\t\t\t\t" + getEquipment().getDescription();
    }

    public String getBasicDetailsForTeam(){
        return getMemberId()+"/"+getId()+"\t"+getName()+"\t"+getAge()+"\t"+getSalary();
    }
    public String getDetailsForTeam(){
        return getBasicDetailsForTeam()+"\t程序員\t";
    }
}
