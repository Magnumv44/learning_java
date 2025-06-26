package space.magnum.examples.EmptyPartLoopCondition;

/**
 * Файл класу EmptyPartLoopCondition.
 * Программа демонстрирующая работу цикла с инкрементацией внутри цикла.
 * Програма що демонструє роботу циклу for з порожньою умовою збільшення/зменшення ітерації циклу.
 */
public class EmptyPartLoopCondition {
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 10; ) {
            System.out.println("Проход №" + i);
            i++; // інкрементація змінної i, яка здійснюється в тілі самого циклу
        }
    }
}
