package class3; // 패키지명

public class page102_연산자 { // c s

    public static void main(String[] args) { // m s

        // 연산자 종류 [ 연산자 : 연산시 사용되는 특수기호 ]
        /*
            1. 산술연산자 : 결과를 값으로 반환
                +:더하기   -:빼기   *:곱하기  /:나누기  %:나머지
            2. 문자열 연산자 :
                + : 연결 연산자
            3. 비교 연산자 : 결과를 TRUE / FALSE 반환
                >:초과  <:미만      >=이상 <=이하   ==같다 !=같지않다
            4. 논리 연산자 : 비교연산자가 여러개 일때
                && : AND 이면서 면서 이고 그리고 모두
                    [ 비교연산자가 모두 TRUE 이면 결과 TRUE ]
                || : OR 이거나 거나 또는 하나라도
                    [ 비교연산자가 하나라도 TRUE 이면 결과 TRUE ]
                   | : shift + 엔터위에 원화기호
                ! : T -> F   /  F -> T
                    [ 만약에 TRUE -> FALSE  / FALSE -> TRUE ]
         */
        int 정수1 = 10;   /* int형(4바이트상자) 변수 선언 -> 10 대입 */
        int 정수2 = 20;
        System.out.println(" 더하기(+) " + (정수1+정수2) ); // 숫자변수+숫자변수 = 30
        System.out.println(" 연결연산자(+) " + 정수1 + 정수2 ); // 문자열+숫자변수+숫자변수
        System.out.println(" 빼기 : " + (정수1-정수2) );
        System.out.println(" 곱하기 : " + (정수1*정수2) );
        System.out.println(" 나누기 : " + (정수1/정수2) );
        System.out.println(" 나머지 : " + (정수1%정수2) );

        System.out.println(" 초과 : " + (정수1>정수2) ); // FALSE
        System.out.println(" 미만 : " + (정수1<정수2) ); // TRUE
        System.out.println(" 이상 : " + (정수1>=정수2) ); // FALSE
        System.out.println(" 이하 : " + (정수1<=정수2) ); // TRUE
        System.out.println(" 같다 : " + (정수1==정수2) ); // FALSE
        System.out.println(" 같지않다 : " + (정수1 != 정수2) ); // TRUE
        int 정수3 = 30; int 정수4 = 40;
        System.out.println(" AND : " + ( 정수1>=정수2 && 정수4>=정수3) );
                                    //   10>=20 F   &&   40>=30 T  : F , T => F
                                    // AND는 모두 TRUE 이면 결과 TRUE
        System.out.println(" OR : " + ( 정수1>=정수2 || 정수4>=정수3 ) );
                                    // OR는 하나라도 TRUE 이면 결과 TRUE
        System.out.println(" NOT : "+ !(정수1>=정수2 || 정수4>=정수3 ) );








    } // m e
} // c e
