/*
 * Класс описывающий фигуру состояющу из двух сторон.
 * Содержит метод выводящий на экран значение сторон и
 * методы доступа к переменным.
 * Поля данного класса закрыты (private).
 * Сожержит свой набор конструкторов.
 * Условно будет считатся суперклассом.
 *
 * @version 5
 * @author Magnum
 */
class TwoDShape {
    private double width;  // зыкрытая переменная ширины
    private double height; // зыкрытая переменная высоты

    // Конструкторы класса
    public TwoDShape() {
        this.width = 0;
        this.height = 0;
    }

    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public TwoDShape(double x) {
        this.width = x;
        this.height = x;
    }

    // Сеттеры для для переменных width и height
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Геттеры для переменных width и height
   public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Метод выводящий на экран значение сторон
    public void showDim() {
        System.out.println("ширина " + width + ", высота " + height);
    }
}
