import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by huangxi on 2016/5/26.
 */
public class Employee {
    public static void main(String[] args) {
        //构造一个Employee数组，并填入三个雇员对象。
        Employees[] staff = new Employees[3];

        staff[0] = new Employees("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employees("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employees("Tony Tester", 40000, 1987, 3, 15);

        //将每个雇员的薪水提高5%
        for (Employees e : staff)
                e.raiseSalary(5);

        //打印出每个雇员的信息
        for (Employees e : staff)
                System.out.println("name = " + e.getName() + ",old salary = " + ",new salary = " + e.getSalary() + ",hireDay = " + e.getHireDay());

    }
}

    class Employees {
        private String name;
        private double salary;
        private Date hireDay;

        public Employees(String n, double s, int year, int month, int day) {
            name = n;
            salary = s;
            GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
            hireDay = calendar.getTime();
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public Date getHireDay() {
            return hireDay;
        }


        public void raiseSalary(double byPercent) {
            double raise = salary * byPercent /100;
            salary += raise;
        }
    }
