package class7;

public class EX3_car {

    public static void main(String[] args) {

        // 1. 객체 생성 [ 클래스명 객체명 = new 생성자() ]
        Car myCar = new Car();

        // 2. 객체의 필드 호출 [ 객체명.필드명 ]
        System.out.println("제작회사 : " + myCar.company);
        System.out.println("모델명 : " + myCar.model);
        System.out.println("색깔 : " + myCar.color);
        System.out.println("최고속도 : " + myCar.maxSpeed);
        System.out.println("현재속도 : " + myCar.speed );
        // 3. 객체의 필드 값 수정
        myCar.speed = 60;
        System.out.println("현재속도 : " + myCar.speed);


    }

}
