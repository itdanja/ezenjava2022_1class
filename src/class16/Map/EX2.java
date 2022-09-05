package class16.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class EX2 {

    public static void main(String[] args) {

        // p577
        // 1. HashTable 클래스를 이용한 map 선언
        Map< String , String > map = new Hashtable<>();
        // 2. map 객체내 엔트리 추가
        map.put("spring" , "12");   // 엔트리( 키 , 값 ) 추가
        map.put("summer" , "123");
        map.put("fall" , "1234");
        map.put("winter" , "12345");
        // 3. 입력객체
        Scanner scanner = new Scanner(System.in);
        while ( true ){
            System.out.println("아이디와 비밀번호를 입력해주세요.");
            System.out.print("아이디 : ");
                String id= scanner.nextLine();
            System.out.print("비밀번호 : ");
                String password = scanner.nextLine();
            System.out.println();
            if( map.containsKey(id) ){ // 해당 map에 id 키가 존재하는지 확인
                if( map.get(id).equals( password ) ){
                    // map.get( 키 ) : 해당 키의 값 호출
                    System.out.println("로그인이 되었습니다. "); break;
                }else{
                    System.out.println("비밀번호가 일치하지 않습니다. ");
                }
            } // if end
            else{
                System.out.println("입력하신 아이디가 존재하지 않습니다.");
            } // else end
        }// while end
    } // main end
} // class end
