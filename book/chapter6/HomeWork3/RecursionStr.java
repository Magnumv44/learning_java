/*
 * Домашнее задание 3 главы 6.
 *
 * Напишите рекурсивный метод отображающий символы составляющие строку в обратном порядке.
 *
 * @author Magnum
 */
class RecursionStr {
    private String str;

    // Конструктор для создания экземпляров класса
    public RecursionStr(String s) {
        str = s;
    }

    /* Рекурсивный метод принимающий в качестве параметра начальный индекс строки.
       Дальше следующий принцип работы:
       {
        resursionStr(1);
          {
            resursionStr(2);
             {
               resursionStr(3);
                {
                 resursionStr(4);
                  {
                    resursionStr(5);
                     ...
                    print(str.charAt(5));
                  }
                 print(str.charAt(4));
                 }
                print(str.charAt(3));
               }
              print(str.charAt(2));
              }
             print(str.charAt(1));
            }
            ...
     */
    public void recursionStr(int idx) {
        if (idx != str.length() - 1) recursionStr(idx + 1);

        System.out.print(str.charAt(idx));
    }
}
