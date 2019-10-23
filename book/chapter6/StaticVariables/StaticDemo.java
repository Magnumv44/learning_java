/*
 * Клас деменстрирующий создание статических переменных.
 *
 * @author Magnum
 */
class StaticDemo {
    public int x; // обычная переменная
    public static int y; // статическая переменная

    // Метод возвратит сумму обычной и статической переменной
    public int sum() {
        return x + y;
    }
}
