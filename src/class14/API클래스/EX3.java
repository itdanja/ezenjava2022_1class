package class14.API클래스;

public class EX3 {
    public static void main(String[] args) {

        // p.481 System.nanoTime()  : 밀리초[1000/1초] 나노[ 10000000000/1초 ]
        long time1 = System.nanoTime(); //  <------ 시작 시간을 변수에 대입
        int sum = 0;
        for( int i = 1 ; i<=100000000 ; i++ ){
            // i는 1부터 백만까지 1씩증가
            sum += i ; // i를 sum변수에 누적합계
        }
        long time2 = System.nanoTime(); // <-------- 끝 시간을 변수에 대입

        // 결과
        System.out.println("1~1000000까지의 합 : " + sum );
        System.out.println("계산에 " + (time2-time1) + " 나노초가 소요되었습니다. ");

        // p.480 System.exit(0); : 프로그램 강제 종료 메소드
        for( int i = 0 ; i<10 ; i++ ){
            // i가 0부터 10미만까지 1씩증가 반복 [ 0~9 : 10회 반복 ]
            System.out.println( i );
            if( i == 5 ){  // 만약에 i가 5 이면
                System.exit(0); // 프로그램 강제 종료 메소드
            } // if end
        } // for end

        // 위에서 프로그램이 강제 종료 되었기 때문에 실행 X
        System.out.println("[프로그램 종료]");

    } // main end
} // class end

