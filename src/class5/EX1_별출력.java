package class5;

import java.util.Scanner;

public class EX1_별출력 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 입력객체
        // 1. 입력받은 정수만큼 별 출력
        System.out.print("문제1 별 개수 : "); int s1 = scanner.nextInt();
        for( int i = 1 ; i<=s1 ; i++ ){ // i는 1부터 입력받은 수까지 1씩 증가
            System.out.print(" * ");
        } // for end
    System.out.println("\n------------------");
        // 2. 입력받은 정수만큼 별출력 // 조건 : 5개마다(5배수) 줄바꿈처리
        System.out.print("문제2 별 개수 : "); int s2 = scanner.nextInt();
        for( int i = 1 ; i<=s2 ; i++ ){
            System.out.print("*");
            // 5배수 찾기 [ 나누기 5 했을때 나머지가 0 이면 ]
            if( i%5 == 0 ) System.out.println();
        } // for end
    System.out.println("\n------------------");
        // 3. 입력받은 줄 수 만큼 별 출력
        System.out.print("문제3 줄수 : "); int line3 = scanner.nextInt();
        for( int i = 1 ; i<=line3 ; i++ ){
            // 1. 별찍기
            for( int s = 1 ; s<=i ; s++ ){
                System.out.print("*");
            }
            // 2. 줄바꿈
            System.out.println();
        } // for end
    System.out.println("\n------------------");
        // 4. 입력받은 줄 수 만큼 별 출력
        System.out.print("문제4 줄수 : "); int line4 = scanner.nextInt();
        for( int i = 1 ; i<=line4 ; i++ ){
            // 1. 별찍기
            for( int s = 1 ; s<=line4-i+1 ; s++ ){
                System.out.print("*");
            }
            // 2. 줄바꿈
            System.out.println();
        } // for end

    } // main end
} // class end









