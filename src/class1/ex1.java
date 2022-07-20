package class1; // 패키지명

public class ex1 { // 클래스 선언 // 클래스 안에서 코드 작성하자

    // 실행은 main함수 안에서 작성하자 [ main 엔터 ]
    public static void main(String[] args) { // main함수 시작

        /*
            1. 출력 명령어 [ 자동완성  sout ]
                 1. System : 시스템 클래스 [ 입·출력 관련 클래스 ]
                 (  * 클래스명은 첫글자는 대문자 )
                2.   .  : 접근연산자[ 해당 코드로 이동 ]
                3. out : 출력 함수
                4. print(); : console 출력하는 함수
                4. println(); : 출력후 줄바꿈 처리

            2. 제어문자  [ \ : 백슬래시 - 엔터 위에 원화기호 ]
                \n  :  줄바꿈
                \t  : 탭( 5칸 이동 );
                \r  : 개행( 커서를 앞으로 이동 )
                \\  : \
                \"  : "
                  기능이 있는 특수문자 출력시 앞에\ 사용하면 출력가능
         */
        System.out.print("안녕하세요"); // 출력
        System.out.print("하하하하하"); // 출력

        System.out.println("안녕하세요2"); // 출력후 줄바꿈처리
        System.out.println("하하하하하2"); // 출력후 줄바꿈처리

        // 1. 제어문자
        System.out.print("제어문자사용 \n");
        System.out.print("제어문자사용 \\");
        System.out.println("특수문자 출력 \" ");
        System.out.println("특수문자 출력 \' ");
        System.out.println("문자1"+"문자2");    // + 연결연산자
        System.out.println("문자1 \t 문자2");

    }// main함수 끝
} // 클래스 끝
