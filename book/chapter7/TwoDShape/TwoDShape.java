/*
 * Класс описывающий фигуру состояющу из двух сторон.
 * Содержит метод выводящий на экран значение сторон.
 * Условно будет считатся суперклассом.
 *
 * @author Magnum
 */
class TwoDShape {
    public double width;  // Ширина
    public double height; // Высота

    // Метод выводящий на экран значение сторон
    public void showDim() {
        System.out.println("ширина " + width + ", высота " + height);
    }
}
