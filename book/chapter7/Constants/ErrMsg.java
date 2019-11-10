/*
 * Класс ErrMsg.
 * Сожержит  именованные константы и массив строк msgs[] в котором хранят коды ошибок и метод getErrorMsg()
 * возвращающий объект типа String описывающий произошедшую ошибку и выводящий ее на экран.
 *
 * @version 2
 * @author Magnum
 */
class ErrMsg {
    // Константы, перменные не меняющие свое значение и содержат коды ошибко программы
    public final int OUTERR = 0;
    public final int INERR = 1;
    public final int DISKERR = 2;
    public final int INDEXERR = 3;

    // Массив с описанием ошибок
    private String msgs[] = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутсвует место на диске",
            "Выход индекса за граицы диапазона"
    };

    // Метод отобразающий код ошибки
    public String getErrorMsg(int i) {
        if (i >= 0 & i < msgs.length) {
            return msgs[i];
        } else {
            return "Несуществующий код ошибки";
        }
    }
}
