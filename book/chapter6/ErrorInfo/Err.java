/**
 * Класс в котором инкапсулирубтся код ошибки и ее описание.
 *
 * @author Magnum
 */
class Err {
    private String msg;   // сообщение об ошибке
    private int severity; // уровень серьезности ошибки

    public Err(String msg, int severity) {
        this.msg = msg;
        this.severity = severity;
    }

    public String getMsg() {
        return msg;
    }

    public int getSeverity() {
        return severity;
    }
}