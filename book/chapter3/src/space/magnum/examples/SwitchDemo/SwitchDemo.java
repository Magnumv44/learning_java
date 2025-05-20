package space.magnum.examples.SwitchDemo;

/**
 * Програма SwitchDemo.
 * Демонстрація роботи керуючого оператора switch.
 *
 * Зверніть увагу, що в preview версії Java 12, а остаточно
 * починаючи з Java 14, оператор switch зазнав синтаксичних змін,
 * але поточний його вигляд як в даному прикладі, все буде працювати.
 */
public class SwitchDemo {
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 10; i++) {
            switch (i) {
                case 0:
                    System.out.println("i дорiвнює нулю");
                    break;
                case 1:
                    System.out.println("i дорiвнює одиницi");
                    break;
                case 2:
                    System.out.println("i дорiвнює двом");
                    break;
                case 3:
                    System.out.println("i дорiвнює трьом");
                    break;
                case 4:
                    System.out.println("i дорiвнює чотирьом");
                    break;
                default:
                    System.out.println("i дорiвнює або бiльше п'яти");
            }
        }
    }
}
