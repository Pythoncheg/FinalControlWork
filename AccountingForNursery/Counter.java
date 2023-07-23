package AccountingForNursery;

import java.io.IOException;

public class Counter {
    private static int count;
    public Counter() {
        count = 0;
    }
    public static void add() {
        try  {
            count++;
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void getCount() {
        System.out.println("Число добавленных животных = " + count);
    }
}