package AccountingForNursery;

import AccountingForNursery.units.BaseClass;

import java.util.ArrayList;


public class Main {
    public static final ArrayList<BaseClass> animals = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Приветсвую в программе работы с питомником животных!");
        System.out.println("Выберите пункт меню:\n");
        while (true) {
            View.menu();
            Actions.runMenu(animals, Actions.choiceMenu());
            View.printListAnimals(animals);

        }
    }
}

