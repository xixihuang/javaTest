import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by huangxi on 2016/5/26.
 */
public class Employee {
    public static void main(String[] args) {
        //构造一个Employee数组，并填入三个雇员对象。
        Employees[] staff = new Employees[3];

        //使用以下第一条代码创建Employee类实例时，将会把实例域设置为：name = "Cark Cracker";salary = 75000;hireday = December 15, 1987;
        //注意：构造器与其他的方法有一个重要的不同。构造器总是伴随着new操作符的执行被调用，而不能对一个已经存在的对象调用构造器来达到重新设置实例域的目的。
        //例如：carl.Employees（"Carl Cracker", 20000, 1987, 12, 15）;将会产生编译错误。
        staff[0] = new Employees("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employees("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employees("Tony Tester", 40000, 1987, 3, 15);

        //将每个雇员的薪水提高5%
        //调用Carl Cracker.raiseSalary(5);会执行下面两条指令：
        //double raise = Carl Cracker.salary *5 /100;
        //Carl Cracker.salary += raise;
        //raiseSalary方法有两个参数。第一个参数raise称为隐式（implicit）参数，是出现在方法名前的Employees类对象Carl Cracker。第二个参数称为显示（explicit）参数，位于方法名后面括号中的数值。
        for (Employees e : staff)
                e.raiseSalary(5);

        //打印出每个雇员的信息
        for (Employees e : staff)
                System.out.println("name = " + e.getName() + ",old salary = " + ",new salary = " + e.getSalary() + ",hireDay = " + e.getHireDay());

    }
}
//一个构造器及四个方法。
    class Employees {
        //Employees类中的三个实例域。private关键字确保只有Employee类自身的方法能够访问这些实例域，而其他类的方法不能读写这些域。
        private String name;
        private double salary;
        private Date hireDay;

        //构造器。（构造器名与以上类名相同。）
        //在构造Employees类的对象时，构造器会运行，以便将实例域初始化为所希望的状态。
        //注意：不要在构造器中定义与实例域重名的局部变量。
        public Employees(String n, double s, int year, int month, int day) {
            name = n;
            salary = s;
            GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
            hireDay = calendar.getTime();
        }

        //三个访问器方法（也叫“域访问器”），它们只返回实例域值。
        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public Date getHireDay() {
            return hireDay;
        }

        //raiseSalary方法(非静态方法)将salary实例域设置为新的值。
        //this表示隐式参数。
        public void raiseSalary(double byPercent) {
            double raise = this.salary * byPercent /100;
            this.salary += raise;
        }
    }
