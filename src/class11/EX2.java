package class11;

public class EX2 {

    public static void main(String[] args) {
        // 1. 객체 선언
        Car car = new Car(); // car 안에 tire 객체 4개
        // 2. 자동차 5번 회전
        for( int i = 1 ; i<=5 ; i++ ){ // i는 1 부터 5까지 1씩 증가반복 [ 5번 반복 ]
            int problemLocation = car.run();
            // 펑크 위치

            if( problemLocation == 1 ){
                System.out.println("앞왼쪽 한국타이어로 교체");
                car.frontLeftTire = new HankookTire("앞왼쪽" , 15);
            }else if( problemLocation == 2 ){
                System.out.println("앞오른쪽 한국타이어로 교체");
                // 클래스의 다형성 특징!!!
                    // 원래는 앞오른쪽 타이어는 tire 객체 이지만 hankooktire 변경 가능
                car.frontRightTire = new HankookTire("앞오른쪽",13);
            }else if( problemLocation == 3 ){
                System.out.println("뒤왼쪽 금호타이어 교체");
                car.backLeftTire = new KumhoTire("뒤왼쪽" , 14);
            }else if( problemLocation == 4 ){
                System.out.println("뒤오른쪽 금호타이어 교체");
                car.backRightTire = new KumhoTire("뒤오른쪽" , 17);
            } // else if end
        } // for end
    } // main end
} // class end
