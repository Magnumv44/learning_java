package space.magnum.examples.Guess2;

/**
 * Гра "Вгадай літеру"
 *
 * @version 2
 */
public class Guess2 {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, answer = 'S';

        System.out.println("Загадано літеру з діапазону A-Z.");
        System.out.print("Спробуйте її вгадати: ");

        ch = (char) System.in.read();  //Отримуємо символ з клавіатури

        /* В Java змінні типу char є числовими, то ж застосування до них
           простих математичних операцій порівняння допустиме
        */
        if (ch == answer) {
            System.out.println("** Вірно! **");
        } else {
            System.out.println("...Вибачте, але ви не вгадали.");
        }
    }
}