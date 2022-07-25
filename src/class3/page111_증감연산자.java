package class3;

public class page111_증감연산자 {

    public static void main(String[] args) {

        // 4. 증감연산자 [ 엘레베이터 , 주문번호 등 ]
            // ++ : 1증가    -- : 1감소
                // ++변수 : 다른 연산자들 보다 우선 증가
                // 변수++ : 다른 연산자들 보다 후위 증가

        int x = 10; /* int형 변수(데이터1개저장공간) 선언과 10 대입 */
        int y = 10;
        System.out.println(" x : " + x );              // 10
        System.out.println(" 선위증가 x : " + (++x) );  // 11
            // 1. 증가 2.연결 3. 출력  [  출력 전에 증가 ]
        System.out.println(" 후위증가 x : " + (x++) );  // 11
            // 1. + 연결  2. 출력  3. 증가 [ 출력 후에 증가 ]
        System.out.println(" x : " + x );               // 12
        // ------------------
        System.out.println(" y : " + y );               // 10
        System.out.println(" 선위감소 y : " + (--y) );  // 9
        System.out.println(" 후위감소 y : " + (y--) );  // 9
        System.out.println(" y : " + y );               // 8







    }
}
