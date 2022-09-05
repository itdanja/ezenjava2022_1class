package class16.Set;

import java.util.HashSet;
import java.util.Set;

public class EX1 {

    public static void main(String[] args) {
        //p.568
        // 1. HashSet 클래스를 이용한 set 선언
        Set<String> set = new HashSet<>();
        // 2. set 에 객체 추가
        set.add("JAVA");        System.out.println( set );
        set.add("JDBC");        System.out.println(set);
        set.add("servlet/jsp"); System.out.println(set);
        set.add("JAVA");        System.out.println(set); // 중복 불가능
        set.add("iBatis");      System.out.println(set);
        // 3. set 길이 구하기
        int size = set.size();  System.out.println("set내 객체수 : " + size);
        // 4. 확인
        for( String temp : set ){  System.out.println( temp );  } // for end
        // 5. 객체 삭제 [ 삭제할 객체이름을 정확히 넣는다 ]
        set.remove("JDBC");
        set.remove("iBatis");
        System.out.println("------------------------------------");
        // 4. 확인
        for( String temp : set ){  System.out.println( temp );  }
    }
}
