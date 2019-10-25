/*
 * Клас содержащий метод main для запуска програмы и теста класа Outer.
 *
 * @author Magnum
 */
class NestedClassDemo {
    public static void main(String args[]) {
        int x[] = { 3, 2, 1, 5, 6, 9, 7, 8 };
        Outer outOb = new Outer(x);

        outOb.analyze();
    }
}
