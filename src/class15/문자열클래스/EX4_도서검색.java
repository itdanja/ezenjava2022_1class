package class15.문자열클래스;

public class EX4_도서검색 {
    public static void main(String[] args) throws Exception {

        // 도서목록
        String[] 도서목록 = { "된다! 네이버 블로그&포스트" ,
                            "스프링 부트 실전 활용 마스터" ,
                            "Tucker의 Go 언어 프로그래밍" ,
                            "혼자 공부하는 C언어" };
        while( true ){ // 무한루프
            System.out.print("1.검색 2.수정 3.종료 : ");
            byte[] bytes = new byte[100];      // 1. 바이트100개 저장할수 있는 배열
            int count =  System.in.read( bytes );    // 2. 키보드 입력된 바이트를 배열에저장한다
            // 3. 배열에 저장된 바이트를 문자열로 변환한다.
            String ch = new String( bytes , 0 , count-1);
            if( ch.equals("1") ){
                System.out.print("---> 찾을 도서 검색 : ");
                count = System.in.read( bytes );
                String search = new String( bytes , 0 , count -1 );
                System.out.println("-> 검색단어 : " + search );
                for( int i = 0 ; i<도서목록.length ; i++ ){
                    if( 도서목록[i].indexOf(search) != -1 ){   // -1 아니면 찾았다.
                        System.out.println(" -----> " + 도서목록[i]);
                    } // if end
                } // for end
            } // if (1) end
            else if( ch.equals("2") ){
                System.out.print("---> 수정 도서 검색 : ");
                // 1. 키보드로 부터 입력받은 바이트를 바이트배열 저장
                count = System.in.read( bytes );   // count : 읽어온 바이트 개수
                // 2. 읽어온 바이트개수[-1:엔터제거] 만큼 문자열 변환
                String search = new String( bytes , 0 , count-1 );
                // 3.
                for( int i = 0 ; i< 도서목록.length ; i++ ){
                    // i는 0 부터 배열의길이[4] 미만 까지 1씩 증가 [ 0 ~ 3 ] 4회 반복
                    if( 도서목록[i].indexOf( search ) != -1 ){
                        // i번째 인덱스의 도서명에 입력받은 데이터가 포함되어 있으면 [ -1 이면 없다 ]
                        System.out.println( i+"번 : " + 도서목록[i]);
                    } // if end
                } // for end
                // 4. 수정할 도서번호[인덱스] 선택
                count = System.in.read( bytes );
                // 5. 문자열 ---> int형 [ Integer.parseInt( 문자열 ) ]
                int ch2 =  Integer.parseInt( new String( bytes , 0 , count-1) ) ;
                // 3. 수정할 단어
                count = System.in.read( bytes );
                String newstr = new String( bytes , 0 , count-1);
                // 4. 수정처리 [ replace( "기존문자" , "새로운문자" ) : 교체/치환/대치 ]
                String newbook = 도서목록[ ch2 ].replace( search , newstr);
                도서목록[ ch2 ] = newbook; // 대입
            } // else if end
            else{ }
        } // while end
    } // main end
} // class end

// 검색기능 , 수정 기능
    // 1.검색 : 특정 문자를 입력받아 도서내 포함된 문자가 있으면 모두 출력
        // 예 ) '언어' 검색 --> "Tucker의 Go 언어 프로그래밍" , "혼자 공부하는 C언어"
    // 2.수정 : 수정할 도서명의 일부를 입력받아 출력된 도서명 중에 번호를 선택후 수정 기능 적용
        // 예) '언어' 와 Language 입력 ->
            // "Tucker의 Go 언어 프로그래밍" , "혼자 공부하는 C언어"  선택하여
            //  1 선택시 : "혼자 공부하는 CLanguage" 변경
