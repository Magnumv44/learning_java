/*
 * Клас содержащий метод main для запуска програмы и теста класа StaticMeth.
 * Демонстрирует использование методов помеченных как static.
 *
 * @author Magnum
 */
class StaticMethDemo {
    public static void main(String args[]) {

        System.out.println("Значение val " + StaticMeth.getVal());
        System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2());

        StaticMeth.setVal(4);
        System.out.println("Значение val " + StaticMeth.getVal());
        System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2());
    }
}
