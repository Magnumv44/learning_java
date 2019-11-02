/*
 * Условно абстрактный класс описывающий какой-то объект.
 * Условно будет считатся суперклассом.
 *
 * @author Magnum
 */
class A {
    private int i, j;

    // конструктор суперкласса
    public A(int a, int b) {
        this.i = a;
        this.j = b;
    }

    // метод выводящий на экран содержимое переменных суперкласса
    public void show() {
        System.out.println("i: " + i + "\nj: " + j);
    }
}
