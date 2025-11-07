package space.magnum.examples.EmptyPartLoopCondition;

/**
 * Файл класу EmptyPartLoopCondition2.
 * Програма демонструє роботу циклу з відсутньою ініціалізуючою змінною
 * шляхом винесення її за межи циклу, але з подальшою її інкрементацією в тілі циклу.
 */
public class EmptyPartLoopCondition2 {
    public static void main(String[] args) {
        int i; // оголошення ініціалізуючої змінної перед циклом
        i = 0; // ініціалізація ініціалізуючої змінної з початковим значенням

        for ( ; i < 10; ) {
            System.out.println("Прохід №" + i);
            i++; // інкрементація змінної в тілі циклу
        }
    }
}
