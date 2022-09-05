package class16.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // List 활용  // Member 객체 여러개를 저장할수 있는 리스트 객체 선언
        List<Member> memberList = new ArrayList<>();
        while (true) {
            System.out.println("----- 친구 목록 -----");
            for( int i = 0 ; i<memberList.size() ; i++ ){ // 모든 리스트를 출력하는 반복문
                System.out.println(
                        memberList.get(i).getName() + "  phone : " +
                        memberList.get(i).getPhone() );
            } // for end
            System.out.print("1.친구등록 : "); int ch = scanner.nextInt();
            if( ch == 1 ){
                System.out.print(" 이름 : "); String name = scanner.next();
                System.out.print(" 번호 : "); String phone = scanner.next();
                Member member = new Member( name , phone ); // 객체 생성
                memberList.add( member ); // 리스트에 생성된 객체 추가
            } // if end
        } // while end
    } // main end
} // class end
