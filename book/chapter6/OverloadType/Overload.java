/*
 * Программа демонстрирующая как проиходит перегрузка методов.
 * Автоматическое преобразование типов может влиять на выбор
 * перегружаемого метода.
 *
 * @author Magnum
 */
class Overload {
    public void f(int x) {
        System.out.println("Внутри метода f(int): " + x);
    }

    public void f(double x) {
        System.out.println("Внутри метода f(double): " + x);
    }
}
