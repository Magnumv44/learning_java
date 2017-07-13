/*
 * Неожиданный результат повышения типов
 */
class PromDemo {
	public static void main(String[] args) {
		byte b;
		int i;

		b = 10;
		i = b * b; //приведение типов не требуется, так как тип уже повышен до int

		b = 10;
		b = (byte) (b * b);

		System.out.println("i and b: " + i + " " + b);
	}
}