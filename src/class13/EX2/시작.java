package class13.EX2;

import java.util.Scanner;

public class 시작 {
    public static Scanner scanner = new Scanner(System.in);
    public static  오락기 오락기 = null; // 인터페이스 변수 선언
    public static void 게임시작( ){ // 게임시작 start
        while ( true ){
            String 버튼 = scanner.next();
            if( 버튼.equals("A") ){ 오락기.A버튼(); }
            if( 버튼.equals("B") ){ 오락기.B버튼(); }
            if( 버튼.equals("C") ){ 오락기.C버튼(); }
            if( 버튼.equals("D") ){ 오락기.D버튼(); }
            if( 버튼.equals("X") ){  System.out.println("게임종료"); break;}
        } // whiile end
    } // 게임시작 end
    public static void main(String[] args) { // main start
        while (true){
            System.out.println("게임선택 : 1. 축구 2.비행기 3.격투 : ");
            int ch = scanner.nextInt();
            // 인터페이스에 구현객체 대입
            if( ch == 1 ){   System.out.println("축구게임 시작"); 오락기 = new 축구게임();   게임시작();}
            else if( ch == 2 ){ System.out.println("비행기게임 시작");  오락기 = new 비행기게임(); 게임시작();}
            else if( ch == 3 ){  System.out.println("격투게임 시작");   오락기 = new 격투게임();   게임시작(); }
            else {  System.out.println("알수 없는 게임 번호 입니다."); }
        }// while end
    } // main end
} // class end
