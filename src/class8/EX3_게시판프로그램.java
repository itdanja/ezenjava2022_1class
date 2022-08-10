package class8;

import java.util.Scanner;

public class EX3_게시판프로그램 {
    public static void main(String[] args) {
        // 1. 입력객체
        Scanner scanner = new Scanner(System.in);
        // 2 Board객체를 100개 저장할수 있는 배열
        Board[] boards = new Board[100]; // 클래스명[] 배열명 = new 클래스명[개수]
        while (true){ // 무한루프[반복] 종료조건 : 4 입력시 종료
            System.out.println("1.글쓰기 2.글보기 3.글삭제 4.종료");
            int ch = scanner.nextInt(); // 메뉴를 입력받는다.
            if( ch == 1 ){ // 만약에 1 입력했으면
                System.out.print("제목 : ");      String title = scanner.next();
                System.out.print("내용 : ");      String content = scanner.next();
                System.out.print("작성자 : ");    String writer = scanner.next();
                Board board = new Board(); // 메소드 호출용 객체[임시]    // 외부에서 메소드 호출시 객체가 필요!!!
                Board resulst = board.boardwrite( title , content , writer );
                // 배열에서 빈 공간의 인덱스 찾아서 빈공간에 새로운 객체저장
                for( int i = 0 ; i<boards.length ; i++ ){
                    // i는 배열의 길이[100]까지 1씩증가
                    if( boards[i] == null ){ // i번째 인덱스의 값이 없으면
                        boards[i] = resulst; // i번째 인덱스에 함수결과를 대입
                        break; // 가장 가까운 반복문 탈출
                    } // if end
                } // for end
            } //
            else if( ch == 2 ){ // 만약에 2 를 입력했으면
                Board board = new Board();   board.boardlist( boards );
            }
            else if( ch == 3 ){  // 만약에 3 를 입력했으면
                System.out.print("삭제할 게시물번호 :");
                int deleteNum = scanner.nextInt();
                // 1. 입력받은 인덱스(삭제할번호)에 null 대입한다.
                boards[ deleteNum ] = null;
                // 한칸씩 당기기 [ 삭제된 뒤로 한칸씩 당기기 ]
                for( int i = deleteNum+1 ; i<boards.length ; i++ ){
                    if( boards[i] == null ){ break; }
                    boards[i-1] = boards[i]; // 현재 위치의 값을 앞으로 이동
                    boards[i] = null; // 현재 위치의 값을 null
                }
            }
            else if( ch == 4 ){ // 만약에 4를 입력했으면
                System.out.println(" 안내) 프로그램 종료 ");
                return; // return(함수종료) vs break(반복문종료);
            }
            else { //  그외
                System.out.println(" 안내) 알수 없는 행동입니다. ");
            }
        }
    }
}
