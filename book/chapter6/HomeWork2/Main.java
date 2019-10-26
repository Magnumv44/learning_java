/*
 * Класс содержащий метод main для тестирвоания класса Test/
 *
 * @author Magnum
 */
public class Main {
    public static void main(String[] args) {
        Test ob1 = new Test(1); // Создаем первый объект
        Test ob2 = new Test(2); // Создаем второй объект

        System.out.println("Сожержимое ob1: " + ob1.getA());
        System.out.println("Сожержимое ob2: " + ob2.getA());
        System.out.println();

        System.out.println("После применения метода swap():");

        // Запускаем медод присваивания значений переменной первого объекта второму
        ob1.swap(ob1, ob2);

        System.out.println("Сожержимое ob1: " + ob1.getA());
        System.out.println("Сожержимое ob2: " + ob2.getA());
        System.out.println();

        // Меняем значение переменной первого объекта
        ob1.setA(3);
        System.out.println("Сожержимое ob1 после установки нового значения: " + ob1.getA());
        System.out.println();

        System.out.println("После применения метода change():");

        // Запускаем метод меняющий местами значения переменных двух объектов
        ob1.change(ob1, ob2);

        System.out.println("Сожержимое ob1: " + ob1.getA());
        System.out.println("Сожержимое ob2: " + ob2.getA());

    }
}