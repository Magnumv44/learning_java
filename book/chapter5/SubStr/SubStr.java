/*
 * Программа демонстрирующая работу метода substring().
 *
 * @author Magnum
 */
class SubStr {
	public static void main(String[] args) {
		String orgstr = "Java - двигатель интернета.";

		// формируем подстроку
		String substr = orgstr.substring(7, 44);

		System.out.println("orgstr: " + orgstr);
		System.out.println("substr: " + substr);
	}
}