/*
 * Клас содержащий метод main для запуска програмы и теста класса Triangle.
 *
 * @version 8
 * @author Magnum
 */
class Shapes {
    public static void main(String[] args) {
        TwoDShape shapes[] = new TwoDShape[5];

        shapes[0] = new Triangle("контурный", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle(7.0);
        shapes[4] = new TwoDShape(10, 20, "фигура");

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("объект " + shapes[i].getName());
            System.out.println("площадь " + shapes[i].area());
            System.out.println();
        }
    }
}
