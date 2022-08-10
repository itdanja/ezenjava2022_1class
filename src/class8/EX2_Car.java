package class8;

public class EX2_Car {

    public static void main(String[] args) {
        // 1. 객체  선언
        Car myCar = new Car();

        // 2. 메소드 호출
        myCar.setGas( 5 );

        // 3. 메소드 호출
        boolean gasState = myCar.isLeftGas();
        if( gasState ){
            System.out.println("출발합니다.");
            myCar.run();
        }

        // 4. 메소드 호출
        if( myCar.isLeftGas() ){
            System.out.println("gas를 주입할 필요가 없습니다.");
        }else{
            System.out.println("gas를 주입하세요");
        }


    }

}
