/*
 * Класс для создания условной библиотеки книг.
 * Демонстрирует работу с двумя классами в одном пакете
 * без модификаторов доступа у конструктора и метода.
 *
 * @author Magnum
 */

package bookpack;

class Book {
    private String title;
    private String author;
    private int pubDate;

    /*
      модификатор доступа public не указан, по этому данный констуктор
      будет доступен только в этом пакете.
     */
    Book(String title, String author, int pubDate) {
        this.title = title;
        this.author = author;
        this.pubDate = pubDate;
    }

    /*
      модификатор доступа public не указан, по этому данный констуктор
      будет доступен только в этом пакете.
     */
    void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}
