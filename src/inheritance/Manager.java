package inheritance;

/**
 * Created by huangxi on 2016/5/27.
 */
public class Manager extends Employee {
    private double bonus;
    public Manager (String n, double s, int year, int month, int day) {
        super(n, s, year, month , day);
        bonus = 0;
    }

    public double getSalary () {
        double baseSalary = super.getSalary();
        baseSalary += bonus;
        return baseSalary;
    }

    public void setBonus(double b) {
        bonus = b;
    }
}
