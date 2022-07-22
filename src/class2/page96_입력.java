package class2;

import java.util.Scanner;
    // 미리 만들어진 클래스( 첫글자가 대문자 )들
    // 1. System : 입출력 관련 클래스
        // 1. System.out : 출력 [ 모니터 - console창 ]
        // 2. System.in : 입력 [ 키보드 ]
    // 2. String : 문자열 관련 클래스
    // 3. Scanner : 입력 관련 클래스
        // 1. new Scanner( System.in ) : 키보드 입력된 값 저장
        // 2. .next(); : 저장된 입력값을 호출
public class page96_입력 {
    public static void main(String[] args) {
        // 1. 입력 객체 생성 [ 키보드 입력된 데이터를 scanner 객체에 저장 ]
        Scanner scanner = new Scanner( System.in );
            // 1. 객체생성방법 : 클래스명 변수명 = new 생성자
        // 2. 입력 받기 [ scanner 객체에 저장된 데이터호출(next()) 후 문자열에 저장
        String 문자열 = scanner.next();
        // 3. 입력 값 출력
        System.out.println("입력한 값은 : " + 문자열 );
    }
}
