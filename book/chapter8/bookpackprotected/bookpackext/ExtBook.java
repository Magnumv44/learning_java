/*
 * Класс наследуемый от класса Book из пакета bookpackprotected.bookpack.
 * Демонстрирует наледование от класса находящегося в другом пакете и содержащего
 * поля с модификатором доступа protected.
 * Условно будет считатся подклассом.
 *
 * @author Magnum
 */
package bookpackprotected.bookpackext;

class ExtBook extends bookpackprotected.bookpack.Book {
    private String publisher;

    public ExtBook(String t, String a, int d, String p) {
        super(t, a, d); // вызов конструктора суперкласса

        this.publisher = p;
    }

    @Override
    public void show() {
        super.show(); // вызов метода суперкласса

        System.out.println(publisher);
        System.out.println();
    }

    // геттер для переменной класса
    public String getPublisher() {
        return publisher;
    }

    // сеттер для переменной класса
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /*
      Переопределеям геттеры и сеттеры суперкласса это допустимо,
      так как подкласс имеет к ним доступ.
    */
    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public int getPubDate() {
        return pubDate;
    }

    public void setPubDate(int d) {
        pubDate = d;
    }
}
