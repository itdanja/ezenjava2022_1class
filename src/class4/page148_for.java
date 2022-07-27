package class4;

public class page148_for {
    public static void main(String[] args) {

        // 반복문 : 동일한 코드를 여러번 반복
        // 1. 어디서부터 2.어디까지 3.실행문 4.증감

        /*
            for( 1.시작값  ; 2.조건문 ; 4.증감식 ) {
                    3. 실행문;  // 만약에 조건이 true이면 실행
            }
            // 만약에 조건이 false이면 for끝남
         */

        // 예1)
            // i : 일반적으로 반복문에서 자주 사용되는 변수명
        for( int 반복변수 = 1 ; 반복변수<=10 ; 반복변수++ ) {
          // 반복변수가 1부터 // 반복변수 10이하까지 // ++ : 1증가
          // 반복변수가 1부터 10까지 1씩증가 반복한다.
            System.out.print( 반복변수 + "\t");
        } // for end

        // 예2) 누적합계
        int sum = 0; // 누적 값을 저장할 변수
        for( int i = 1 ; i<=100 ; i++ ){ // i가 1부터 100까지 1씩증가
            sum += i; //  vs   sum = sum + i
        } // for end
        System.out.println("\n1~100까지 누적합계 : " + sum );





    }
}
