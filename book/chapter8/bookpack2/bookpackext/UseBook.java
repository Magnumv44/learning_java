/*
 * Класс содержащий метод main.
 * Создан для тестирования класса Book.
 * Для компиляции из командной строки
 * нужно ввести команду javac bookpack2.bookpackext/UseBook.java
 * в каталоге где находится папка bookpack2.
 *
 * @author Magnum
 */

package bookpack2.bookpackext;

class UseBook {
    public static void main(String[] args) {

        /* при создании объекта нужно указывать не только имя класса,
           а и полный пусть к пакету с классом перед названием классом
         */
        bookpack2.bookpack.Book books[] = new bookpack2.bookpack.Book[5];

        // обращаясь к конструктору класса Book, обязательно перед ним указывать путь к пакету содержащему его
        books[0] = new bookpack2.bookpack.Book("Java: Руководство для начинающих", "Schildt", 2011);
        books[1] = new bookpack2.bookpack.Book("Java: Полное руководство", "Шилдт", 2011);
        books[2] = new bookpack2.bookpack.Book("искусство программирования на Java", "Шилдт и Хоумс", 2003);
        books[3] = new bookpack2.bookpack.Book("Красный шторм поднимается", "Кленси", 1986);
        books[4] = new bookpack2.bookpack.Book("В дороге", "Керуак", 1955);

        for(int i=0; i < books.length; i++) {
            books[i].show();
        }
    }
}
