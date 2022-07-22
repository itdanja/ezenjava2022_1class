package class2;

public class page60_기본타입 {

    public static void main(String[] args) {

        /*
            - 기본타입 = 자료형 [ 미리 만들어진 메모리 공간 --> 효율적으로 쓰자  ]
                1. 정수타입
                    1. byte : 1byte +-127
                    2. short :2byte +-3만정도
                    3. *int  : 4byte +-20억정도 [ 정수 기본자료형 - 자료형 없는 정수 ]
                    4. long : 8byte 20억이상 [ 데이터뒤에 L ]
                2. 문자 타입
                    1. char : 2byte [ 유니코드 ]
                    2. String클래스 : 문자열 저장
                3. 실수 타입 [ 소수점 ]
                    1. float    4byte   소수점7자리 표현가능 [ 데이터뒤 f ]
                    2. *double   8byte   소수점15자리 표현가능    [ 실수 기본자료형 ]
                4. 논리 타입
                    1. boolean : 1byte   true 혹은 false [ 참 or 거짓 ]

            - 진수 [ 원래 컴퓨터 0/1 만 사용 -> 문제 : 표현단위 적다. ]
                2진수 : 0 혹은 1
                8진수 : 0 ~ 7
                10진수(생활) : 0 ~ 9
                16진수 : 0 ~ 9 A(10) B(11) C(12) D(13) E(14) F(15)

            -  아스키코드 vs 유니코드
                1000001[2진수] ---약속(규약)---> A[문자]
                -키보드(A)입력---번역--->컴퓨터내부(1000001)
                -모니터(A)출력<--번역---컴퓨터내부(1000001)
         */
        // p.61
        int var1 = 0b1011; // 2진수  [ 0b : 2진수 사용여부 ]
        System.out.println( "var1 : "+ var1 );
            // 1011  -> 2진수 -> 11 (10진수)
        int var2 = 0206;    // 8진수 [ 0 : 8진수 사용여부 ]
        System.out.println( "var2 : "+ var2 );
            // 206 -> 8진수 -> 134 (10진수)
        int var3 = 365;     // 10진수
        System.out.println( "var3 : "+ var3 );
            // 365 -> 10진수 -> 365 (10진수)
        int var4 = 0xB3;    // 16진수 [ 0x : 16진수 사용여부 ]
        System.out.println( "var4 : " + var4 );
            // B3 -> 16진수 -> 179  (10진수)

        // 1. byte : +-127
        //byte byte1 = -200;  // 오류발생 : 저장 범위 벗어남
        byte byte2 = -100;  // 저장 범위
        byte byte3 = 0;
        byte byte4 = 30;
        // 2. short : +- 3만
        //short short1 = 40000;   // 오류발생 : 저장 범위 벗어남
        short short2 = 20000;
        // 3. int : 20억정도
        //int int1 = 3000000000;  // 오류발생
        int int2 = 2000000000;
        // 4. long : 20억이상
        //long long1 = 4000000000;    // 입력데이터는 기본자료형 int
        long long2 = 4000000000L;   // 입력데이터를 LONG 변환 -> 데이터 뒤에 L

        // P.63
        char c1 = 'A';  // 문자 1개일 경우 ' ' / 문자 2개이상일경우 " "
        System.out.println("c1 : " + c1);
        char c2 = 65;
        System.out.println("c2 : " + c2 );
        char j = 74;
        char a = 65;
        char v = 86;
        System.out.println(" JAVA : " + j + a + v + a );
        // p.65
        //char c3 ="홍길동"; // char 한문자만 저장 가능
        String name ="홍길동"; // String 클래스는 여러개 문자열 저장 가능
        String job ="프로그래머";
        System.out.println(name);
        System.out.println(job);
        // p.66
        // float float1 = 3.14; // 3.14는 double 형 이기때문에 오류발생
        float float2 = 3.14f;   // 데이터 뒤에 f
        double double2= 3.14;   // O

        float float3 = 0.123456789123456789f; // float 소수점 7자리까지 가능
        System.out.println("float : " + float3);
        double double3 = 0.123456789123456789;
        System.out.println("double : " + double3 );

        // p.69
        boolean boolean1 = true;
        boolean boolean2 = false;
        // boolean boolean3 = 1;


    }

}
