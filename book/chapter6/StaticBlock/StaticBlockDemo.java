/*
 * Клас содержащий метод main для запуска програмы и теста класа StaticBlock.
 * Демонстрирует использование статических блоков.
 *
 * @author Magnum
 */
class StaticBlockDemo {
    public static void main(String args[]) {
        StaticBlock ob = new StaticBlock("Внутри конструктора");

        System.out.println("Квадратный корень из 2 равен " + StaticBlock.getRootOf2());
        System.out.println("Квадратный корень из 3 равен " + StaticBlock.getRootOf3());

    }
}
