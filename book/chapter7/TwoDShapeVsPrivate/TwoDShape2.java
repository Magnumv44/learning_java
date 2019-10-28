/*
 * Класс описывающий фигуру состояющу из двух сторон.
 * Поля данного класса закрыты (private).
 * Содержит метод выводящий на экран значение сторон и
 * методы доступа к закрытым полям класса.
 * Условно будет считатся суперклассом.
 *
 * @version 3
 * @author Magnum
 */
class TwoDShape2 {
    private double width;  // зыкрытая переменная ширины
    private double height; // зыкрытая переменная высоты

    // Геттеры для переменных width и height
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Сеттеры для для переменных width и height
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Метод выводящий на экран значение сторон
    public void showDim() {
        System.out.println("ширина " + width + ", высота " + height);
    }
}
