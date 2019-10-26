/*
 * Домашнее задание 2 главы 6.
 *
 * Предположим, имеется следующий класс:
 * class Test {
 *     private int a;
 *
 *     public Test(int i) {
 *         this.a = i;
 *     }
 * }
 * Напишите метод swap(), реализующий обмен содержимым между двумя объектам
 * типа Test, на который ссылаются две переменные данного типа.
 *
 * @author Magnum
 */
class Test {
    private int a;

    // Конструктор для создания объектов
    public Test(int i) {
        this.a = i;
    }

    // Геттер для получения содержимого переменной
    public int getA() {
        return a;
    }

    // Сеттер для установки значения переменной
    public void setA(int a) {
        this.a = a;
    }

    /* Метод присваивающий значение переменной первого объекта
           переменной второго объекта
         */
    public void swap(Test ob1, Test ob2) {
        ob1.a = ob2.a;
    }

    // Метод меняющий значение переменной "a" у двух объектов местами
    public void change(Test ob1, Test ob2) {
        int temp;
        temp = ob1.a;
        ob1.a = ob2.a;
        ob2.a = temp;
    }
}