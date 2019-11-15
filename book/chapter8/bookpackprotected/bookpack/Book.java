/*
 * Класс для создания условной библиотеки книг.
 * Демонстрирует работу с двумя классами в одном пакете
 * с использованием модифкаторов доступа public у конструктора и метода,
 * и protected вместо public у переменных.
 * Условно будет считатся суперклассом.
 *
 * @version 3
 * @author Magnum
 */

package bookpackprotected.bookpack;

public class Book { // модификатор доступа public дает доступ к классу за пределами его пакета
    /*
       переменные объявлены с модификатором доступа protected дающего доступ к ним
       всем классам внутри пакета, и всем без исключения классам наследуемым от этого класса
       независимо от пакета.
     */
    protected String title;
    protected String author;
    protected int pubDate;

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
