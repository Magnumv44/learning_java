/*
 * Клас содержащий метод main для запуска програмы и теста класса Triangle.
 *
 * @version 8
 * @author Magnum
 */
class Shapes {
    public static void main(String[] args) {

        /* Не смотря на то, что класс TwoDShape является абстрактным мы
           объявляем его объект как массив ссылок для содержания ссылок
           на объекты подклассов, по этому ошибки не вызовет и пройдет компиляцию
         */
        TwoDShape shapes[] = new TwoDShape[4];

        shapes[0] = new Triangle("контурный", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle(7.0);
        // shapes[4] = new TwoDShape(7.0); // неьзя обявить объект абстрактного класса

        for(int i=0; i < shapes.length; i++) {
            System.out.println("объект " + shapes[i].getName());
            System.out.println("площадь " + shapes[i].area());

            System.out.println();

        }
    }
}
