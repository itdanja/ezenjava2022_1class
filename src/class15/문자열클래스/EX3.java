package class15.문자열클래스;

public class EX3 {
    public static void main(String[] args) {

        // p.492  4. 문자열.indexOf("검색어") : 해당 검색어의 위치(인덱스) 찾기
        String subject = "자바 프로그래밍";
                        //0 1 23 4 5 6 7
        int location = subject.indexOf("프로그래밍");
        System.out.println("찾은 위치 : " + location );

        if( subject.indexOf("자바") != -1 ){ // 인덱스는 0부터 시작하기 때문에 -1 이면 없다 의미
            System.out.println("자바와 관련된 책이군요.");
        }else{
            System.out.println("자바와 관련없는 책이군요.");
        }
        // p.493  5. 문자열.length( )
        String ssn = "7306241230123"; // 문자열
        int length = ssn.length(); // 문자열의 길이
        if( length == 13 ){
            System.out.println("주민번호 자리수가 맞습니다.");
        }else{
            System.out.println("주민번호 자리수가 틀립니다.");
        }

        // p.494    6.replace( "기존문자" , "새로운문자" ) : 기존문자를 새로운문자로 치환[교체]
        String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
        String newStr = oldStr.replace("자바","JAVA");
        System.out.println( oldStr );
        System.out.println( newStr );

        // p.495    7.substring( 시작인덱스 , 개수 ) : 문자열에서 시작인덱스부터 개수만큼 추출
        String ssn2 = "880815-1234567";                 // 1. 문자열
        String firstNum = ssn2.substring( 0 , 6 );      // 2. 0부터 6개를 추출  880815
        System.out.println( firstNum );                 // 3. 880815
        String secondNum = ssn2.substring( 7 ); // 4. 7부터 전부 추출
        System.out.println( secondNum );                // 5. 1234567

        // p.496    8. toLowerCase()  , toUpperCase() : 소 / 대 문자 변환 메소드
        String str1 = "Java Programming";
        String str2 = "JAVA Programming";
        System.out.println( str1.equals(str2) ); // 다르다. [ 대소문자가 다르다 ]
        String lowerStr1 = str1.toLowerCase();
        String lowerStr2 = str2.toLowerCase();
        System.out.println(lowerStr1.equals(lowerStr2) ); // 같다.

        // p.497    9. trim()       :   앞 뒤 공백 제거 메소드
        String tel1 = "   02";
        String tel2 = "123    ";
        String tel3 = "    1234    ";
        String tel = tel1.trim() + tel2.trim() + tel3.trim();
        System.out.println( tel ); // 021231234

        // p.498    10. valueOf( )  :  다른 자료형을 문자열로 변환
        String str3 = String.valueOf( 10 );     // 정수 10  --> 문자열 10   변환
        String str4 = String.valueOf(10.5);     // 실수 10.5 --> 문자열 10.5 변환
        String str5 = String.valueOf( true );   // 논리 true --> 문자열 true 변환

        System.out.println( str3+1 );
        System.out.println( str4+1 );
        System.out.println( str5+1 );















    }
}












