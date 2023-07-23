package AccountingForNursery;

import AccountingForNursery.units.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Actions {
    public static void add(ArrayList<BaseClass> arrayList) {
        View.animalsType();
        runTypeMenu(arrayList, choiceType() );
    }

    public static void remove() {
        System.out.println("removed\n");
    }

    public static void viewCommands() {
        System.out.println("Viewing commands\n");
    }

    public static void addCommands() {
        System.out.println("Add command\n");
    }

    public static void runMenu(ArrayList<BaseClass> array, int step) {
        switch (step) {
            case 1:
                Actions.add(array);
                break;
            case 2:
                Actions.remove();
                break;
            case 3:
                Actions.viewCommands();
                break;
            case 4:
                Actions.addCommands();
                break;
            case -1:
                InputExeptions.menuExeptions();
                break;
        }
    }
    public static void runTypeMenu(ArrayList<BaseClass> array, int step) {
        switch (step) {
            case 1:
                array.add(new Cat(BaseClass.setName(), BaseClass.setCommand(), BaseClass.setAge()));
                break;
            case 2:
                array.add(new Dog(BaseClass.setName(), BaseClass.setCommand(), BaseClass.setAge()));
                break;
            case 3:
                array.add(new Hamster(BaseClass.setName(), BaseClass.setCommand(), BaseClass.setAge()));
                break;
            case 4:
                array.add(new Horse(BaseClass.setName(), BaseClass.setCommand(), BaseClass.setAge()));
                break;
            case 5:
                array.add(new Camel(BaseClass.setName(), BaseClass.setCommand(), BaseClass.setAge()));
                break;
            case 6:
                array.add(new Donkey(BaseClass.setName(), BaseClass.setCommand(), BaseClass.setAge()));
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
        if (choice.matches("[1-4]")) return Integer.parseInt(choice);
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
