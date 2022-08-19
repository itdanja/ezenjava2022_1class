package class10.ex3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class 로그인프로그램 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 입력객체 선언
        ArrayList<Member> memberlist = new ArrayList<>(); // Member 객체를 여러개 저장할수 있는 리스트 선언
        while (true){ // 무한루프 [ 종료조건 X ]
            System.out.println("---------------------------------------");
            System.out.println("============ 회원제프로그램 ===========");
            System.out.println("-----------------------------------------");
            System.out.print(" 1. 회원가입 2.로그인 : "); int ch = scanner.nextInt();
            if( ch == 1 ){ // 회원가입 진행
                System.out.println("---------------------------------------");
                System.out.println("================ 회원가입 ==============");
                System.out.println("-----------------------------------------");
                System.out.print("안내] 1.관리자회원 2.일반회원 :"); int ch2 = scanner.nextInt();
                System.out.print("안내] 아이디 : ");     String id = scanner.next();
                System.out.print("안내] 비밀번호 : ");   String pw = scanner.next();
                if( ch2 == 1 ){ // 관리자
                    System.out.print("안내] 부서 : ");    String pm =scanner.next();
                    ADMIN admin = new ADMIN( id , pw , pm ); // 1. 객체 생성
                    memberlist.add( admin ); // 2. 리스트에 객체 저장
                }else if( ch2== 2){ // 일반회원
                    System.out.print("안내] 성명 : ");    String name = scanner.next();
                    USER user = new USER( id , pw , name ); // 1. 객체 생성
                    memberlist.add( user ); // 2. 리스트에 객체 저장
                }
                System.out.println("안내] 회원가입 성공! 축하합니다.");
            }
            else if( ch == 2 ){ }
            else{
                System.out.println("안내] 알수 없는 행동입니다. ");
            }
        } // while end
    } // main end
} // class end
