/*
 * Клас содержащий метод main для запуска програмы и теста класа OverloadConsDemo.
 *
 * @author Magnum
 */
class OverloadConsDemo {
    public static void main(String args[]) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass(88);
        MyClass t3 = new MyClass(17.23);
        MyClass t4 = new MyClass(2, 4);

        System.out.println("t1.x: " + t1.getX());
        System.out.println("t2.x: " + t2.getX());
        System.out.println("t3.x: " + t3.getX());
        System.out.println("t4.x: " + t4.getX());
    }
}
