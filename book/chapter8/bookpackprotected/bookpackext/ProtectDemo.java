/*
 * Класс содержащий метод main.
 * Создан для тестирования класса ExtBook.
 * Для компиляции из командной строки
 * нужно ввести команду javac bookpackprotected/bookpackext/ProtectDemo.java
 * в каталоге где находится папка bookpackprotected.
 *
 * @author Magnum
 */
package bookpackprotected.bookpackext;

class ProtectDemo {
    public static void main(String args[]) {
        ExtBook books[] = new ExtBook[5];

        books[0] = new ExtBook("Java: Руководство для начинающих", "Шилдт", 2011, "McGraw-Hill");
        books[1] = new ExtBook("Java: Полное руководство", "Шилдт", 2011, "McGraw-Hill");
        books[2] = new ExtBook("искусство программирования на Java", "Шилдт и Хоумс", 2003, "McGraw-Hill");
        books[3] = new ExtBook("Красный шторм поднимается", "Кленси", 1986, "Putnam");
        books[4] = new ExtBook("В дороге", "Керуак", 1955, "Викинг");

        for(int i=0; i < books.length; i++) books[i].show();

        // Осуществляем поиск книг по автору
        System.out.println("Показываем все книги Шилдта:");
        for(int i=0; i < books.length; i++) {
            if (books[i].getAuthor() == "Шилдт") {
                System.out.println(books[i].getTitle());
            }
        }

        /*
          Ошибка, доступ к переменной напрямую без использования сеттера запрещен,
          поскольку класс ProtectDemo не наследуется от класса Book.
         */
        //books[0].title = "test title";
    }
}
