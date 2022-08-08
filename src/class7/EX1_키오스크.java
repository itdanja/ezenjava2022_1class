package class7;

import java.util.Scanner;

public class EX1_키오스크 { // class s
    public static void main(String[] args) { // main s

        Scanner scanner = new Scanner(System.in); // 1. 입력객체

        //  *2차원 배열 [ 제품의 재고 ]  [행:3 열:2 -> 6개]
        String[][] product = new String[3][2];
            product[0][0] = "콜라"; product[0][1] = "30";
            product[1][0] = "사이다"; product[1][1] = "20";
            product[2][0] = "환타"; product[2][1] = "10";
            // 배열명.length : 배열의 행 길이
            // 배열명[행인덱스].length : 배열의 열 길이
        while(true){ // 2. 무한루프[ 종료 조건 ]
            // 2차원 배열 출력
            for( int i = 0 ; i<product.length ; i++ ){
                for( int j = 0 ; j<product[i].length; j++ ){
                    System.out.print( product[i][j] );
                }
                System.out.println();
            }
            int ch = scanner.nextInt();
        }
    } // main e
} // class e
