package AccountingForNursery;

import AccountingForNursery.units.BaseClass;

import java.util.ArrayList;
import java.util.Scanner;

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
                "(6) Осел");
    }


}

