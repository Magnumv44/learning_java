package space.magnum.examples.NoBreakSwitch;

/**
 * Програм NoBreakSwitch.
 *
 * Демонстрація роботи керуючого оператора switch без використання оператора break.
 */
public class NoBreakSwitch {
    public static void main(String[] args) {
        int i;

        for (i = 0; i <= 5; i++) {
            switch (i) {
                case 0:                                    // Оператор case може не мати будь-якого коду для виконання, тобто бути порожнім
                    System.out.println("i менше одиницi"); // Цей рядок можна закоментувати, помилки не буде
                case 1:
                    System.out.println("i менше двух");
                case 2:
                    System.out.println("i менше трьох");
                case 3:
                    System.out.println("i менше чотирьох");
                case 4:
                    System.out.println("i менше п'яти");
            }
        }
    }
}