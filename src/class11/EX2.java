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

/*

자바 특징
	- 100% 객체지향 언어
	- 다형성
객체 지향
	- 객체[모듈] 단위 개발
객체
	- 클래스로 부터 메모리 할당 받은 변수(데이터1개)
	- 설계도[클래스] 동일하지만 서로 다른 객체(형태) 생성
클래스
	- 설계도 [ 미리 작성된 구성 . 1.필드 2.생성자 3.메소드 ]
상속
	- 클래스 연장선 [ extends ]
	- 하위클래스 상속받은 상위클래스의 멤버[필드,생성자,메소드] 물려받기[ 사용 ]
오버라이딩
	- 부모로부터 물려받은 메소드를 재정의[수정]
다형성
	- 다양한 형태 : 하나의 객체의 다양한 클래스로부터 메모리 할당
	- 부모 클래스에 자식 클래스를 넣어줄수 있다.[  자식 -> 부모 ]	고양이는 동물이다.     //  [ 부모 -> 자식 ] 동물은 고양이이다.

	예) 붕어빵
		붕어빵 틀 [ 클래스 ]
			붕어빵 [ 객체1 ]
			붕어빵 [ 객체2]
	예) 타이어				------상속----->  한국타이어
		타이어 [ 클래스 ]
			앞왼쪽 타이어 [ 객체1 ]	  ---> 한국/금호 타이어 객체 로 변환 가능
			앞오른쪽 타이어 [ 객체2 ]  ---> 한국/금호 타이어 객체 로 변환 가능
			뒤왼쪽 타이어 [ 객체3 ]  ---> 한국/금호 타이어 객체 로 변환 가능
			뒤오른쪽 타이어 [ 객체4 ]  ---> 한국/금호 타이어 객체 로 변환 가능

					------상속-----> 금호타이어












 */
