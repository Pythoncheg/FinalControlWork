package AccountingForNursery.units;

import java.util.List;
import java.util.Random;

public class Cat extends Pets{
    public Cat(String name, List<String> command, int age) {
        super(name, command, age, "Кот");
    }

    public static int setAge() {
        Random random = new Random();
        int age = random.nextInt(1, 200);
        return age;
    }
}
