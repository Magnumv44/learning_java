/*
 * Видоизмененное упражнение 2.2 для практики
 * Отображение таблицы истинности для логических операций
 */
class LogicalOpTableHome {
	public static void main(String[] args) {
		boolean p, q;

		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

		//First string
		p = true;
		q = true;

		System.out.print(p + "\t" + q + "\t");


		if (p & q) {
			System.out.print("1\t");
		} else {
			System.out.print("0\t");
		}

		if (p | q) {
			System.out.print("1\t");
		} else {
			System.out.print("0\t");
		}
		
		if (p ^ q) {
			System.out.print("1\t");
		} else {
			System.out.print("0\t");
		}

		if (!p) {
			System.out.println("1\t");
		} else {
			System.out.println("0\t");
		}

		//Second line
		p = true;
		q = false;

		System.out.print(p + "\t" + q + "\t");

		if (p & q) {
			System.out.print("1\t");
		} else {
			System.out.print("0\t");
		}

		if (p | q) {
			System.out.print("1\t");
		} else {
			System.out.print("0\t");
		}
		
		if (p ^ q) {
			System.out.print("1\t");
		} else {
			System.out.print("0\t");
		}

		if (!p) {
			System.out.println("1\t");
		} else {
			System.out.println("0\t");
		}
		
		//Third line
		p = false;
		q = true;

		System.out.print(p + "\t" + q + "\t");

		if (p & q) {
			System.out.print("1\t");
		} else {
			System.out.print("0\t");
		}

		if (p | q) {
			System.out.print("1\t");
		} else {
			System.out.print("0\t");
		}
		
		if (p ^ q) {
			System.out.print("1\t");
		} else {
			System.out.print("0\t");
		}

		if (!p) {
			System.out.println("1\t");
		} else {
			System.out.println("0\t");
		}

		//Fourth line
		p = false;
		q = false;

		System.out.print(p + "\t" + q + "\t");

		if (p & q) {
			System.out.print("1\t");
		} else {
			System.out.print("0\t");
		}

		if (p | q) {
			System.out.print("1\t");
		} else {
			System.out.print("0\t");
		}
		
		if (p ^ q) {
			System.out.print("1\t");
		} else {
			System.out.print("0\t");
		}

		if (!p) {
			System.out.println("1\t");
		} else {
			System.out.println("0\t");
		}
	}
}