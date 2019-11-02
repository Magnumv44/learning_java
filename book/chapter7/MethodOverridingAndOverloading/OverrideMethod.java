/*
 * Клас содержащий метод main для запуска програмы и теста классов A и B.
 *
 * @author Magnum
 */class OverrideMethod {
    public static void main(String args[]) {
        B subOb = new B(1, 2, 3);
        B2 subOb2 = new B2(1, 2, 3);

        subOb.show();  // вызов метода для класса B скрывающего метод show() своего суперкласса
        System.out.println();
        subOb2.show(); // вызов метода для класса B2 переопределяющего метод show() своего суперкласса
    }
}
