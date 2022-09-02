package class15.문자열클래스;

public class EX2 {
    public static void main(String[] args) {

        // p.487    1. 문자열.charAt( 인덱스 ) : 해당 인덱스의 문자 추출
        String ssn = "010624-1230123";
                //    01234567
        // 2. 7번 인덱스의 문자열 추출
        char sex = ssn.charAt( 7 );
        // 3.
        if( sex == '1' || sex == '3'){ // 1 혹은 3 이면
            System.out.println("남자 입니다.");
        }else{
            System.out.println("여자 입니다.");
        }

        // p.489    2. 문자열.equals( 비교문자열 )  : 두 문자열 비교
        String strVar1 = new String("신민철");
        String strVar2 = "신민철";
        // 문자열은 == 으로 비교가 불가능하다.
        if( strVar1 == strVar2 ){  System.out.println("같은 문자열 입니다."); }
        else{  System.out.println("다른 문자열 입니다."); }
        // 문자열은 equals 메소드를 이용한 비교를 한다.
        if( strVar1.equals( strVar2 ) ){  System.out.println("같은 문자열 입니다."); }
        else{  System.out.println("다른 문자열 입니다."); }

        // p.490    3. 문자열.getBytes()   : 문자열을 바이트열로 변환
        String str = "안녕하세요";           // 문자열
        byte[] bytes1 = str.getBytes( );    // "안녕하세요" --> 바이트 열
        System.out.println(" string --> bytes : " + bytes1 );
        String str1 = new String(bytes1);   // 바이트열 --> "안녕하세요"
        System.out.println(" bytes --> string : " + str1 );
        // 바이트 --> 한글 변환 ( 인코딩 ) [ 1.EUC-KR(영/한) / 2.UTF-8(모든언어) ]
        try {
            // 1. 문자열를 EUC-KR 인코딩 형식으로 바이트열로 변환
            byte[] bytes2 = str.getBytes("EUC-KR");
            // 2. 바이트 길이 -> 10  [ EUC-KR은 한글 한글자마다 2바이트 ]
            System.out.println("bytes2 길이 : " + bytes2.length );
            // 3. 바이트열을 EUC-KR 인코딩 형식으로 문자열 변환
            String str2 = new String( bytes2 , "EUC-KR");
            System.out.println("bytes -> String:" + str2 );

            // 1. 문자열을 UTF-8 인코딩 형식으로 바이트열로 변환
            byte[] bytes3 = str.getBytes("UTF-8");
            // 2. 바이트 길이 -> 15 [ UTF-8 은 한글 한글자마다 3바이트 ]
            System.out.println("bytes3 길이 : " + bytes3.length );
            // 3. 바이트열을 UTF-8 인코딩 형식으로 문자열 변환
            String str3 = new String( bytes3 , "UTF-8");
            System.out.println("bytes -> String:" + str3 );

        }catch ( Exception e ){}

   }
}
