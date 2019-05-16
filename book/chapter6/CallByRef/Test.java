/**
 * Класс содержащий метод параметры по ссылке и изменяющий их значение.
 *
 * @author Magnuym
 */
class Test {
    public int a, b;

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /*
     Метод принимающий в качестве параметра объект.
     Переменные ob.a и ob.b у переданно объекта так же будут изменятся при вызове метода.
     */
    public void change(Test ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}