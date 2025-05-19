package space.magnum.examples.Ladder;

/**
 * Файл класу Ladder.
 * Демонстрація роботи керуючої конструкції if else-if else.
 */
public class Ladder {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 6; x++) {
            if (x == 1) {
                System.out.println("x дорівнює одиниці");
            } else if (x == 2) {
                System.out.println("x дорівнює двум");
            } else if (x == 3) {
                System.out.println("x дорівнює три");
            } else if (x == 4) {
                System.out.println("x дорівнює чотири");
            } else { // Умова, що виконується як дія за замовчування, якщо інші умови не виконуються
                System.out.println("Значення змінної x знаходиться поза межами відрізка від 1 до 4");
            }
        }
    }
}
