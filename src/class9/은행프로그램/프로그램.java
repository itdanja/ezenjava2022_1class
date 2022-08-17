package class9.은행프로그램;

import java.util.Scanner;

public class 프로그램 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in ); // 입력객체
        ATM atm = new ATM();
        while (true){
            System.out.println("------------ 편의점 ATM ----------- ");
            System.out.print("1.계좌생성 2.예금 3.출금 4.잔금 5.이체 선택>> : ");
            int ch = scanner.nextInt();
            if( ch == 1 ){   atm.계좌생성(); }
            else if( ch == 2 ){ atm.예금(); }
            else if( ch == 3 ){ atm.출금(); }
            else if( ch == 4 ){ atm.잔금(); }
            else if( ch == 5 ){ atm.이체(); }
            else{ System.out.println("안내) 알수없는 번호입니다.");}
        }

    }
}
