package class15.문자열클래스;

public class EX1 {
    public static void main(String[] args) {
        /*
        String 클래스 : 문자열 관련된 클래스
            -문자열 저장하는 객체
            -문자열에 관련된 다양한 메소드 제공
        */
        // 1. String 객체 에 문자열 대입
        String 문자열1 = "유재석";
        System.out.println("문자열1 : " + 문자열1 );
        String 문자열2 = new String("강호동");
        System.out.println("문자열2 : " + 문자열2 );
        // p.485
        //      인덱스   0  1   2   3   4   5  6  7    8  9
        byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
                    //  H , e , l, l ,  o ,공백,J,a , v , a
                    // 아스키코드 [ 기계어 <---> 문자열 ]
        // 바이트배열 ---> 문자열 변환  : String 클래스
        String str1 = new String(bytes);    // new String( 바이트배열 ) -> 문자열
        System.out.println( str1 );

        String str2 = new String(bytes , 6 , 4 );
        System.out.println( str2 ); // new String( 바이트배열 , 시작번호 , 개수 )

        // p.486
        // 1. 100개 바이트를 저장할수 있는 바이트 배열 선언 [ 키보드 입력 단위 : 바이트 ]
        byte[] bytes2 = new byte[100];
        // 2. 출력
        System.out.print("입력 : ");
        // 3. 입력        [ System.in.read : 예외발생 ]
        try {  // 예외처리   [ System.in.read : 키보드로부터 바이트 읽어오기 ]
            int readByteNo = System.in.read(bytes2);
            System.out.println("읽어온 바이트 개수 : " + readByteNo );
            // [ readByteNo : 읽어온 바이트 개수 대입 ]
            // 바이트배열 --> 문자열 변환   바이트배열에서 0부터 읽어온바이트배수-1 [ -1 : \n 제외 ]
            String str = new String( bytes2 , 0 , readByteNo-1 );
            System.out.println(str);
        }catch ( Exception e ){}

        //








    }
}









