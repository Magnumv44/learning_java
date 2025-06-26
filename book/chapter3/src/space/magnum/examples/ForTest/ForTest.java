package space.magnum.examples.ForTest;

/**
 * Файл класу ForTest.
 * Прогрма демонструє роботу циклу for з умовою виходу, що вводиться з клавіатури.
 */
public class ForTest {
    public static void main(String[] args)
            throws java.io.IOException {
        int i;

        System.out.println("Для принення циклу введiть символ S та натиснiть Enter");

        for (i = 0; (char) System.in.read() != 'S'; i++) {
            System.out.println("Проход №" + i);
        }
    }
}
