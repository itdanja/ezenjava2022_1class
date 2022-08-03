package class5;

public class page148_for {
    /*
     IF : 조건문 
        IF( 조건 ) { 실행문 }
        ELSE{ }
     FOR : 반복문 
        for( 초기값 ; 조건문 ; 증감식 ){  실행문; }
    */
    public static void main(String[] args) {
        // 예1 : 1부터 10까지 출력
        for( int i = 1 ; i<=10 ; i++ ){ // i는 1부터 10까지 1씩 증가처리 
            System.out.print( i +"\t" );
        } // for end
            System.out.println();
        // 예2 : 구구단
            // 2단
            for( int i = 1 ; i<=9 ; i++ ){ // i는 1부터 9까지 1씩 증가처리
                System.out.println(" 2 X "+i+" = " + (2*i) );
            }
            // 2~9단 구구단 [  단 : 2~9    / 곱 1~9  ] -> 8*9 => 72회 실행
            for( int 단 = 2 ; 단<=9 ; 단++ ){ // 단 은 2부터 9까지 1씩 증가처리
                // for 중첩
                for( int 곱 = 1 ; 곱<=9 ; 곱++ ){ // 곱 은 1부터 9까지 1씩 증가처리
                    System.out.println( 단 +"X"+곱+"="+(단*곱) );
                } // for end
            } // for end
    } // main end
} // class end
