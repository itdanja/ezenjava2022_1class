package class5;

import java.util.Random;
import java.util.Scanner;

public class EX3_틱택토게임 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // 1. 입력객체
        // 2.문자열 여러개를 저장할수 있는 배열 선언
        String[] 게임판 = { "[ ]" , "[ ]" , "[ ]" ,
                            "[ ]" , "[ ]" , "[ ]" ,
                            "[ ]" , "[ ]" , "[ ]"  };

        while (true) {  // 무한루프 [ 종료 조건은 승리자가 나왔을때 혹은 무승부 ]
            // 3. 게임판 출력    배열명.length : 배열의 길이 구하기
            System.out.println("--- 게임 현황판 ---");
            for (int i = 0; i < 게임판.length; i++) {
                System.out.print(게임판[i]);
                if (i % 3 == 2) System.out.println();
            }
            System.out.println("-------------------");
            // 4. 플레이어 에게 위치 선택받기
            while (true) { // 무한루프 [ 종료조건 : 정상입력이 되었을때
                System.out.print(" 위치 선택 : ");  int 위치 = scanner.nextInt();
                // 5. 해당 위치에 알 두기
                if (게임판[위치].equals("[ ]")) {  //만약에 해당 위치의 게임판이 비어 있으면
                    게임판[위치] = "[O]"; break;
                }  // 비어 있지 않으면 다시 입력을 받는다.
                System.out.println(" 안내) 이미 알이 존재하는 위치 입니다. 다시 선택해주세요 . ");
            } // while end
            // 6. 컴퓨터가 난수 발생 [ 0~8 사이 ]
            while (true) {
                Random random = new Random();  int 위치 = random.nextInt(9); // 0~8 사이의 난수 발생
                if( 게임판[위치].equals("[ ]")) {  게임판[위치] = "[X]"; break;  }
            } // while end

            // 7. 승리자 판단
                // 1. 가로로 이기는 경우의 수  [ 0 1 2 , 3 4 5 , 6 7 8 위치의 모양이 모두 동일하면 ]
                // 2. 세로로 이기는 경우의 수 [0 3 6 , 1 4 7 , 2 5 8 위치의 모양이 모두 동일하면 ]
                // 3. 대각선으로 이기는 경우의 수 [ 0 4 8 , 2 4 6 위치의 모양이 모두 동일하면 ]
        } // while end
    } // main end
} // class end
