package space.magnum.examples.DecrFor;

/**
 * Файл класу DecrFor.
 * Демонстрація роботи циклу for зі зменшенням в умові циклу (використання від'ємних значень)
 *
 */
public class DecrFor {
    public static void main(String[] args) {
        int x;

        // допускається використання від'ємних значень в якості умови, рівно як і рух на зменшення
        for (x = 100; x> -100; x -= 5) {
            System.out.println(x);
        }
    }
}
