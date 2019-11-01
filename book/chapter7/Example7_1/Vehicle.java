/*
 * Клас описывающий автомобили.
 * Условно будет считатся суперклассом.
 * Содержит три закрытые переменные, конструктор
 * гетте и сеттеры, метод расчета количества топлива на поедку
 * и метод возвращающий дальность поездки.
 *
 * @author Magnum
 */
class Vehicle {
    private int passengers; // количество пасажиров
    private int fuelcap;    // объем топлисного бака в галлонах
    private int mpg;        // потребление топлива в милях на галлон

    // конструктор класса
    public Vehicle(int p, int f, int m) {
        this.passengers = p;
        this.fuelcap = f;
        this.mpg = m;
    }

    // метод возвращающий дальность поездки
    public int range() {
        return mpg * fuelcap;
    }

    // метод расчета количества топлива необходимого для поездки
    public double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    // геттеры и сеттеры для переменных
    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int p) {
        this.passengers = p;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int f) {
        this.fuelcap = f;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int m) {
        this.mpg = m;
    }
}
