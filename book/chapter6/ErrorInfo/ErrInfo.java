/**
 * исполняемы класс демонстрирующий работу программы.
 *
 * @author Magnum
 */
class ErrInfo {
    public static void main(String[] args) {
        ErrorInfo err = new ErrorInfo();
        Err e;

        e = err.getErrorInfo(2);
        System.out.println(e.getMsg() + " уровень: " + e.getSeverity());

        e = err.getErrorInfo(19);
        System.out.println(e.getMsg() + " уровень: " + e.getSeverity());
    }
}