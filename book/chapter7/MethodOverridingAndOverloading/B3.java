/*
 * Условно абстрактный класс описывающий какой-то объект.
 * Содержит свой конструктор с наследованием от суперкласса А и метод
 * перегружающий метод суперкласса.
 * Условно будет считатся подклассом.
 *
 * @version 1
 * @author Magnum
 */
class B3 extends A {
    private int k;

    public B3(int a, int b, int c) {
        super(a, b);
        this.k = c;
    }

    // метод перегружающий метод show() класса А
    public void show(String msg) {
        System.out.println(msg + this.k);
    }
}
