/**
 * Класс CallByValue.
 * Демонтрирующий, что значение меняются во всем коде, если они передаются по ссылке.
 *
 * @author Magnum
 */
class CallByref {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);

        System.out.println("Значение переменных ob.a и ob.b перед вызовом метода change: " + ob.getA() + ", " + ob.getB());

        ob.change(ob);

        System.out.println("Значение переменных ob.a и ob.b после вызова метода change: " + ob.getA() + ", " + ob.getB());
    }
}