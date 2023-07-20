package AccountingForNursery;

import AccountingForNursery.units.BaseClass;
import AccountingForNursery.units.Cat;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static final ArrayList<BaseClass> animals = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Приветсвую в программе работы с питомником животных!");
        System.out.println("Выберите пункт меню:\n");
        while (true) {
            View.menu();
            Actions.run(animals, Actions.choiceMenu());
        }
//        System.out.println("\n Итоговая запись:\n");
//        for (int i = 0; i < animals.size(); i++) {
//            System.out.println(animals.get(i).toString());


    }
}
