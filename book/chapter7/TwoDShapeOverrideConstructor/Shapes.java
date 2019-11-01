/*
 * Клас содержащий метод main для запуска програмы и теста класса Triangle.
 *
 * @author Magnum
 */
class Shapes {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle("контурный", 8.0, 12.0);
        Triangle t3 = new Triangle(4.0);

        System.out.println("информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("площадь " + t1.area());

        System.out.println();

        System.out.println("информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("площадь " + t2.area());

        System.out.println();

        System.out.println("информация о t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("площадь " + t3.area());
    }
}
