package class12.파일입출력;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class 파일입출력 { // 클래스 선언
    public static void main(String[] args) { // main메소드
        /*
            1. 파일[txt:메모장] 입출력
             -FileOutputStream : 파일 출력 클래스
                FileOutputStream 객체명 = new FileOutputStream(" 파일 경로 ")
                    [출력=내보내기] 객체명.write() : 바이트 만 출력이 가능

             -FileInputStream : 파일 입력 클래스
                FileInputStream fileInputStream = new FileInputStream(" 파일 경로 ");
                    [입력=읽어오기] 객체명.read( 바이트배열 ) : 바이트 만 읽기 가능

             - 문자열 -> 바이트열 변환
                 문자열.getBytes()   : 해당 문자열이 바이트열로 변환
             - 바이트열--> 문자열 변환
                 new String ( 바이트열 )
                 new String ( 바이트열 , 시작 , 끝 ) 시작인덱스부터 끝 인덱스까지 문자열 변환

             무조건 오류발생 : 만약에 파일이 없을때 에 대한 대책[예외처리]
                 - try{ }catch( 예외클래스명 객체명 ) { }

             바이트 : 컴퓨터가 데이터를 저장하는 최소단위

                    비트 : 0 , 1     [ 1비트 ]
                    바이트 : 01010101 [ 비트가 8개 모이면 -> 8비트 -> 1바이트 ]
                    킬로바이트 : 1024B -> 1KB
                    메가바이트 : 1024KB -> 1MB
                    기가바이트 : 1024MB -> 1GB
                 */


        try { // try s [ 오류가 발생할것 같은 코드 ]
            // 1. 파일 출력 객체 선언
            FileOutputStream fileOutputStream = new FileOutputStream("C:/java/test.txt");
            Scanner scanner = new Scanner(System.in); // 입력객체
            // 2. 문자열 변수 선언
            System.out.print("파일에 저장할 내용 : "); String 문자열 = scanner.nextLine();
            // 3. 파일에 데이터 출력 [ 출력객체.write( 바이트 )
            fileOutputStream.write( 문자열.getBytes() );

            // 1. 파일 입력 객체 선언
            FileInputStream fileInputStream = new FileInputStream("C:/java/test.txt");
            // 2. 파일내 텍스트 읽어오기  [ 바이트로 읽어온 다음에 문자열 변환 ]
            byte[] 바이트배열 = new byte[1024]; // 바이트를 저장할 배열 선언 [ 1kb ]
            int count = fileInputStream.read( 바이트배열 ); // 파일내 바이트를 읽어와서 배열에 저장
            // count변수 : 읽어온 횟수 저장하는 변수
            // 바이트 -> 문자열                           문자열 -> 바이트
            // new String( 바이트열 )   --->  문자열           문자열.getBytes()
            // new String( 바이트열 , 시작 , 끝 )
            String 메모문자열 = new String(바이트배열 , 0 , count-1);
            // 3. 읽어온 바이트 출력
            System.out.println( "파일내 작성된 내용 : " + 메모문자열 );


        } // try e
        catch ( Exception e ){ // catch s [ 오류가 발생했을때 대체 코드 ]
            System.out.println("경고] 해당 경로에 파일이 없습니다.");
        } // catch e

    } // main메소드 end

} // 클래스 end
