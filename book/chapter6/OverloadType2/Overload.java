/*
 * Программа демонстрирующая как проиходит перегрузка методов.
 * Автоматическое преобразование типов может влиять на выбор
 * перегружаемого метода.
 * Добавлен метод f(byte) для демонтрации выбора метода без
 * преобразования.
 *
 * @version 2
 * @author Magnum
 */
class Overload {
    public void f(byte x) {
        System.out.println("Внутри метода f(byte): " + x);
    }
    public void f(int x) {
        System.out.println("Внутри метода f(int): " + x);
    }

    public void f(double x) {
        System.out.println("Внутри метода f(double): " + x);
    }
}
