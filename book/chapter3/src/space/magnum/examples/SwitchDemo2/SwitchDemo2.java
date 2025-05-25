package space.magnum.examples.SwitchDemo2;

/**
 * Програма SwitchDemo2.
 * Демонстрація роботи оновленого в в Java 17 керуючого оператора switch.
 *
 * @author Magnum
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        int a = 8;

        /*
            В цьому випадку оператор default не обов'язковим
            через те, що switch не присвоєний якійсь змінній і не повертає значення,
            а лише робить якусь дію.
         */
        switch (a) {
            case 1 -> System.out.println("1");
            case 5 -> System.out.println("5");
        }

        enum Day {MON, TUE, WED}

        Day day = Day.MON;

        String result = switch (day) {
            case MON -> "Monday";
            case TUE -> "Tuesday";
            case WED -> "Wednesday"; // Усі значення 'enum' охоплено
            /*
                Не є обов'язковим якщо охоплені всі три значення з перерахунку 'enum'
                якщо ж закоментувати наприклад 'case WED -> "Wednesday";'
                то буде помилка 'java: the switch expression does not cover all possible input values'
                і в такому випадку default є обов'язковим і повинен бути розкоментований!
             */
            //default -> "Unknown";
        };

        System.out.println(result);
    }
}
