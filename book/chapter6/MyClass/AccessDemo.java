/*
 * Клас содержащий метод main для запуска програмы и теста класа MyClass.
 *
 * @author Magnum
 */
class AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        /*
         Доступ к переменной alpha можно осуществить только с помощью специальных методов
         getAlpha и setAlpha (геттер и сеттер)
         */
        ob.setAlpha(-99);
        System.out.println("ob.setAlpha:  " + ob.getAlpha());

        /*
         Обращатся к переменной alpha как показано ниже нельзя!
         Будет ошибка - закрытая переменная.
         */
        //ob.alpha = 10;

        /*
         Обращение к переменным beta и gamma без геттеров и сеттеров допустимы,
         так как эти переменные открыты (то есть public)
         */
        ob.beta = 88;
        ob.gamma = 99;

        System.out.println("ob.beta: " + ob.beta);
        System.out.println("ob.gamma: " + ob.gamma);
    }
}