package class13.EX4;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.run();
        // 타이어 교체
        myCar.frontLeftTire = new KumhoTire();
        myCar.frontRightTire = new KumhoTire();
        myCar.run();
    }
}
