/*
 * Класс содержащий метод main для тестирвоания класса RecursionStr
 *
 * @author Magnum
 */
public class Main {
    public static void main(String[] args) {
        // Создаем объкт класса RecursionStr
        RecursionStr s = new RecursionStr("This is test string");

        // Вызываем рекурсивный метод и переаем ему в качестве аргумента начальный индекс строки
        s.recursionStr(0);

    }
}
