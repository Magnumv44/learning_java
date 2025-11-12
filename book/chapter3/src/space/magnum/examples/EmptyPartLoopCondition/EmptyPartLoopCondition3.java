package space.magnum.examples.EmptyPartLoopCondition;

/**
 * Файл класу EmptyPartLoopCondition3.
 * Програма демонструє роботу циклу без тіла циклу.
 */
public class EmptyPartLoopCondition3 {
    public static void main(String[] args) {
        int i; // оголошуємо ініціалізуючу змінну за межами умови циклу
        int sum = 0; // змінна для підрахунку суми кількостей ітерацій

        for (i = 1; i <= 5; sum += i++); // в цьому циклі відсутне тіло циклу, тоб то ніякого коду в середині не виконується

        System.out.println("Кількість ітерацій: " + i);
        System.out.println("Сума кількостей ітерацій: " + sum);
    }
}
