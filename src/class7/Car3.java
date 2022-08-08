package class7;

public class Car3 { // 클래스 선언
    // 1. 필드
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;
    // 2. 생성자 = 클래스 이름과 동일!!! [ 여러개 = 생성자 오버로딩 ]
    Car3(){ }  // 1. 빈생성자 [ 매개변수x ]
    Car3(String model){   // 2. 매개변수 1개( 외부에서 들어오는 데이터 ) 생성자
        this.model = model;
        // 클래스 내부의 필드 명과 매개변수 이름과 동일하면 오류발생
        // 클래스 내부의 필드 명시 : this.필드명
    }
    Car3( String model , String color ){ // 3. 매개변수 2개 생성자
        this.model = model;
        this.color = color;
    }
    Car3( String model , String color , int maxSpeed ){ // 4. 매개변수 3개 생성자
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }


    // 3. 메소드

}// 클래스 end
