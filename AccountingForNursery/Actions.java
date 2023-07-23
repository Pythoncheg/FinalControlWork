package AccountingForNursery;

import AccountingForNursery.units.*;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Actions {
    public static void add(ArrayList<BaseClass> arrayList) {
        View.animalsType();
        runTypeMenu(arrayList, choiceType());
        Counter.add();
        Counter.getCount();
    }

    public static void remove(ArrayList<BaseClass> array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите животное для удаления.\n");
        View.printListAnimals(array);
        String input = scanner.nextLine();
        int choice = Integer.parseInt(input);
        for (int i = 0; i < array.size(); i++) {
            if (i == choice - 1) {
                System.out.println("Вы дейстиветьно хотите удалить " + array.get(i).getName() + "? Y/N");
                input = scanner.nextLine();
                if (input.matches("[Yy]")) {
                    array.remove(i);
                    System.out.println("Запись удалена успешно.\n");
                } else {
                    System.out.println("Удаление отменено.\n");
                }
            }
        }
    }

    public static void runMenu(ArrayList<BaseClass> array, int step) {
        switch (step) {
            case 1:
                Actions.add(array);
                break;
            case 2:
                Actions.remove(array);
                break;
            case 3:
                View.joke();
                break;
            case 4:
                BaseClass.getCommand(array);
                break;
            case 5:
                BaseClass.setCommand(array);
                break;
            case 6:
                View.printListAnimals(array);
                break;
            case -1:
                InputExeptions.menuExeptions();
                break;
        }
    }

    public static void runTypeMenu(ArrayList<BaseClass> array, int step) {
        switch (step) {
            case 1:
                array.add(new Cat(BaseClass.setName(), BaseClass.setAge()));
                View.addComlited();
                break;
            case 2:
                array.add(new Dog(BaseClass.setName(), BaseClass.setAge()));
                View.addComlited();
                break;
            case 3:
                array.add(new Hamster(BaseClass.setName(), BaseClass.setAge()));
                View.addComlited();
                break;
            case 4:
                array.add(new Horse(BaseClass.setName(), BaseClass.setAge()));
                View.addComlited();
                break;
            case 5:
                array.add(new Camel(BaseClass.setName(), BaseClass.setAge()));
                View.addComlited();
                break;
            case 6:
                array.add(new Donkey(BaseClass.setName(), BaseClass.setAge()));
                View.addComlited();
                break;
            case 7:
                View.menu();
                runMenu(array, choiceMenu());
                break;
            case -2:
                InputExeptions.menuExeptions();
                break;
        }
    }

    public static int choiceMenu() {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if (choice.matches("[1-6]")) return Integer.parseInt(choice);
        else {
            return -1;
        }
    }

    public static int choiceType() {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if (choice.matches("[1-7]")) return Integer.parseInt(choice);
        else return -2;
    }
}
