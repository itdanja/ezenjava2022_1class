package class12.회원게시판;

import java.util.ArrayList;
import java.util.Scanner;

public class Start {
    // 메소드 밖에 선언[ 왜? 여러 메소드에서 사용할 예정인 변수/객체 들 ]
        // { } 안에서 선언된 변수/객체는 { } 밖으로 못나감 = 지역변수 특징
    public static Scanner scanner = new Scanner(System.in); // 1. 입력객체
    public static ArrayList<Member> memberlist = new ArrayList<>(); // 2. 리스트 선언
        // ArrayList 클래스 [ 객체 여러개를 저장할수 있는 리스트 객체 ]
            // 리스트명.add( 객체 ) : 리스트에 객체 추가
            // 리스트명.remove( 인덱스번호 ) : 해당 인덱스번호에 객체 삭제
            // 리스트명.get( 인덱스번호 ) : 해당 인덱스번호에 객체 호출

    public static void main(String[] args) {
        File.Fileload();  // 프로그램 시작시 모든 회원정보 불러오기
        while( true ){ // 무한루프
            System.out.println("------------ 메인 페이지 -------------");
            System.out.print("1.로그인 2.회원가입   선택) : ");
            try { // 만약에 try 괄호 안에서 오류 발생을 안했을때 -> 정상 실행
                int ch = scanner.nextInt(); // .nextInt() : 정수 입력받기 -> 만약에 문자 입력시 오류 발생
                if (ch == 1) { 로그인(); }    // 1번 입력시 로그인 함수 호출
                else if (ch == 2) {  회원가입(); }  // 2번 입력시 회원가입 함수 호출
                else{  System.out.println("안내) 알수 없는 번호입니다."); }
            } // try end
            catch (Exception e ){ // 만약에 try 괄호 안에서 오류 발생시 -> catch 이동
                System.out.println("안내) 숫자 로 입력해주세요 ");
                scanner = new Scanner( System.in); // ** 오류 발생시 입력객체 초기화
            } // catch end
        } // w end
    } // m end
    public static void 로그인(){
        System.out.println("------------ 로그인 페이지 -------------");
        System.out.print("아이디 : ");      String id = scanner.next();
        System.out.print("비밀번호 : ");    String pw = scanner.next();
        // 리스트에서 동일한 아이디와 비밀번호 찾기
        for( int i = 0 ; i<memberlist.size() ; i++ ){
            // i는 0부터 리스트의 마지막인덱스까지 1씩 증가 반복
            if( memberlist.get(i).getId().equals( id ) &&
                memberlist.get(i).getPassword().equals( pw ) ){
                // 만약에 i번째 인덱스 객체의 아이디 와 입력한 아이디가 같고
                //    i번째 인덱스 객체의 비밀번호 가 입력한 비밀번호 와 같으면
                    System.out.println("안내) 로그인 성공 ");
                return; // 함수 강제 종료
            } // if end
        } // for end
        System.out.println("안내) 로그인 실패 [ 동일한 회원정보가 없습니다.] ");
    } // 로그인 함수 end

    public static void 회원가입(){   // 4개를 입력받아 -> Member 객체 -> 리스트 저장 -> 파일 저장
        System.out.println("------------ 회원가입 페이지 -----------");
        System.out.print("아이디 : ");     String id = scanner.next();  // 1. 입력받기 -> 변수
        System.out.print("비밀번호 : ");   String pw = scanner.next();
        System.out.print("이름 : ");       String name = scanner.next();
        System.out.print("전화번호 : ");   String phone = scanner.next();
        Member member = new Member( id , pw , name , phone );  // 2. 변수4개 --> 객체화 [ 생성자( 변수 , 변수 , 변수 , 변수 ) ]
        memberlist.add( member );   // 3. 객체를 리스트에 저장하자
        File.Filesave(); // 4. 리스트에 객체를 저장하는 메소드 호출
    } // 회원가입 end



} // c end












