package class7;

public class Board {

    // 필드
    String title;
    String content;
    String writer;
    String date;
    int hitcount;

        // this : 자기 자신 [ 현 클래스 ]
            // this.필드명     : 현재 클래스의 필드 호출
            // this( )          : 현재 클래스의 생성자 호출

    // 생성자
    Board( String title , String content){
        // 현 생성자 호출 : Board board1 = new Board( "제목1" , "내용1" );
        this( title , content , "로그인한 회원아이디","현재 컴퓨터 날짜" , 0);
    }
    Board( String title , String content , String writer){
        // 현 생성자 호출 : Board board2 = new Board( "제목2" , "내용2" , "유재석" )
        this( title , content , writer ,"현재 컴퓨터 날짜" , 0);
    }
    Board( String title , String content , String writer , String date){
        // 현 생성자 호출 : Board board3 = new Board( "제목3" , "내용3" , "유재석" , "08-08" )
        this( title , content , writer , date , 0);
    }
    Board( String title , String content , String writer , String date , int hitcount ){
        // 현 생성자 호출 : Board board4 = new Board( "제목4" , "내용4" , "유재석" , "08-08" , 10 )
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date ;
        this.hitcount = hitcount;
    }
    // 메소드

}
