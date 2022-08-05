package class6;

import java.util.Scanner;

public class page161 { // class s
    public static void main(String[] args) { // main s

        boolean run = true;   // 1.boolean형 변수 선언[반복문 실행/종료 제어하기 위한 변수 ]
        int balance = 0;      // 2.int형 변수 선언 [ 금액 저장하는 변수 ]
        Scanner scanner = new Scanner(System.in); // 3. 입력객체
        while( run ){ // while s [ 4.무한 반복 ] 종료조건 : 4 입력하면 종료된다.
            System.out.println("------------------------------------"); // 출력
            System.out.println("1.예금 2.출금 3.잔고 4.종료");
            System.out.println("------------------------------------");
            System.out.print("선택> "); int ch = scanner.nextInt(); // 5.입력받는다.
            if( ch == 1 ){ // 만약에 1 입력했으면
                System.out.print("예금액> ");
                balance += scanner.nextInt(); // 예금액변수에 입력받은 금액을 누적더하기
                // a = a+1   vs  a += 1
            }
            else if( ch == 2 ){ // 아니고 만약에 2 입력했으면
                System.out.print("출금액> ");
                balance -= scanner.nextInt();   // 예금액변수에 입력받은 금액을 누적빼기
            }
            else if( ch == 3 ){ // 아니고 만약에 3 입력했으면
                System.out.println("잔고> " + balance ); // 예금액변수 호출
            }
            else if( ch == 4 ){ // 아니고 만약에 4 입력했으면
                run = false;
            }
            else{   // 그외
                System.out.println("안내) 알수 없는 행동입니다.");
            }
        } // while end
        System.out.println("프로그램 종료");
    } // main e
} // class e
