/*
 * Клас содержащий метод main для запуска програмы и теста класа StaticDemo.
 * Демонстрирует использование переменных помеченных как static.
 *
 * @author Magnum
 */
class SDemo {
    public static void main(String args[]) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        // У каждого объкта своя переменная x
        ob1.x = 10;
        ob2.x = 20;
        System.out.println("Разумеется, ob1.x and ob2.x " +
                "независимы.");
        System.out.println("ob1.x: " + ob1.x +
                "\nob2.x: " + ob2.x);
        System.out.println();

        // Оба объкта будут использовать одну и ту же переменную Y с одним и тем же значением
        System.out.println("Статическая переменная \"y\" общая");
        System.out.println("Присваеваем StaticDemo.y значение 19");
        StaticDemo.y = 19;

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();

        System.out.println("Присваеваем StaticDemo.y значение 100");
        StaticDemo.y = 100;

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
    }
}
