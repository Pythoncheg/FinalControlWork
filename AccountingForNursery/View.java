package AccountingForNursery;


import AccountingForNursery.units.BaseClass;

import java.util.ArrayList;

public class View {
    public static void menu() {
        System.out.println("(1) Добавление нового животного.\n" +
                "(2) Удаление существующего животного.\n" +
                "(3) Просмотр команд которым обучено животное.\n" +
                "(4) Обучить животное новой команде.\n");
    }

    public static void animalsType() {
        System.out.println("Выберите, кого хотите добавить: \n" +
                "(1) Кошка\n" +
                "(2) Собака\n" +
                "(3) Хомяк\n" +
                "(4) Лошадь\n" +
                "(5) Верблюд\n" +
                "(6) Осел\n" +
                "(7) Назад");
    }

    public static void printListAnimals(ArrayList<BaseClass> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("(" + (i + 1) + ")" + arrayList.get(i).toString());
            System.out.println();
        }
    }
}

