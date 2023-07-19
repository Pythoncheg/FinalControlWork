package AccountingForNursery.units;

public abstract class BaseClass implements Interface {
    protected String name;
    protected String command;
    protected double age;
    protected String type;

    protected BaseClass(String name, String command, int age, String type) {
        this.name = name;
        this.command = command;
        this.age = age;
        this.type = type;
    }
    @Override
    public String toString() {
        double ageToYear = age / 12;
        return type +
                " Имя: " + name +
                " Возраст: " + age + "мес." + "(" + ageToYear + "года)" +
                " Знает команду: " + command;
    }

    public String getName() {
        return name;
    }

    public String getCommand() {
        return command;
    }

    public double getAge() {
        return age;
    }
}
