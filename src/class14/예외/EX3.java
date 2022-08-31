package class14.예외;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while ( true ){ // 무한루프
            try { // 1. 예외가 발생할것 같은 코드
                int 입력저장변수 = scanner.nextInt();
                System.out.println("입력된 수는 : " + 입력저장변수);
            }catch (  Exception e ){
                // 2. try{} 에서 예외가 발생했을때 실행되는 코드
                System.out.println("[예외발생]숫자만 입력해주세요 ");
                // 기존에 잘못 입력된 데이터를 지우고 새롭게 메모리 할당
                scanner = new Scanner(System.in);
            }
        }
    }
}
