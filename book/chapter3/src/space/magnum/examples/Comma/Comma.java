package space.magnum.examples.Comma;

/**
 * Файл класу Comma.
 * Програма демонструє роботу оператора циклу for з використання двох керуючих змінних в умові циклу
 */
public class Comma {
    public static void main(String[] args) {
        int i, j; // В книзі ці змінні оголошені по за циклом, але їх оголошення можна робити й в умові циклу

        for (i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i та j: " + i + " " + j);
        }
    }
}
