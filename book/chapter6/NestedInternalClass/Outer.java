/*
 * Клас реализующий демонстрирующий создание внутреннего класса.
 *
 * @author Magnum
 */
class Outer {
    private int nums[];

    Outer(int n[]) {
        nums = n;
    }

    public void analyze() {
        /* Без создания объкта класса Inner во внешнем классе Outer
           доступ к его методам невозможен!
         */
        Inner inOb = new Inner();

        System.out.println("Минимальное значение: " + inOb.min());
        System.out.println("Максимальное значение: " + inOb.max());
        System.out.println("Среднее значение: " + inOb.avg());
    }

    // Вложенный класс
    class Inner {
        public int min() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++)
                if (nums[i] < m) m = nums[i];

            return m;
        }

        public int max() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++)
                if (nums[i] > m) m = nums[i];

            return m;
        }

        public int avg() {
            int a = 0;
            for (int i = 0; i < nums.length; i++)
                a += nums[i];

            return a / nums.length;
        }
    }
}
