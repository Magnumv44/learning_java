/*
 * Клас реализующий демонстрирующий создание внутреннего класса.
 * Область действия внутреннего класса ограничена областью действия блока кода
 * а не внешнего класса.
 *
 * @author Magnum
 */
class LocalClassDemo {
    public static void main(String args[]) {

        // Внутрення версия класса ShowBits
        class ShowBits {
            int numbits;

            ShowBits(int n) {
                numbits = n;
            }

            void show(long val) {
                long mask = 1;

                // Сдвиг влево для установки еденицы в нужной позиции
                mask <<= numbits - 1;

                int spacer = 0;
                for (; mask != 0; mask >>>= 1) {
                    if ((val & mask) != 0) System.out.print("1");
                    else System.out.print("0");
                    spacer++;
                    if ((spacer % 8) == 0) {
                        System.out.print(" ");
                        spacer = 0;
                    }
                }
                System.out.println();
            }
        }


        for (byte b = 0; b < 10; b++) {
            ShowBits byteval = new ShowBits(8);

            System.out.print(b + " в двоичном представлении: ");
            byteval.show(b);
        }
    }
}
