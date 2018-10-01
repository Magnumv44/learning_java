/*
 * Программа демонстрирующая отображение битов составляющих байт с помощью порозрядной проверки каждого бита.
 *
 * @author Magnum
 */
class ShowBits {
	public static void main(String[] args) {
		byte val = 123;

		for (int t = 128; t > 0; t = t / 2) {
			if ((val & t) != 0) {
				System.out.print("1 ");
			} else {
				System.out.print("0 ");
			}
		}
	}
}