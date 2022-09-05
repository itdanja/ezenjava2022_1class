package class16.Map;

import java.util.HashMap;
import java.util.Map;

public class EX1 {
    public static void main(String[] args) {

        // Map : 키,값 = 엔트리
        // 1. HashMap 클래스 이용한 map 선언
        Map<String,Integer> map = new HashMap<>();
       // 2. map 엔트리 추가 메소드
        map.put("신용권",85);  // 엔트리 : 키 와 값으로 구성된 객체
        map.put("홍길동",90);
        map.put("동장군",80);
        map.put("홍길동",95);  // 키 : 중복이 불가능하다.  값 : 중복이 가능하다.
        // 3. 확인
        System.out.println("map : " + map );
        // 4. map 엔트리 개수
        System.out.println("map 엔트리 수 : " + map.size() );
        // 5. map 값 호출
        System.out.println("map 값 호출[ key = 신용권 ] : " + map.get("신용권") );
        // 6. 반복문
        for( String key : map.keySet() ){
            System.out.println("key : " + key );
            System.out.println("value : " + map.get( key ) );
        } // for end
    } // main end
} // class end
