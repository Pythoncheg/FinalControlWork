package AccountingForNursery.units;

import java.util.List;

public abstract class PackAnimals extends BaseClass{
    protected PackAnimals(String name, List<String> command, int age, String type) {
        super(name, command, age, type);
    }
}
