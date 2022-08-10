package class8;

public class Calculator { // 클래스 선언
    // * 클래스의 멤버
    // 1. 필드 : 데이터 저장하는 곳

    // 2. 생성자 : 객체생성시 초기값

    // 3. 메소드=함수 : 미리 정의된 코드
        // 1. 반환타입 2. 메소드이름 3.매개변수 4.실행코드
    // 1.반환X 매개변수X
    void powerOn(){
        System.out.println("전원을 켭니다.");
    }
    // 2. 반환O = int 매개변수O = int x , int y
    int plus( int x , int y ){
        int result = x + y ;
        return result; // 함수 반환 값 = return
    }
    // 3. 반환O = double 매개변수O = int x , int y
    double divide( int x , int y ){
        double result = (double) x/(double) y;
        return result;
    }
    // 4. 반환X 매개변수X
    void powerOff(){
        System.out.println("전원을 끕니다.");
    }

}// 클래스 끝
