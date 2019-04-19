/**
 * Класс CallByValue.
 * Демонтрирующий, что значение переменных не меняется если их передвать в качестве параметров метода
 * по значению.
 *
 * @author Magnum
 */
class CallByValue {
    public static void main(String[] args) {
        Test test = new Test();
        int a = 15, b = 20;

        System.out.println("Значение переменных a и b до вызова метода noChange у объекта ob класса Test: "
                           + a + " " + b);

        test.noChange(a, b);

        System.out.println("Значение переменных a и b после вызова метода noChange у объекта ob класса Test: "
                + a + " " + b);
    }
}