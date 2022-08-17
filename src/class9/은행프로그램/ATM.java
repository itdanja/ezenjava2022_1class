package class9.은행프로그램;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    // 1.필드
    Scanner scanner = new Scanner(System.in);
    ArrayList<계좌> 계좌목록 = new ArrayList<>(); // 계좌클래스의 객체를 여러개 저장할수 있는 객체선언
    // 3.메소드
    public void 계좌생성(){   // 1. 계좌생성메소드
        Random random = new Random();   // 계좌번호 난수 생성
        String 계좌번호 = random.nextInt(9999)+1000 + ""; // 숫자+문자 => 문자
        System.out.print("계좌주 : ");          String 계좌주 = scanner.next();
        System.out.print("비밀번호 : ");        String 비밀번호 = scanner.next();
        System.out.print("은행 : 1.신한 2.국민 3.농협  선택 ) "); int ch = scanner.nextInt();
        String 은행명 = "";
        if( ch == 1 ){ System.out.println("안내) 신한은행을 선택했습니다. "); 은행명 ="신한은행";  }
        else if( ch == 2 ){ System.out.println("안내) 국민은행을 선택했습니다."); 은행명 ="국민은행";}
        else if( ch == 3 ){  System.out.println("안내) 농협은행을 선택했습니다."); 은행명 ="농협은행";  }
        else {  System.out.println("안내) 알수 없는 은행입니다. ");}
        계좌 temp = new 계좌( 계좌번호 , 비밀번호 , 계좌주 , 은행명 , 0 );  // 객체 생성
        System.out.println("------------------ 계좌 생성 축하합니다----------------"); // 객체 안내
        System.out.println(" 계좌번호 : "  + temp.get계좌번호() );
        System.out.println(" 계좌주 : "  + temp.get계좌주() );
        System.out.println(" 은행명 : "  + temp.get은행명() );
        System.out.println("------------------------------------------------------");
        계좌목록.add( temp );  // 리스트에 객체 추가 [ 리스트명.add( 객체 ) : 리스트에 객체 추가 ]
    }
    // 2. 계좌생성메소드
    public void 예금(){ return; }
    // 3. 계좌생성메소드
    public void 출금(){  return; }
    // 4. 계좌생성메소드
    public void 잔금(){  return;  }
    // 5. 계좌생성메소드
    public void 이체(){ return; }
    // 6. 계좌생성메소드
    public void 계좌찾기(){  return; }

}
