package class8;

import java.util.Scanner;

public class EX3_게시판프로그램 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 1. 입력객체
        Board[] boards = new Board[100];    // Board객체를 100개 저장할수 있는 배열
        while (true){ // 무한루프[반복]
            System.out.println("1.글쓰기 2.글보기");
            int ch = scanner.nextInt();
            if( ch == 1 ){
                System.out.print("제목 : ");      String title = scanner.next();
                System.out.print("내용 : ");      String content = scanner.next();
                System.out.print("작성자 : ");    String writer = scanner.next();
                // 외부에서 메소드 호출시에는 객체를 선언한 후에 메소드 호출
                Board board = new Board();
                Board reulst = board.boardwrite( title , content , writer );
                // 결과[반환] 배열에 저장
                boards[0] = reulst;
            }
            else if( ch == 2 ){
                Board board = new Board();
                board.boardlist( boards );
            }
            else {
                System.out.println(" 안내) 알수 없는 행동입니다. ");
            }
        }
    }
}
