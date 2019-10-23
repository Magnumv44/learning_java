/*
 * Клас деменстрирующий создание статических методов.
 *
 * @author Magnum
 */
class StaticMeth {
    private static int val = 1024; // статическая переменная

    public static void setVal(int val) {
        StaticMeth.val = val;
    }

    public static int getVal() {
        return val;
    }

    // статический метод
    public static int valDiv2() {
        return val / 2;
    }
}
