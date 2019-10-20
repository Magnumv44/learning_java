/*
 * Клас содержащий метод main для запуска програмы и теста класа Overload.
 *
 * @author Magnum
 */
class TypeConv {
    public static void main(String args[]) {
        Overload ob = new Overload();

        int i = 10;
        double d = 10.1;

        byte b = 99;
        short s = 10;
        float f = 11.5F;

        // Вызов метода ob.f(int)
        ob.f(i);

        // Вызов метода ob.f(double)
        ob.f(d);

        // Вызов метода ob.f(int) с преобразованием типов
        ob.f(b);

        // Вызов метода ob.f(int) с преобразованием типов
        ob.f(s);

        // Вызов метода ob.f(double) с преобразованием типов
        ob.f(f);
    }
}