package space.magnum.examples.Guess4;

/**
 * Файл класу Guess4.
 * Програма гри "Вгадай літеру".
 *
 * @version 4
 */
public class Guess4 {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, ignore, answer = 'S';

        do {
            System.out.println("Загадано букву з діапазону A-Z.");
            System.out.println("Спробуйте її вгадати: ");

            ch = (char) System.in.read(); //Отримуємо символ з клавіатури

           /* Відкидаємо всі зайві символи з буферу вводу.
              Якщо його прибрати, то після введення символу, двічі буде відбуватись
              перевірка символу та виведення на екран двох сповіщень про невірно введений символ.
           */
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            /* В Java змінні типу char є числовими, то ж застосування до них
                простих математичних операцій порівняння допустиме
            */
            if (ch == answer) {
                System.out.println("** Вірно! **");
            } else {
                System.out.print("...Вибачте, але необхідна літера знаходиться ");
                if (ch < answer) {
                    System.out.println("ближче до кінця алфавіту");
                } else {
                    System.out.println("ближче до початку алфавіта");
                }

                System.out.println("Повторіть спробу\n");
            }
        } while (answer != ch);
    }
}
