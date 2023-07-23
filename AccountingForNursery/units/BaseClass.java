package AccountingForNursery.units;

import AccountingForNursery.InputExeptions;
import AccountingForNursery.View;

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

    protected BaseClass(String name, int age, String type) {
        this.name = name;
        this.command = new ArrayList<>();
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
                "(" + ageToYear + "года)";
    }

    public String getName() {
        return name;
    }

    public static void getCommand(ArrayList<BaseClass> arrayList) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Укажите номер животного, что бы увидеть список команд. ");
            View.printListAnimals(arrayList);
            String input = scanner.nextLine();
            int choice = Integer.parseInt(input);
            if (arrayList.get(choice - 1) != null) {
                System.out.println(arrayList.get(choice - 1).command);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Животного с таким номером не существует!\n");;
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не число!\n");
        }
    }

    public double getAge() {
        return age;
    }

    public static String setName() {
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

    public static void setCommand(ArrayList<BaseClass> arrayList) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Укажите номер животного, которого вы хотите обучить: ");
            View.printListAnimals(arrayList);
            String input = scanner.nextLine();
            int choice = Integer.parseInt(input);
            if (arrayList.get(choice - 1) != null) {
                System.out.println(arrayList.get(choice - 1));
                View.addCommand();
                input = scanner.nextLine();
                arrayList.get(choice - 1).command.add(input);
                View.addComlited();
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Животного с таким номером не существует!\n");;
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не число!\n");
        }

    }

    public static int setAge() {
        Random random = new Random();
        int age = random.nextInt(1, 200);
        return age;
    }
}
