package space.magnum.exercises.exercises3_1.Help;

/**
 * Вправа 3.1
 * Програма довідник з синтаксису керуючих операторів if та switch
 *
 * @version 1
 */
public class Help {
    public static void main(String[] args)
            throws  java.io.IOException {
        char choise;

        // Пункти меню
        System.out.println("Змiст довiдки:");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.print("Виберiть потрiбний варiант: ");

        // Отримуємо символ з клавіатури для вибору пункту меню
        choise = (char) System.in.read();

        System.out.println("\n");

        // Обробка вибору та виведення на екран відповідного тексту
        switch (choise) {
            case '1':
                System.out.println("Оператор if:\n");
                System.out.println("if (умова) { оператор; }");
                System.out.println("else { оператор; }");
                break;
            case '2':
                System.out.println("Оператор switch:\n");
                System.out.println("switch (вираз) {");
                System.out.println("    case константа:");
                System.out.println("        послiдовнiсть операторiв;");
                System.out.println("        break;");
                System.out.println("    //...");
                System.out.println("    default:");
                System.out.println("         виклик операторiв якщо жоден з case не підійшов;");
                System.out.println("}");
                break;
            default:
                System.out.println("Такого ваiанта не знайдено.");
        }
    }
}
