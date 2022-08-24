package class12.회원게시판;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class File {
    // 1. 저장메소드
    public static void Filesave( ){
        try {
            // 1. 파일출력 객체 선언
            FileOutputStream fout = new FileOutputStream("C:/java/memberlist.txt");
            // 2. 파일에 작성할 문자열을 저장할 변수 선언
            String 내보내기 = "";
                // * 리스트에 저장된 모든 객체들의 필드 정보를 하나의 문자열 저장
            for( int i = 0 ; i<Start.memberlist.size() ; i++ ){
                Member temp = Start.memberlist.get(i); // i번째 인덱스 호출
                내보내기 += temp.getId() +",";
                내보내기 += temp.getPassword()+",";
                내보내기 += temp.getName()+",";
                내보내기 += temp.getPhone()+"\n";   // 필드간 , 구분  // 객체(회원)간 \n 구분
            }
            // 3. 변수에 저장된 내용을 바이트로 변환후 출력
            fout.write( 내보내기.getBytes() );

        }catch ( Exception e ){
            System.out.println("안내) 파일이 없습니다.");
        }
    } // method end

    // 2. 호출메소드
    public static void Fileload( ){
        try {
            // 1. 파일 입력 객체
            FileInputStream fin = new FileInputStream("c:/java/memberlist.txt");
            byte[] bytes = new byte[10000000]; // 대략 1mb
            int count = fin.read( bytes );
            String 가져오기 = new String( bytes , 0 , count-1);
            // 문자열 -> 객체 -> 리스트 저장 ???
            System.out.println("파일에 등록된 텍스트 : " + 가져오기);
        }catch (Exception e ){
            System.out.println("안내) 파일이 없습니다.");
        }
    } // method end

} // class end
















