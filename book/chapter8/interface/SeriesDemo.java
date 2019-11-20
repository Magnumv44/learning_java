/*
 * Класс содержащий метод main для демонстрации работы класса By Two.
 *
 * @author Magnum
 */
class SeriesDemo {
    public static void main(String[] args) {
        ByTwos ob = new ByTwos();

        for(int i=0; i < 5; i++)
            System.out.println("Следующее значение " + ob.getNext());

        System.out.println("\nСброс");
        ob.reset();
        for(int i=0; i < 5; i++) {
            System.out.println("Следующее значение " + ob.getNext());
        }

        System.out.println("\nСтарт от 100");
        ob.setStart(100);
        for(int i=0; i < 5; i++) {
            System.out.println("Следующее значение " + ob.getNext());
        }
    }
}
