//  P.38   : 주석 [ 설명달기-메모-컴파일에서 제외 코드 ]
    //   -- 강의간 모든 코드에는 주석
    //  : 한줄주석
    /*  여러주석  */
package class1; // 현재 파일(CLASS)의 패키지(폴더)위치

public class page31{ //
//// public : 전범위 에서 사용가능 명령어
//// class : 클래스 선언 명령어
//// page31 : 클래스이름( 아무거나 정의 )
//// {  : 클래스의 시작 알림
//// } : 클래스의 끝 알림
//    // 모든곳에서 사용되는 pge31 이라는 이름으로 클래스 선언했다.

    // 1. 모든 코드는 클래스 안에서 작성한다.

    public static void main(String[] args) { // main start
        // static : 우선할당
        // void : 결과 없다.
        // main : 미리 만들어진 함수
            // 코드가 가장 먼저 실행(메인스레드)되는 공간
            // 스레드 : 코드를 읽어주는 역할 ( 필수 )
        System.out.println("자바 안녕");
        // ;  : 명령어 끝 알림

    } // main end

    //  -- main 함수 밖에 있으니까 실행X
    //  System.out.println("자바 안녕2");


} // class end

