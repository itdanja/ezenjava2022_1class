package class16.List;

import java.util.ArrayList;
import java.util.List;

public class EX1 {
    public static void main(String[] args) {
        // p.560
        // 1. 리스트 선언
            // List< 리스트안에 들어갈 클래스 > 변수명 = new ArrayList<>();
        List<String> list = new ArrayList<>();
            // String 객체 여러개를 저장할수 있는 list 객체 선언
        // 2. 리스트 저장 메소드
        list.add("java");           System.out.println("리스트 : " + list );
        list.add("JDBC");           System.out.println("리스트 : " + list );
        list.add("Servlet/JSP");    System.out.println("리스트 : " + list );
        list.add( 2 , "Database");    System.out.println("리스트 : " + list );
        list.add("iBATIS");         System.out.println("리스트 : " + list );
        // 3. 리스트내 객체 수 확인 메소드
        int size = list.size();     System.out.println("리스트내 객체 수 : " + size  );
        // 4. 리스트와 반복문 활용
        for( int i = 0 ; i<list.size(); i++ ){ // i는 0부터 리스트내객체수 만큼 1씩 증가
            System.out.println( i+"번째 객체 : " + list.get(i) );
        } // for end
        // 5. 리스트내 객체 삭제 메소드
        list.remove( 2 );   // 2번 인덱스 삭제
            System.out.println("2번 인덱스 삭제후 : " + list );
        list.remove( 2 );
            System.out.println("2번 인덱스 삭제후 : " + list );
        // 6. 리스트내 모든 객체 삭제
        list.clear();
            System.out.println("리스트내 모든 객체 삭제 : " + list );
    }   // main end
} // class end
/*
    컬렉션[저장] 프레임워크[사용방법] : 저장사용방법
        1.List 인터페이스
            1. ArrayList 클래스
                1-1. 리스트명.add( 객체 ) : 리스트에 객체 추가
                1-2. 리스트명.add( 인덱스 , 객체 ) : 해당 인덱스에 객체 추가
                    * 해당 인덱스에 존재했던 객체는 뒤로 한칸씩 이동
                2. 리스트명.size() : 리스트내 객체 수
                3. 리스트명.get(인덱스) : 해당 인덱스의 객체 호출
                4. 리스트명.remove(인덱스) : 해당 인덱스의 객체 삭제 [ 삭제된 객체 위치 뒤로 한칸씩 당김 ]
                5. 리스트명.clear() : 리스트내 모든 객체 삭제
        2.Set

 */