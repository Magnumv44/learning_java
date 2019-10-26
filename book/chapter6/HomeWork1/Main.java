/*
 * Класс содержащий метод main для тестирвоания класса RecursionStr
 *
 * @author Magnum
 */
public class Main {
    public static void main(String[] args) {
        // Создаем стек
        Stack stk1 = new Stack(10);

        char name[] = {'T', 'o', 'm'};

        // Создаем стек из массива
        Stack stk2 = new Stack(name);

        char ch;
        int i;

        // Помещаем символы в первый стек
        for (i = 0; i < 10; i++)
            stk1.push((char) ('A' + i));

        // Создаем третий стек на основе первого
        Stack stk3 = new Stack(stk1);

        // Выводим все три стека на экран
        System.out.print("Содержимое stk1: ");
        for (i = 0; i < 10; i++) {
            ch = stk1.pop();
            System.out.print(ch);
        }

        System.out.println();

        System.out.print("Содержимое stk2: ");
        for (i = 0; i < 3; i++) {
            ch = stk2.pop();
            System.out.print(ch);
        }

        System.out.println();

        System.out.print("Содержимое stk3: ");
        for (i = 0; i < 10; i++) {
            ch = stk3.pop();
            System.out.print(ch);
        }

    }
}