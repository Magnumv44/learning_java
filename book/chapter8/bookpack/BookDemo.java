/*
 * Класс содержащий метод main.
 * Создан для тестирования класса Book.
 * Для компиляции нужно ввести команду javac bookpack/BookDemo.java
 * в каталоге перед какталогом bookpack.
 *
 * @author Magnum
 */

package bookpack;

class BookDemo {
    public static void main(String[] args) {
        Book books[] = new Book[5];

        books[0] = new Book("Java: Руководство для начинающих", "Schildt", 2011);
        books[1] = new Book("Java: Полное руководство", "Шилдт", 2011);
        books[2] = new Book("искусство программирования на Java", "Шилдт и Хоумс", 2003);
        books[3] = new Book("Красный шторм поднимается", "Кленси", 1986);
        books[4] = new Book("В дороге", "Керуак", 1955);

        for(int i=0; i < books.length; i++) {
            books[i].show();
        }
    }
}
