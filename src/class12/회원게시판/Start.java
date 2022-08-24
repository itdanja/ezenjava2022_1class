package class12.회원게시판;

import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        while( true ){ // 무한루프
            Scanner scanner = new Scanner(System.in); // 입력객체
            System.out.println("------------ 메인 페이지 -------------");
            System.out.print("1.로그인 2.회원가입   선택) : ");
            try { // 만약에 try 괄호 안에서 오류 발생을 안했을때 -> 정상 실행
                int ch = scanner.nextInt(); // .nextInt() : 정수 입력받기 -> 만약에 문자 입력시 오류 발생
                if (ch == 1) { 로그인(); }    // 1번 입력시 로그인 함수 호출
                else if (ch == 2) {  회원가입(); }  // 2번 입력시 회원가입 함수 호출
                else{  System.out.println("안내) 알수 없는 번호입니다."); }
            } // try end
            catch (Exception e ){ // 만약에 try 괄호 안에서 오류 발생시 -> catch 이동
                System.out.println("안내) 숫자 로 입력해주세요 ");
            } // catch end
        } // w end
    } // m end
    public static void 로그인(){
        System.out.println("------------ 로그인 페이지 -------------");
    }
    public static void 회원가입(){
        System.out.println("------------ 회원가입 페이지 -----------");
    }



} // c end
