/*
 * Клас содержащий метод main для запуска програмы и теста класса Triangle.
 *
 * @author Magnum
 */
class Shapes {
    public static void main(String args[]) {
        ColorTriangle t1 = new ColorTriangle("синий", "контурный", 8.0, 12.0);
        ColorTriangle t2 = new ColorTriangle("красный", "закрашеный", 2.0, 2.0);

        System.out.println("информация о t1: ");
        t1.showStyle();
        t1.showDim();
        t2.showColor();
        System.out.println("площадь: " + t1.area());

        System.out.println();

        System.out.println("информация о t2: ");
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println("площадь: " + t2.area());

    }
}
