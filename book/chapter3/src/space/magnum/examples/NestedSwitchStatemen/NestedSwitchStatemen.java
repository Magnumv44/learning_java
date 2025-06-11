package space.magnum.examples.NestedSwitchStatemen;

/**
 * Програма NestedSwitchStatemen.
 *
 * Демонстраці роботи вкладеного оператора switch в інший оператор, на прикладі switch.
 *
 * @author Віталій Магнум
 */

public class NestedSwitchStatemen {
    public static void main(String[] args) {
        char ch1 = 'A';

        switch (ch1) {
            case 'A':
                System.out.println("Цей рядок відноситься до горішнього оператора switch.");

                // Вкладений оператор switch
                switch (ch1) {
                    case 'A':
                        System.out.println("Цей рядок відноситься до вкладеного оператора switch");
                        break;
                    case 'B':
                        System.out.println("Цей рядок відноситься до вкладеного оператора switch та має інше значення");
                        break;
                }
                break;
            case 'B':
                System.out.println("Цей рядок відноситься до горішнього оператора switch та має інше значення");
                break;
            default:
                System.out.println("Рядок, що буде виведень, якщо жоден з операторів case не підійде.");
        }
    }
}
