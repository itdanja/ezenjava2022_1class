package class2; // 패키지명

import java.util.Scanner;

public class ex1 { // 클래스 시작
//public : 사용범위( 모든곳에서 호출 가능 )
//class : 클래스 선언 명령어
    // { } 마다 tab 이용한 들여쓰기 구분
    public static void main(String[] args) { // main start
        // main : 코드를 읽어주는 함수

        // 1.입력 객체 선언 [ 한번만 선언 ]
        Scanner scanner = new Scanner(System.in);
        // 2. 입력 받기전 메시지 알리기
        System.out.println("----- 회원가입 창 -----");
        // 3. 입력된 데이터를 문자열에 저장
        System.out.print("아이디 : " );
        String 아이디 = scanner.next();    // next() : 입력된 데이터를 String 호출
        System.out.print("비밀번호(숫자4자리) : ");
        short 비밀번호 = scanner.nextShort(); // nextShort : 입력된 데이터를 short 호출
        System.out.print("입금액 : ");
        int 예금액 = scanner.nextInt();    // nextInt() : 입력된 데이터를 int형으로 호출
        System.out.print("성별(남:true 여:false) : ");
        boolean 성별 = scanner.nextBoolean();
        System.out.print("해지 여부( y / n ) : " );
        char 해지 = scanner.next().charAt(0); // nextChar() : 없다
            // charAt(0) : 문자열에서 첫번째 문자 호출
        // 확인 : 저장된 변수를 호출
        System.out.println("----- 회원가입 결과 -----");
        System.out.println(" 아이디 : " + 아이디 );
        System.out.println(" 비밀번호 : " + 비밀번호 );
        System.out.println(" 예금액 : " + 예금액 + "원");
        System.out.println(" 성별(남:true 여:false) : "+ 성별 );
        System.out.println(" 해지여부( y / n ) : " + 해지);
    } // main end

}// 클래스 끝
