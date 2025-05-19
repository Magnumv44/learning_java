package space.magnum.examples.KbIn;

/**
 * Приклад програми, що зчитує символи введені користувачем з клавіатури.
 */
class KbIn {
    public static void main(String args[])
            throws java.io.IOException {
        char ch;

        System.out.print("Введіть символ з клавіатури, а потім натисніть ENTER: ");

        ch = (char) System.in.read(); //Отримуємо символ з клавіатури

        System.out.println("Ви ввели символ: " + ch);
    }
}