/**
 * Created by huangxi on 2016/5/27.
 */
public class staticTest {
    public static void main(String[] args) {
        EmployeeTest[] staff = new EmployeeTest[3];

        staff[0] = new EmployeeTest("Tom",40000);
        staff[0] = new EmployeeTest("Dick",60000);
        staff[0] = new EmployeeTest("Harry",65000);

        for (EmployeeTest e : staff) {
            e.setId();
            System.out.println("name = " + e.getName() + ",id = " + e.getId() + ",salary = " + e.getSalary());
        }
        //静态方法
        int n = EmployeeTest.getNextId();
        System.out.println("Next availble id = " + n );
    }
}

class EmployeeTest {
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public EmployeeTest(String n, double s) {
        name = n;
        salary = s;
        id = 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
    public void setId() {
        id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void main(String[] args) {
        EmployeeTest e = new EmployeeTest("Harry", 5000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}
