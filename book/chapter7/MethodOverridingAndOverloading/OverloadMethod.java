/*
 * Клас содержащий метод main для запуска програмы и теста класса Triangle.
 *
 * @author Magnum
 */
class OverloadMethod {
    public static void main(String args[]) {
        B3 subOb = new B3(1, 2, 3);

        subOb.show("k: "); // вызов метода show() класса B
        System.out.println();
        subOb.show(); // вызов метода show() класса A
    }
}
