package AccountingForNursery.units;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public abstract class BaseClass implements Interface {
    protected String name;
    protected List<String> command;
    protected double age;
    protected String type;

    protected BaseClass(String name, List<String> command, int age, String type) {
        this.name = name;
        this.command = command;
        this.age = age;
        this.type = type;
    }
    @Override
    public String toString() {
        double monthToYear = age / 12;
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        String ageToYear = decimalFormat.format(monthToYear);
        return type +
                " Имя: " + name +
                " Возраст: " + age + "мес. " +
                "(" + ageToYear + "года)" +
                " Знает команду: " + command;
    }

    public String getName() {
        return name;
    }

    public List<String> getCommand() {
        return null;
    }

    public double getAge() {
        return age;
    }

    public static String setName(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите имя нового животного:");
            String name = scanner.nextLine();
            if (name.matches("^[A-Za-z]+$")) return name;
            else {
                System.out.println("Ошибка в имени используйте только латинские буквы!\n");
            }
        }
    }

    public static List<String> setCommand() {
        return null;
    }

    public static int setAge() {
        Random random = new Random();
        int age = random.nextInt(1, 200);
        return age;
    }
}
