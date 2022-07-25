package class3;

import java.util.Scanner;

public class EX1 { // c s
    public static void main(String[] args) { // m s
        // 1. 입력 객체[ Scanner클래스 : 미리 만들어진 클래스 ] 선언
        Scanner scanner = new Scanner( System.in );
        // 객체 선언 : 클래스명 객체명 = new 클래스명();
        // 2. 입력받은 데이터를 변수에 저장
            // 변수 : 데이터 1개를 저장할수 있는 공간[메모리/상자 등 ]
            // 변수 선언 : 자료형 변수명 = 데이터
                // 자료형[ 미리 만들어진 저장공간 ]
                    // 자동형 변환
                        // byte -> short -> int[*] -> long -> float , double[*]
                    // 강제형 변환
        System.out.print(" 기본급 : " );
        int 기본급 = scanner.nextInt(); // 입력받은 데이터 int형으로 가져오기
        System.out.print(" 수당 : " );
        int 수당 = scanner.nextInt();
        // 3. 실수령액 계산하기
        int 실수령액 = 기본급 + 수당 - (int)(기본급*0.1);
            // 1 : 100%   /   0.5 : 50%   / 0.05 : 5%
        System.out.println(" 실수령액  : " + 실수령액 );
    }// m e
} // c e

/*
EX1 클래스 생성
1. 급여 명세서
[조건]입력받기
	기본급 , 수당
[출력]
실수력액
= 기본급 + 수당 - 세금[ 기본급10%]

 */
