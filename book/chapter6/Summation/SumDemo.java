/*
 * Клас содержащий метод main для запуска програмы и теста класа Summation.
 *
 * При создании второго объекта в качестве аргумента ему передается объект
 * созданный ранее.
 *
 * @author Magnum
 */
class SumDemo {
    public static void main(String args[]) {
        // Создаем первый объект
        Summation s1 = new Summation(5);

        // Создаем второй объект и а качестве аргуемента для конструктора передаем ему первый
        Summation s2 = new Summation(s1);

        System.out.println("s1.sum: " + s1.getSum());
        System.out.println("s2.sum: " + s2.getSum());
    }
}
