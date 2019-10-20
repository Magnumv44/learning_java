/*
 * Клас содержащий метод main для запуска програмы и теста класа Overload.
 *
 * @author Magnum
 */
class OverloadDemo {
    public static void main(String args[]) {
        Overload ob = new Overload();
        int resI;
        double resD;

        // Вызов метода ovlDemo() без параметров
        ob.ovlDemo();
        System.out.println();

        // Вызов метода ovlDemo() с одним параметром
        ob.ovlDemo(2);
        System.out.println();

        // Вызов метода ovlDemo() с двумя параметрами типа int
        resI = ob.ovlDemo(4, 6);
        System.out.println("Результат вызова ob.ovlDemo(4, 6): " + resI);
        System.out.println();

        // Вызов метода ovlDemo() с двумя параметрами типа double
        resD = ob.ovlDemo(1.1, 2.32);
        System.out.println("Результат вызова ob.ovlDemo(1.1, 2.2): " + resD);
    }
}
