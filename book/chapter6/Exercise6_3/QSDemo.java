/*
 * Клас содержащий метод main для запуска програмы и теста класа Quicksort.
 * Демонстрирует быструю сортировку символьного массива.
 *
 * @author Magnum
 */
class QSDemo {
    public static void main(String args[]) {
        char a[] = { 'd', 'x', 'a', 'r', 'p', 'j', 'i' };
        int i;

        System.out.print("исходный массив: ");
        for(i=0; i < a.length; i++)
            System.out.print(a[i]);

        System.out.println();

        // Вызываем метод быстрой сортировки и передаем ему в качестве аргумента созданный массив символов "a"
        Quicksort.qsort(a);

        System.out.print("отсортированный массив: ");
        for(i=0; i < a.length; i++)
            System.out.print(a[i]);
    }
}
