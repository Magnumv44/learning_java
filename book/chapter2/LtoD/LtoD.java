/*
 * Демонстрация автоматического преобразования типа long в тип double
 */
class LtoD {
	public static void main(String[] args) {
		long L;
		double D;

		L = 100123285L;
		D = L; // Автоматическое преобразование long в double
		//L = D; выдаст ошибку!! так как нельзя преобрзовать double в long
		
		System.out.println("L и D: " + L + " " + D);
	}
}