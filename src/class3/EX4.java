package class3;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        // * 입력객체
        Scanner scanner = new Scanner(System.in);

        // 1.  int(정수4바이트) vs double(실수8바이트)
        System.out.print(" 원의 반지름 : ");
        double 반지름 = scanner.nextDouble();
        System.out.println(" 원 넓이 : " + (반지름*반지름*3.14));
        // 2.
        System.out.print(" 실수1 : ");    double 실수1 = scanner.nextDouble();
        System.out.print(" 실수2 : ");    double 실수2 = scanner.nextDouble();
        System.out.println(" 실수간 비율 : " + ( 실수1/실수2 )*100 +"%" );
        // 3.
        System.out.print(" 윗변 : "); double 윗변 = scanner.nextDouble();
        System.out.print(" 밑변 : "); double 밑변 = scanner.nextDouble();
        System.out.print(" 높이 : "); double 높이 = scanner.nextDouble();
        System.out.println(" 사다리꼴 넓이 : " + ( (윗변*밑변)*높이 / 2 ) );

    }
}


/*

[문제1] :  원 넓이 구하기
반지름을 입력받아 원 넓이 출력하기
공식 : 반지름 * 반지름 * 원주율[3.14]

[문제2]
두 실수를 입력받아
앞실수의 값이 뒤의 값의 몇% 인지 출력하기
  54.5    84.3   ->   64%

[문제3] : 사다리꼴 넓이 구하기
윗변과 밑변 높이를 입력
공식 : (윗변 * 밑변) * 높이 / 2

[문제4] : 표준체중 구하기
키를 정수를 입력받아
공식 : (키 - 100) * 0.9

[문제5] inch -> cm 로 변환하기
inch 를 입력받아
공식 : 1 inch -> 2.54cm




 */