package AccountingForNursery.units;

import java.util.ArrayList;
import java.util.List;

public class Camel extends PackAnimals{
    public static final List<String> command = new ArrayList<>();

    public Camel(String name,List<String> command, int age) {
        super(name, command, age, "Верблюд");

    }
}
