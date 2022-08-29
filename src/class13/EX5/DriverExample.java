package class13.EX5;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        Bicycle bicycle = new Bicycle();

        driver.drive( bus );
        driver.drive( taxi );
        // driver.drive( bicycle );

    }
}
