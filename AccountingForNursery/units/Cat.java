package AccountingForNursery.units;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Cat extends Pets{
    public Cat(String name, String command, int age) {
        super(name, command, age, "Cat");
    }
    public static String setName(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите имя нового животного:");
            String name = scanner.nextLine();
            if (name.matches("Aa-Zz")) {
                return name;
            } else {
                System.out.println("Ошибка в имени используйте только латинские буквы!\n");
            }
            scanner.close();
        }
    }
    public static String setCommand() {
        return "Сидеть";
    }

    public static int setAge() {
        Random random = new Random();
        int age = random.nextInt(1, 200);
        return age;
    }
}
