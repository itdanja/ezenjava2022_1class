package class3;

import java.util.Scanner; // import : 가져오다.
        // 외부에서 Scanner 클래스 호출
public class EX2 {  // C S
    public static void main(String[] args) { // m s

        // 1. 입력받기위해 입력객체 선언
        Scanner scanner = new Scanner(System.in);   // System.out:출력[console]   System.in:입력[키보드]
        // 2. 입력받은 데이터를 변수에 저장
        System.out.print(" 금액 : ");
        int 금액 = scanner.nextInt();   //  = : 대입연산자 [ 오른쪽 데이터가 왼쪽에 이동
        System.out.println(" 입력받은 금액 : " + 금액 +" 입니다."); // 3.변수 출력
        System.out.println(" 십만원 : " + (금액/100000)+"장" );     // 4.십만원권
            금액 = 금액 - (금액/100000)*100000;  // 십만원 제외
                // 연산 우선순위 [ 한번에 여러개 연산자 사용 불가능 ]
                    // 1. (금액/100000) = 3
                    // 2. 3 * 100000 = 300000
                    // 3. 금액 - 300000 => 356789 -300000 => 56789
                    // 4. 금액 = 56789
        System.out.println(" 만원 : " + (금액/10000)+"장" );  // 5. 만원
            금액 = 금액 - (금액/10000) * 10000 ; // 만원 제외
        System.out.println(" 천원 : " + (금액/1000) + "장" );  //  6. 천원
            금액 = 금액 - (금액/1000) * 1000; // 천원 제외
        System.out.println(" 백원 : " + (금액/100) + "개");  //  7. 백원

    } // m e
} // C E

/*
지폐 개수 세기
[조건] : 십만원 단위의 금액 입력받기
[출력] : 입력받은 금액의 지폐수 세기
[출력 예]
	356789
	십만원 : 3장
	만원 : 5장
	천원 : 6장
	백원 : 7개
 */


