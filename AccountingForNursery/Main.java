package AccountingForNursery;

import AccountingForNursery.units.BaseClass;
import AccountingForNursery.units.Cat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static final ArrayList<BaseClass> animals = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите команду.\n");
            System.out.println("Для добавления животного введите 1.\n" +
                    "Для удаления животного введите 2.");
            String choice = scanner.nextLine();
            System.out.println(choice);
            if (choice.equals("add")) {
                System.out.println("Какое животное добавляем?");
                String type = scanner.nextLine();
                if (type.equals("Cat") || type.equals("cat")) {
                    System.out.println("Введиите имя: ");
                    String name = scanner.nextLine();
                    animals.add(new Cat(name, Cat.setCommand(), Cat.setAge()));
                    break;
                } else {
                    System.out.println("Неверные значения");
                }

            } else {
                System.out.println("Выберите правильный пункт меню!");
            }

        }
        System.out.println("\n Итоговая запись:\n");
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i).toString());
        }

    }
}
