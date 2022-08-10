package class8;

public class Board { // 게시판 클래스

    // 1. 필드 = 데이터 저장하는 곳
    String title;   // 제목 . String : 문자열 클래스 -> 문자열을 저장할수 있는 객체 선언
    String content; // 내용
    String writer;  //  작성자
    // 2. 생성자  = 객체 생성시 초기값 [ 클래스명 == 생성자명 같다 ]
    Board(){ } // 1.빈 생성자
    Board( String title , String content , String writer ) { // 2. 모든 필드를 받는 생성자
        this.title = title;
        this.content = content;
        this.writer = writer;
    }
    // 3. 메소드 = 객체의 행동 [ 미리 정의된 코드 ]
    Board boardwrite( String title , String content , String writer ){   // 1. 글쓰기
        Board board = new Board( title , content , writer ); // 1. 객체 선언
        return board; // 2. 선언된 객체 반환
    } // 함수 end
    void boardlist( Board[] boards ){ // 2. 글보기
        System.out.println("------------ 게시판 목록 ---------------");
        System.out.println("제목\t내용\t작성자");
        for( int i = 0 ; i<boards.length; i++ ){
            System.out.println( boards[i].title+"\t"+boards[i].content+"\t"+boards[i].writer);
        } // for end
    } // 함수 end


} // class end
