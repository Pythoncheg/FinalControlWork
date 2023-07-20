package AccountingForNursery.units;

import java.util.Random;
import java.util.Scanner;

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

    public static String setName(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите имя нового животного:");
            String name = scanner.nextLine();
            if (name.matches("[A-Za-z]")) return name;
            else {
                System.out.println("Ошибка в имени используйте только латинские буквы!\n");
            }
//            scanner.close();
        }
    }

    public static String setCommand() {
        return "Сидеть";
    }

    public static int setAge() {
        Random random = new Random();
        int age = random.nextInt(1, 200);
        return age;
    }
}
