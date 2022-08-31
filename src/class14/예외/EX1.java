package class14.예외;

public class EX1 {

    public static void main(String[] args) {
    /*
        에러 : 컴퓨터 내부[하드웨어] 문제가 발생했을때
        예외 : 프로그램 내부[소프트웨어]에서 문제가 발생했을때
            1.Exception 클래스 [ 자바 100% 객체지향언어]
            2. 종류
                1. 일반예외 : 컴파일[실행]전에 예외발생 검사
                2. 실행예외 : 컴파일[실행] 도중에 예외 발생
                    * 개발자의 경험으로 예외가 발생 할것 같은 코드에 예외 처리
     */
        // p.446
        /*
        String data = null;
        System.out.println( data.toString() ); // !!! : 예외 발생
         */
            // data 객체에 null 이면 아무것도 없다는 의미
            // .toString() : 객체정보 출력 [ null 이면 출력 X ]
            // 예외 발생 : NullPointerException

        // p.447
        /*
        int[] 배열 = new int[3]; // 배열의 길이 3
            배열[0] = 10;
            배열[1] = 20;
            배열[2] = 30;
            배열[3] = 40; // <------------- 길이 3 인데 4번째 값 저장 [ 예외 발생 ]
        System.out.println("args[0] : " + 배열[0] );
        System.out.println("args[0] : " + 배열[1] );
        */
        // 예외 발생 : .ArrayIndexOutOfBoundsException [ 배열에 인덱스가 없다 ]

        // p.449
        String data1 = "100";
        String data2 = "a100";
        int value1 = Integer.parseInt( data1 );
        int value2 = Integer.parseInt( data2 );

        int result = value1 + value2;
        System.out.println( data1 +"+"+data2+"="+result);
            // Integer.parseInt( 문자열 ) -> 숫자열 변환 메소드
            //  'a' --숫자변환---> 불가능       'a' -> 불가능
            //  '100' --숫자변환---> 가능하다.  '100' -> 100
        // 예외 발생 : .NumberFormatException
    }
}



