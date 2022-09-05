package class16.List;

import java.util.List;
import java.util.Vector;

public class EX3 {
    public static void main(String[] args) {
        //p.561
        // Arraylist vs Vector
        // 1. Vector 클래스로 리스트 선언
        List<Board> list = new Vector<>();
            // Board 객체 여러개를 저장할수 있는 리스트 선언
        // 2. 리스트 객체 추가
        list.add( new Board("제목1" ,"내용1","글쓴이1") );
        list.add( new Board("제목2" ,"내용2","글쓴이2") );
        list.add( new Board("제목3" ,"내용3","글쓴이3") );
        list.add( new Board("제목4" ,"내용4","글쓴이4") );
        list.add( new Board("제목5" ,"내용5","글쓴이5") );
        // 3. 확인
        for( Board temp : list ){ // 향상된 for문   for( 자료형 변수명 : 리스트명 )
            // 리스트내 첫번째 인덱스부터 객체 하나씩 temp객체 대입 반복
            System.out.println( temp.subject +"  " + temp.content+"  "+temp.writer );
        } // for end
        // 4. 삭제
        list.remove( 2 ); // 2번 인덱스 게시물 삭제 [ 제목3 ]
        list.remove( 3 ); // 3번 인덱스 게시물 삭제 [ 제목5 ]
        // 3. 확인
        for( int i = 0 ; i< list.size() ; i++ ){
            Board temp = list.get(i);   // i번째 인덱스의  객체 호출
            System.out.println( temp.subject+"  " + temp.content+"  "+temp.writer );
        } // for end

    } // main end
} // class end
