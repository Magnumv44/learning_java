/*
 * Класс для создания условной библиотеки книг.
 * Демонстрирует работу с двумя классами в одном пакете.
 *
 * @version 2
 * @author Magnum
 */

package bookpack2.bookpack;

public class Book {
    private String title;
    private String author;
    private int pubDate;

    // модификатор доступа public указан для работы второго примера из гравы 8
    public Book(String title, String author, int pubDate) {
        this.title = title;
        this.author = author;
        this.pubDate = pubDate;
    }

    // модификатор доступа public указан для работы второго примера из гравы 8
    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}
