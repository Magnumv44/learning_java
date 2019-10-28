/*
 * Клас содержащий метод main для запуска програмы и теста класса Triangle.
 *
 * @author Magnum
 */
class Shapes {
    public static void main(String args[]) {
        Triangle2 t1 = new Triangle2();
        Triangle2 t2 = new Triangle2();

        t1.setWidth(4.0);
        t1.setHeight(4.0);
        t1.style = "закрашеный";

        t2.setWidth(8.0);
        t2.setHeight(12.0);
        t2.style = "контурный";

        System.out.println("информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("площадь " + t1.area());

        System.out.println();

        System.out.println("информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("площадь " + t2.area());
    }
}
