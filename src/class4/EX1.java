package class4;

import java.util.Scanner; // 다른 패키지내 Scanner 클래스 호출

public class EX1 { // c s
    public static void main(String[] args) { // m s

        // * 입력 객체 [ 괄호안에서 1번 선언 ]
        Scanner scanner = new Scanner(System.in);
        // 예1) 2개의 정수를 입력받아 더 큰수를 출력
        System.out.print("정수1 입력 : ");  int 정수1 = scanner.nextInt();
        System.out.print("정수2 입력 : ");  int 정수2 = scanner.nextInt();
        // 만약에 정수1 가 정수2 보다 크면
        if( 정수1 > 정수2 ) System.out.println( 정수1 + "가 더 큽니다.");
        // 아니면 정수1 가 정수2 보다 작으면
        else if( 정수1 < 정수2 ) System.out.println(정수2+"가 더 큽니다.");
        // 그외 나머지
        else System.out.println(" 두 수는 동일 합니다.");

        // 예2) 3개의 정수를 입력받아 더 큰수를 출력
        System.out.println("정수3 입력 : "); int 정수3 = scanner.nextInt();
        System.out.println("정수4 입력 : "); int 정수4 = scanner.nextInt();
        System.out.println("정수5 입력 : "); int 정수5 = scanner.nextInt();
        // 방법1 : 비교연산자
        if( 정수3 > 정수4 && 정수3 > 정수5 ) System.out.println(정수3+"가 가장 큽니다. ");
        else if( 정수4 > 정수3 && 정수4 > 정수5 ) System.out.println(정수4+"가 가장 큽니다.");
        else if( 정수5 > 정수3 && 정수5 > 정수3 ) System.out.println(정수5+"가 가장 큽니다. ");
        else System.out.println("모두 동일합니다.");
        // 방법2 : 변수 활용
        int max = 정수3; // 가장 큰수를 보관하는 변수
        if( max < 정수4 ) max = 정수4;  // 최댓값 교체
        if( max < 정수5 ) max = 정수5;
        System.out.println(max+"가 가장 큽니다.");
        // 예3) 4개의 정수를 입력받아 더 큰수를 출력
        System.out.println("정수6 입력 : "); int 정수6 = scanner.nextInt();
        System.out.println("정수7 입력 : "); int 정수7 = scanner.nextInt();
        System.out.println("정수8 입력 : "); int 정수8 = scanner.nextInt();
        System.out.println("정수9 입력 : "); int 정수9 = scanner.nextInt();
        // 방법1 : 변수 활용
        int max2 = 정수6;
        if( max < 정수7 ) max = 정수7;
        if( max < 정수8 ) max = 정수8;
        if( max < 정수9 ) max = 정수9;
        System.out.println(max+"가 가장 큽니다.");
        // 방법2 : 반복문 활용
        System.out.println(" 정수를 몇개 입력할까요? ");
        int 입력받을수 = scanner.nextInt();
        int[] 정수배열 = new int[입력받을수]; // [ ] : 순서대로 나열된 항목들
            // [3] : 3개 저장 가능      [5] : 5개 저장 가능
            // 변수 : 한개만 저장  vs 배열 : 여러개 저장 가능
            // 배열 선언 : 자료형[] 배열명 = new 자료형[개수]
            // 배열내 데이터 저장 : 배열명[인덱스번호]
                // 인덱스 : 배열에 저장된 순서번호 [ 0번시작 ]
        int max3 = 0; // 가장 큰수를 담는 임시변수
        for( int i = 0 ; i<입력받을수 ; i+=1 ){ // for start
            // i는 0부터 // i는 입력받을수 미만까지 // i는 1씩증가한다.
            System.out.println(i + "번째 정수 입력: " );
            정수배열[i] = scanner.nextInt();
            // i번째 배열에 입력받은 값을 저장
            if( max3 < 정수배열[i] ) max3 = 정수배열[i];
        } // for end
        System.out.println(max3+"가 가장 큽니다.");

    } // m e
} // c e





