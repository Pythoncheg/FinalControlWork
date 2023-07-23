package AccountingForNursery;

import AccountingForNursery.units.BaseClass;

import java.util.ArrayList;


public class Main {
    public static final ArrayList<BaseClass> animals = new ArrayList<>();

    public static void main(String[] args) {
        View.welcome();
        while (true) {
            View.invitationToMenu();
            View.menu();
            Actions.runMenu(animals, Actions.choiceMenu());
        }
    }
}

