package class8;

public class EX1_Calcultor {
    public static void main(String[] args) {
        // 1. 객체 선언[ 클래스명 객체명 = new 생성자명() ]
        Calculator myCalc = new Calculator();
        // 2. 객체를 이용한 함수 호출 [ 객체명.함수명( ) ]
        myCalc.powerOn();   // 인수X 반환X

        // 3. 인수o반환o 함수 호출 [ 인수 : 5,6 ]
            // 함수 실행후 반환된 값을 result1 변수에 저장
        int result1 = myCalc.plus( 5 , 6 );
        System.out.println(" result1 : " + result1 );

        // 4. 인수o반환o 함수 호출 [ 인수 : 10 , 4 ]
            // 함수 실행후 반환된 값을 result2 변수에 저장
        byte x = 10;
        byte y = 4;
        double result2 = myCalc.divide( x , y );
        System.out.println(" result2 : " + result2 );

        // 5. 인수x반환x
        myCalc.powerOff();


    }
}
