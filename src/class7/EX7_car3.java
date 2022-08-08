package class7;

public class EX7_car3 {

    public static void main(String[] args) {

        // 1. 빈생성자로 객체 생성
        Car3 car1 = new Car3();
            car1.model = "택시";
            car1.color = "검정";
            car1.maxSpeed = 200;

        // 2. 매개변수1개 생성자 객체 생성
        Car3 car2 = new Car3("자가용");

        // 3. 매개변수2개 생성자 객체 생성
        Car3 car3 = new Car3("자가용","빨강");

        // 4. 매개변수3개 생성자 객체 생성
        Car3 car4 = new Car3("택시",
                "검정", 200);


    }

}
