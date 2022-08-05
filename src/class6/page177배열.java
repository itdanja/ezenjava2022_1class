package class6;

public class page177배열 {

    /*
        배열 [ 참조타입 ]
            1. 동일한 타입의 데이터를 연속적인 공간에 나열
            2. 저장순서번호 = 인덱스 [ 0번시작~~~~ ]
                예) 30개 저장하면 -> 인덱스 0~29 번 생성된다.
            3. 동일한 타입 : int끼리 char끼리
                예)  50 , 'A' -> 서로 다른 타입은 동일한 배열에 저장할수 없다.
            4.  배열 선언시 [ ]
                   1.   자료형[] 배열명 = { 값1 , 값2 , 값3 }
            5.  배열 호출
                1. 배열명[인덱스]

     */
    public static void main(String[] args) {
        // 1. 배열 선언 [ 과 동시에 값 초기화(처음값 ) ]
        int[] scores = { 89 , 90 , 87 };
        // 2. 배열 출력
        System.out.println(" 배열 0번 인덱스 출력 : " + scores[0] ); // 89
        System.out.println(" 배열 1번 인덱스 출력 : " + scores[1] ); // 90
        System.out.println(" 배열 2번 인덱스 출력 : " + scores[2] ); // 87
        // 3. 배열의 총합계
        int sum = 0;
        for( int i = 0 ; i<3 ; i++ ){       // i는 0부터 2까지 1씩 증가 반복
            sum += scores[i];
            // i번째 인덱스 값 호출해서 sum변수에 누적더한다.
        }
        System.out.println(" 배열내 총합계 : " + sum );
        System.out.println(" 배열내 평균 : " + (sum/scores.length) );
            // 배열명.length : 배열내 항목 수

        // 1. 배열 선언 만
        int[] arr1 = new int[3];    // int형 3개를 저장할수 있는 배열 선언

        // 2. 값이 없는경우 출력
        for( int i = 0 ; i< arr1.length ; i++ ){
            // 초기값이 없기때문에 0 혹은 null 출력된다.
            System.out.println(" 호출 : " + arr1[i] );
        }
        // 3. 각 인덱스에 값 대입
        arr1[0] = 10 ; arr1[1] = 20 ; arr1[2] = 30;
        // 3. 값이 있는경우 출력
        for( int i = 0 ; i< arr1.length ; i++ ){
            System.out.println(" 호출 : " + arr1[i] );
        }

        // 1. 문자열 저장하는 배열 선언
        String[] arr2 = new String[4];  // String 객체 4개를 저장할수 있는 배열 선언
        // 2. 초기값이 없을경우 출력
        for( int i = 0 ; i<arr2.length ; i++ ){
            System.out.println(" 호출 : " + arr2[i]);
        }
        // 3. 인덱스에 값 넣기
        arr2[0] = "유재석"; arr2[1] ="신동엽";
        arr2[2] = "강호동"; arr2[3] ="서장훈";
        // 4. 값이 있는경우 출력
        for( int i = 0 ; i< arr2.length ; i++ ){
            System.out.println(" 호출 : " + arr2[i] );
        }








    }

}















