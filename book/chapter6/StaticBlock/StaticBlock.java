/*
 * Клас деменстрирующий создание статических блоков.
 *
 * @author Magnum
 */
class StaticBlock {
    private static double rootOf2;
    private static double rootOf3;

    static {
        System.out.println("Внутри статического блока");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }

    public StaticBlock(String msg) {
        System.out.println(msg);
    }

    public static double getRootOf2() {
        return rootOf2;
    }

    public static double getRootOf3() {
        return rootOf3;
    }
}