package AccountingForNursery.units;

import java.util.ArrayList;

public abstract class BaseClass implements Interface {
    protected String name;
    protected ArrayList<String> commands;
    protected int age;

    protected BaseClass(String name, ArrayList<String> commands, int age) {
        this.name = name;
        this.commands = commands;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getCommands() {
        return commands;
    }

    public int getAge() {
        return age;
    }
}
