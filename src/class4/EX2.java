package class4;

import java.util.Scanner;

public class EX2 { // C S
    public static void main(String[] args) {

        /*
        로그인 프로그램
            조건 : 아이디가 admin 이고 비밀번호가 1234 이면
                  로그인 성공 아니면 로그인 실패
            조건2 : 로그인 3번 실패시 프로그램 종료
         */

        // 1. 입력객체
        Scanner scanner = new Scanner(System.in);
        // 3. 입력받은 변수 비교연산
        // if ( 아이디 == "admin" ){ // 만약에 입력받은 아이디 가 admin 이면
            // String : 자료형이 아닌 클래스(객체)는 연산자( == != > < <= >=)이 불가능
            // int / double : 자료형은 연산이 가능
            // 비교 [ 자료형 ==  vs 클래스 .equals( ) ]
        for( int i = 1 ; i<=3 ; i++ ) { // i가 1부터 3까지 1씩증가 [ 3번 반복 ]
            // 2. 아이디 / 비밀번호 입력받기
            System.out.print("아이디 : "); String 아이디 = scanner.next();
            System.out.print("비밀번호 : "); String 비밀번호 = scanner.next();
            if (아이디.equals("admin")) {
                System.out.println("안내) 동일한 아이디가 있습니다.");
                //if( 비밀번호 == "1234"){ // 만약에 입력받은 비밀번호가 1234 이면
                if (비밀번호.equals("1234")) {
                    System.out.println("안내) 동일한 비밀번호 입니다.");
                    System.out.println("안내) 로그인성공");
                    break; /* 반복문 강제로 탈출하기 */
                } else { // 비밀번호가 1234 가 아니면
                    System.out.println("안내) 동일한 비밀번호가 아닙니다.");
                    System.out.println("안내) 로그인실패");
                }
            } else { // 아이디가 admin 이 아니면
                System.out.println("안내) 동일한 아이디가 없습니다.");
                System.out.println("안내) 로그인 실패");
            } // if end
        } // for end


    } // M E
} // C E









