package AccountingForNursery;

import AccountingForNursery.units.BaseClass;

import java.util.ArrayList;
import java.util.Scanner;

public class Actions {
    public static void add() {
        System.out.println("Add animals done\n");
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

    public static void run(ArrayList<BaseClass> array, int step) {
        switch (step) {
            case 1:
                Actions.add();
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
    public static int choiceMenu() {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if (choice.matches("[1-4]")) return Integer.parseInt(choice);
        else {
            return -1;
        }
    }
    public static int choiceType() {

    }
}
