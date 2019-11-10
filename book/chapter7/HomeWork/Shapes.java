/*
 * Клас содержащий метод main для запуска програмы и теста класса Triangle.
 *
 * @version 10
 * @author Magnum
 */
class Shapes {
    public static void main(String[] args) {
        Circle cir = new Circle(0, "круг", 2);
        System.out.println("Фигура: " + cir.getName());
        System.out.println("Площадь: " + cir.area());
    }
}
