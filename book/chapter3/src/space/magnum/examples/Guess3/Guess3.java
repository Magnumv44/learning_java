package space.magnum.examples.Guess3;

/**
 * Гра "Вгадай літеру"
 *
 * @version 3
 */
public class Guess3 {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, answer = 'S';

        System.out.println("Загадано букву з діапазону A-Z.");
        System.out.print("Спробуйте її вгадати: ");

        ch = (char) System.in.read();  //Отримуємо символ з клавіатури

        /* В Java змінні типу char є числовими, то ж застосування до них
           простих математичних операцій порівняння допустиме
        */
        if (ch == answer) System.out.println("** Вірно! **");
        else {
            System.out.println("...Вибачте, але необхідна літера знаходиться ");

            if (ch < answer) {
                System.out.println("ближче до кінця алфавіту");
            } else {
                System.out.println("ближче до початку алфавіта");
            }
        }
    }
}

