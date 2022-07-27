package class4; // 패키지명

public class page134_if { // c s

    public static void main(String[] args) { // m s

        // 제어문
            // 컴퓨터의 코드 흐름은 위에서 아래로 순서대로
            // 집 근처 편의점에서 1000원 주고 콜라 사오기 주문
                // 컴퓨터 스스로 판단력 없다 --> 제어
                    // A편의점 1300
                    // B편의점 1200
                    // C편의점 900
                // -----------------------------------
                    //  IF ( A편의점 <= 1000 ) 구매한다.
                    //  ELSE IF( B편의점<= 1000 ) 구매한다.
                    //  ELSE IF( C편의점<= 1000 ) 구매한다.
                    //  ELSE 집으로 돌아온다.
        // if : [논리제어] 만약에 조건이 충족하면
        // switch : [값제어] 만약에 데이터가 OO 이면

        /*
         if 사용방법
             1. if( 조건 ) 실행문;
             2. if( 조건 ){
                    실행문;
                    실행문;
                }
             3. if( 조건 ) { 실행문; }
                else { 실행문; }
             4. if( 조건1 ) { 실행문; }
                else if( 조건2 ) { 실행문; }
                else if( 조건3 ) { 실행문; }
                else if( 조건4 ) { 실행문; }
                else{ 실행문; }
             *4 if( 조건1 ) { 실행문; }
                if( 조건2 ) { 실행문; }
                if( 조건3 ) { 실행문; }
                if( 조건4 ) { 실행문; }
                else{ 실행문; }

        */
        int score = 93; // int형(4바이트정수) 변수 선언과 93 으로 초기값 대입

        if( score>=90 ) System.out.println("등급은 A입니다.");

        if( score>=90 ) { // if s
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급이 A입니다.");
        }// if e

        if( score<90 )
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급 B 등급 입니다."); // if와 관련없는 실행문

        // p.137
        score = 85; // int(자료형) 가 없는 이유
                        // 1. 이미 만들어진 변수명 [ 동일한 이름으로 변수 선언 불가능  ]
                        // 2. 값 변경[대입]
        if( score>=90 ){ // if s // 만약에 ~~ 이면
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }else{ // else s // 만약에 아니면
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");
        } // slse e

        // p. 139
        score = 75;
        if( score >= 90){ // 만약에 점수가 90 이상이면
            System.out.println("점수가 100~90 입니다.");
            System.out.println("등급은 A입니다.");
        } else if( score>=80){ // 아니면 점수가 80점 이상이면
            System.out.println("점수가 80~89입니다.");
            System.out.println("등급은 B입니다.");
        }else if( score>=70){ // 아니면 점수가 70점 이상이면
            System.out.println("점수가 70~79입니다.");
            System.out.println("등급은 C입니다.");
        }else{ // 그외
            System.out.println("점수가 70 미만입니다.");
            System.out.println("등급은 D입니다.");
        }

    } // m e
} // c e
