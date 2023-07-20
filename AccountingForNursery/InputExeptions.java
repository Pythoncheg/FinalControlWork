package AccountingForNursery;

public class InputExeptions extends Exception{
    public InputExeptions() {

    }

    public static void menuExeptions() {
        System.out.println("Такого пункта меню нет. Выберите существующий пункт меню.");
    }
}
