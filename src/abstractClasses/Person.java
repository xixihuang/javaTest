package abstractClasses;

/**
 * Created by huangxi on 2016/5/30.
 */
public abstract class Person {
    public abstract String getDescription();
    private String name;

    public Person(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}
