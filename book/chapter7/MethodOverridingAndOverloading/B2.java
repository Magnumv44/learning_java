/*
 * Условно абстрактный класс описывающий какой-то объект.
 * Содержит свой конструктор с наследованием от суперкласса А и метод
 * переоределяющий метод суперкласса.
 * Условно будет считатся подклассом.
 *
 * @version 2
 * @author Magnum
 */
class B2 extends A {
    private int k;

    public B2(int a, int b, int c) {
        super(a, b);
        this.k = c;
    }

    // метод переопределяющий метод show() класса А
    @Override
    public void show() {
        super.show(); // вызов меотда суперкласса для соблюдения переопределения
        System.out.println("k: " + this.k);
    }
}
