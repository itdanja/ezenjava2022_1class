package class3;

import java.util.Scanner;

public class EX3 { // CS

    public static void main(String[] args) { //MS
        // * 입력객체 선언 [ 한번만 작성 ]
        Scanner scanner = new Scanner(System.in);

        // 1. 배수찾기 [ 나머지값 이용하기 ]
            // 값 % 수 == 0           / :나누기(몫) vs %:나누기(나머지)
                //어떤 값의 나누기 수를 했을때 나머지가 0 이면 그 값은 그 수 의 배수
        System.out.print(" 정수1 : ");    int 정수1 = scanner.nextInt();
        System.out.println(" 입력받은 정수는 7의 배수 : " + ( 정수1%7 == 0) );
        // 2. 홀수/짝수 찾기 [ 나머지값 이용하기 ]
            // 값 % 2 == 0 [ 짝수 ]   값 % 2 == 1 [ 홀수 ]
                // 어떤 값의 나누기 2를 했을때 나머지가 0이면짝수 1이면 홀수
        System.out.print(" 정수2 : ");    int 정수2 = scanner.nextInt();
        System.out.println(" 입력받은 정수는 홀수 : " + ( 정수2 % 2 == 1) );
        // 3. 조건이 두개 일때
        System.out.print(" 정수3 : ");    int 정수3 = scanner.nextInt();
        System.out.println(" 입력받은 정수는 7의 배수 이면서 홀수인지 : "
                + (정수3%7==0 && 정수3%2==1) );

        System.out.println(" 입력받은 정수는 7의 배수 이거나 홀수인지 : "
                + (정수3%7==0 || 정수3%2==1) );
    } // ME
}// CE

/*


EX3 클래스 생성
1.
[입력]하나의 정수를 입력
[출력] 7의 배수인지 T / F
2.
[입력]하나의 정수를 입력
[출력] 홀수인지 T / F
3.
[입력]하나의정수를 입력
[출력] 7의 배수이면서 짝수인지 T / F


 */

