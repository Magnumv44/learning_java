/*
 * С символьными переменными можно обращатся, как с целочисленными
 */
class CharArithDemo {
	public static void main(String[] args) {
		char ch;

		ch = 'X';
		System.out.println("ch содержит " + ch);

		ch++; //инкреметировать переменную ch
		System.out.println("теперь ch содержит " + ch);

		ch = 90;
		System.out.println("теперь ch содержит " + ch);
	}
}