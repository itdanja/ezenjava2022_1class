package class5;

import java.util.Random;
import java.util.Scanner;

public class EX2_가위바위보게임 { // CLASS START

    public static void main(String[] args) { // main start
        Scanner scanner = new Scanner(System.in); // 입력객체
        int 플레이어승리수 = 0; // 변수의 초기값
        int 컴퓨터승리수 = 0;
        while( true ) { // 무한루프
            System.out.println("----- 가위바위보 게임 -----");
            // 사용자에게 입력받기
            System.out.print(" 가위[0] , 바위[1] , 보[2] , 종료[3] 중 선택 : ");
            int 플레이어 = scanner.nextInt();
                if( 플레이어 == 3 ) break; // 만약에 3번을 선택했으면 반복문 탈출
            // 컴퓨터에게 난수생성
            Random random = new Random();
            int 컴퓨터 = random.nextInt(3); // random.nextInt(3);       // 0~2까지의 난수발생
            // 확인
            System.out.println(" 플레이어가 낸 수 : " + 플레이어);
            System.out.println(" 컴퓨터가   낸 수 : " + 컴퓨터);
            // 승리자 판단
            if (플레이어 == 0 && 컴퓨터 == 2 || 플레이어 == 1 && 컴퓨터 == 0 || 플레이어 == 2 && 컴퓨터 == 1) {    // 1. 플레이어가 이기는 경우의 수 [ 0 2 , 1 0 , 2 1 ]
                System.out.println(" 플레이어 승리 ");    플레이어승리수++;
            } else if (플레이어 == 0 && 컴퓨터 == 0 || 플레이어 == 1 && 컴퓨터 == 1 || 플레이어 == 2 && 컴퓨터 == 2) { // 2. 비기는 경우의 수 [ 0 0 , 1 1 , 2 2 ]
                System.out.println(" 무승부 ");
            } else {  // 3. 컴퓨터가 이기는 경우의 수 [ 그외 ]
                System.out.println("컴퓨터 승리 ");      컴퓨터승리수++;
            }
        } // 무한루프 end
        if( 플레이어승리수 > 컴퓨터승리수 ) System.out.println("최종 승리자는 플레이어 입니다. ");
        else if( 플레이어승리수 < 컴퓨터승리수) System.out.println("최종 승리자는 컴퓨터 입니다. ");
        else System.out.println(" 최종 승리는 무승부 입니다. ");
        System.out.println(" --- 안녕히 가세요 --- ");

    } // main end
}// CLASS END

/*
    1. 입력받기 [ 0:가위 , 1:바위 , 2:보 ] 
    2. 컴퓨터 난수[랜덤]발생
            // random.nextInt();        // 0~20억정도 까지의 난수발생
            // random.nextInt(10);      // 0~9까지의 난수발생
            // random.nextInt(3);       // 0~2까지의 난수발생
            // random.nextInt(10)+1;    // 1~10까지의 난수발생
    3. 무한루프 [ 3:종료 ] : 무한루프 종료

 */