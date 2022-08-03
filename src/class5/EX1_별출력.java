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
    System.out.println("\n------------------");
        // 5. 입력받은 줄 수 만큼 별 출력
        System.out.print("문제5 줄수 : "); int line5 = scanner.nextInt();
        for( int i = 1 ; i<=line5 ; i++ ){
            // 1. 공백찍기
            for( int b = 1 ; b<=line5-i ; b++ ){
                System.out.print(" ");
            }
            // 2. 별찍기
            for( int s = 1 ; s<=i ; s++ ){
                System.out.print("*");
            }
            // 3. 줄바꿈
            System.out.println();
        } // for end
    System.out.println("\n------------------");
        // 6. 입력받은 줄 수 만큼 별 출력
        System.out.print("문제6 줄수 : "); int line6 = scanner.nextInt();
        for( int i = 1 ; i<=line6 ; i++ ){
            // 1. 공백찍기
            for( int b = 1 ; b<=i-1 ; b++ ){ System.out.print(" "); }
            // 2. 별찍기
            for( int s = 1 ; s<=line6-i+1 ; s++ ){ System.out.print("*"); }
            // 3. 줄바꿈
            System.out.println();
        } // for end
    System.out.println("\n------------------");
        System.out.print("문제7 줄수 : "); int line7 = scanner.nextInt();
        for( int i = 1 ; i<=line7 ; i++ ){
            // 1. 공백찍기
            for( int b = 1 ; b<=line7-i ; b++ ){ System.out.print(" "); }
            // 2. 별찍기
            for( int s = 1 ; s<=i*2-1 ; s++ ){ System.out.print("*"); }
            // 3. 줄바꿈
            System.out.println();
        }

    } // main end
} // class end

/*
문제3
	i = 줄수	s = 별개수
*	i = 1	s = 1
**	i = 2	s = 1 2
***	i = 3	s = 1 2 3
****	i = 4	s = 1 2 3 4
*****	i = 5	s = 1 2 3 4 5
	i는 1부터 입력받은 수까지 1씩증가
		s는 1부터 i까지 1씩 증가
문제4
*****	i = 1	s = 1 2 3 4 5	5 - i+1 -> 5
****	i = 2	s = 1 2 3 4		5 - i+1 -> 4
***	i = 3	s = 1 2 3		5 - i+1 -> 3
**	i = 4	s = 1 2 		5 - i+1 -> 2
*	i = 5	s = 1		5 - i+1 -> 1
	i는 1부터 입력받은 수까지 1씩증가
		s는 1부터 전체줄수-i+1 까지 1씩증가

문제5	줄수	공백수		별수
      *	i = 1	b = 1 2 3 4 	s = 1
     **	i = 2 	b = 1 2 3 		s = 1 2
   ***	i = 3	b = 1 2 		s = 1 2 3
  ****	i = 4	b = 1		s = 1 2 3 4
***** 	i = 5	b = 		s = 1 2 3 4 5
	i는 1부터 입력받은 수까지 1씩증가
		b는 1부터 전체줄수-i번째 까지 1씩증가
			s는 1부터 i 까지 1씩증가
문제6
*****	i = 1	b = 		s = 1 2 3 4 5
  ****	i = 2	b = 1 		s = 1 2 3 4
    ***	i = 3	b = 1 2 		s = 1 2 3
      **	i = 4 	b = 1 2 3		s = 1 2
       *	i = 5	b = 1 2 3 4 	s = 1
		b는 1부터 i-1 까지	s는 1부터 전체줄수-i+1 까지

문제7
    *		i = 1 	b = 1 2 3 4 	s = 1			i*2 -> 2 -1
   ***		i = 2 	b = 1 2 3		s = 1 2 3 			i*2 -> 4 -1
  *****		i = 3	b = 1 2 		s = 1 2 3 4 5 		i*2 -> 6 -1
 *******		i = 4 	b = 1		s = 1 2 3 4 5 6 7 		i*2 -> 8 -1
*********		i = 5	b =		s = 1 2 3 4 5 6 7 8 9		i*2 -> 10 -1
			b는 1부터 전체줄수-i 까지
				s는 1부터 i*2-1 까지












 */







