/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Trần Minh Tuấn
 */
public class Boss extends Employee {

    private double extra;
    private int level;

    public Boss() {
    }

    public Boss(String id, String name, double salary, double extra, int level) {
        super(id, name, salary);
        this.extra = extra;
        this.level = level;
    }

    public double getExtra() {
        return extra;
    }

    public void setExtra(double extra) {
        this.extra = extra;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getIncome() {
        if (this.level == 1) {
            return 12 * this.getSalary() + this.extra;
        } else if (this.level == 2) {
            return 12 * this.getSalary() * 1.2 + this.extra;
        }
        return 12 * this.getSalary() * 1.5 + this.extra;
    }

    @Override
    public String toString() {
        return this.getId() + ", " + this.getName() + ", " + String.format("%.2f", this.extra) + ", " + this.level + ", " + String.format("%.2f", this.getIncome());
    }

}
