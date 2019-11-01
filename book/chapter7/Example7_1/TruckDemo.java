/*
 * Клас содержащий метод main для запуска програмы и теста класса B.
 *
 * @author Magnum
 */
class TruckDemo {
    public static void main(String[] args) {
        // создаем два грузовика
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);

        System.out.println("грузовик может перевезти: " + semi.getCargo() + " фунтов.");
        System.out.println("для преодоления " + dist + " миль грузовику нужно " + gallons + " галлонов топлива.\n");

        gallons = pickup.fuelneeded(dist);

        System.out.println("пикап может перевезти " + pickup.getCargo() + " фунтов.");
        System.out.println("для преодоления " + dist + " миль пикапу нужно " + gallons + " галлонов топлива.");
    }
}
