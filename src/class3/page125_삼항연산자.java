package class3;

public class page125_삼항연산자 {

    public static void main(String[] args) {

        // 6. 삼항연산자
            //  조건(비교연산자) ? 참(T) : 거짓(F)
            // 조건1 ? 참(T) : 조건2 ? 참2(T) : 거짓
        int score = 95;
        char grade = (score > 90) ? 'A' : 'B';
        // 만약에 점수가 90 초과이면 A  아니면 B
        System.out.println(" 등급 : " + grade );

        char grade2 = ( score>90 ) ? 'A' : ( score>80 ) ? 'B' : 'C';



    }

}
