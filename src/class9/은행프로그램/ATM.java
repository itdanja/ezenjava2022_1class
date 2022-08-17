package class9.은행프로그램;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    // 1.필드
    Scanner scanner = new Scanner(System.in);
    ArrayList<계좌> 계좌목록 = new ArrayList<>(); // 계좌클래스의 객체를 여러개 저장할수 있는 객체선언
        // 리스트명.add( 객체 ) : 객체 추가
        // 리스트명.get( 인덱스 ) : 해당 인덱스의 객체 호출
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
    public void 예금(){
        System.out.print("계좌번호 : ");   String 계좌번호 = scanner.next();
        int index = 계좌찾기( 계좌번호 );  // 계좌번호 찾기
        if( index == -1 ){ System.out.println("안내) 동일한 계좌번호가 없습니다. "); return; }
        System.out.print("예금액 : ");     int 예금액 = scanner.nextInt();
        계좌목록.get( index ).set예금액(  계좌목록.get( index ).get예금액() + 예금액 );  // 예금액 업데이트
        System.out.println("안내) 예금 후 잔액 : " + 계좌목록.get(index).get예금액() ); // 안내
    } // f  end
    // 3. 계좌생성메소드
    public void 출금(){
        System.out.print("계좌번호 : "); String 계좌번호 = scanner.next();
        // 계좌확인 
        int index = 계좌찾기( 계좌번호 );
        if( index == -1 ){ System.out.println("안내) 동일한 계좌번호가 없습니다. "); return; }
        // 계좌의 비밀번호 확인 
        System.out.print("비밀번호 : "); String 비밀번호 = scanner.next();
        if( !계좌목록.get( index ).get비밀번호().equals( 비밀번호 ) ){ // 리스트내 i번째 객체의 비밀번호 와 입력한 비밀번호가 같으면 ! -> 같지않으면
            // !:부정 [ true -> false ]
            System.out.println("안내) 비밀번호가 틀렸습니다. "); return;
        }
        System.out.print("출금액 : "); int 출금액 = scanner.nextInt(); // 출금액 입력받기
        // 만약에 예금액보다 출금액 더 크면 출금 못함
        if( 계좌목록.get( index ).get예금액() < 출금액 ){ System.out.println("안내) 잔액이 부족합니다. "); }
        else{ 계좌목록.get( index ).set예금액( 계좌목록.get(index).get예금액() - 출금액 );  }
        System.out.println("안내) 출금 후 잔액 : " + 계좌목록.get(index).get예금액() ); // 안내
    }
    // 4. 계좌생성메소드
    public void 잔금(){  return;  }
    // 5. 계좌생성메소드
    public void 이체(){
        // 본인 : 계좌번호 , 비밀번호 , 이체액    // 상대방 : 계좌번호
        // 본인 계좌번호 확인
        System.out.print("계좌번호 : ");        String from계좌번호 = scanner.next();
        int fromindex = 계좌찾기( from계좌번호 );
        if( fromindex == -1 ){ System.out.println("안내) 동일한 계좌번호가 없습니다. "); return; }
        // 상대방 계좌번호 확인
        System.out.print("받는사람계좌번호 : "); String to계좌번호 = scanner.next();
        int toindex = 계좌찾기( to계좌번호 );
        if( toindex == -1 ){ System.out.println("안내) 받는사람의 계좌번호가 없습니다. "); return; }
        // 안내
        System.out.println("-------------- 받는사람 계좌정보 확인 -------------");
        System.out.println(" 계좌주 : " + 계좌목록.get(toindex).get계좌주() );
        System.out.println(" 계좌번호 : " + 계좌목록.get(toindex).get계좌번호() );
        System.out.println(" 은행명 : " + 계좌목록.get(toindex).get은행명() );
        System.out.println("--------------------------------------------------");
        System.out.print("비밀번호");       String 비밀번호 = scanner.next(); // 비밀번호 확인
        if( !계좌목록.get( fromindex ).get비밀번호().equals( 비밀번호 ) ){
            System.out.println("안내) 비밀번호가 틀렸습니다. "); return;
        }
        System.out.print("이체 할 금액 : ");   int 이체액 = scanner.nextInt();  // 이체액
        if( 계좌목록.get(fromindex).get예금액() < 이체액 ){ System.out.println("안내) 잔액이 부족합니다. "); }
        else{
            계좌목록.get( fromindex ).set예금액( 계좌목록.get( fromindex).get예금액() - 이체액 ); // 본인 계좌에서 이체액 만큼 금액 차감
            계좌목록.get( toindex ).set예금액( 계좌목록.get( toindex).get예금액() + 이체액 );// 받는 사람 계좌에서 이체액 만큼 금액 증가
        }





    }
    // 6. 계좌생성메소드
    public int 계좌찾기( String 계좌번호 ){
        for ( int i = 0 ; i<계좌목록.size() ; i++ ){ // i는 0부터 계좌목록 리스트의 길이까지 1씩증가 반복
            if( 계좌목록.get( i ).get계좌번호().equals( 계좌번호 ) ){   // 만약에 리스트에서 i번째 객체의 계좌번호가 입력받은 계좌번화 동일하면
                return i; // i번째 인덱스 반환
            } // if end
        } // for end
        return -1; // 만약에 리스트에서 동일한 계좌번호가 없으면 -1 
    } // f end

}








