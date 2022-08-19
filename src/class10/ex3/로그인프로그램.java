package class10.ex3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/*
    - 리스트  => Arraylist
    [ 리스트 선언 ] Arraylist<리스트에담을클래스명> 리스트명 = new Arraylist<>();
    [ 리스트 객체 추가 ] 리스트명.add( 객체 )
    [ 리스트 객체 삭제 ] 리스트명.remove( 인덱스 )
    [ 리스트 객체 호출 ] 리스트명.get( 인덱스 )

 */

public class 로그인프로그램 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 입력객체 선언
        ArrayList<Member> memberlist = new ArrayList<>(); // Member 객체를 여러개 저장할수 있는 리스트 선언
        while (true){ // 무한루프 [ 종료조건 X ]
            System.out.println("---------------------------------------");
            System.out.println("============ 회원제프로그램 ===========");
            System.out.println("-----------------------------------------");
            System.out.print(" 1. 회원가입 2.로그인 : "); int ch = scanner.nextInt();
            if( ch == 1 ){ // 회원가입 진행
                System.out.println("---------------------------------------");
                System.out.println("================ 회원가입 ==============");
                System.out.println("-----------------------------------------");
                System.out.print("안내] 1.관리자회원 2.일반회원 :"); int ch2 = scanner.nextInt();
                System.out.print("안내] 아이디 : ");     String id = scanner.next();
                System.out.print("안내] 비밀번호 : ");   String pw = scanner.next();
                if( ch2 == 1 ){ // 관리자
                    System.out.print("안내] 부서 : ");    String pm =scanner.next();
                    ADMIN admin = new ADMIN( id , pw , pm ); // 1. 객체 생성
                    memberlist.add( admin ); // 2. 리스트에 객체 저장
                }else if( ch2== 2){ // 일반회원
                    System.out.print("안내] 성명 : ");    String name = scanner.next();
                    USER user = new USER( id , pw , name ); // 1. 객체 생성
                    memberlist.add( user ); // 2. 리스트에 객체 저장
                }
                System.out.println("안내] 회원가입 성공! 축하합니다.");
            }
            else if( ch == 2 ){ // 로그인
                System.out.println("---------------------------------------");
                System.out.println("================ 로그인 ==============");
                System.out.println("-----------------------------------------");
                System.out.print("안내] 아이디 "); String id = scanner.next();
                System.out.print("안내] 비밀번호 : "); String pw = scanner.next();
                boolean 로그인성공 = false;  // 리스트에서 동일한 아이디와 비밀번호 찾기
                for( int i = 0 ; i<memberlist.size() ; i++ ){ // i는 0부터 리스트의 길이까지 1씩 증가 반복
                    if( memberlist.get(i).getId().equals( id) ){ // 만약에 i번째 인덱스 객체의 아이디와 입력받은 아이디와 같으면
                        if( memberlist.get(i).getPassword().equals( pw ) ){  // 만약에 i번째 인덱스 객체의 패스워드가 입력받은 패스워드와 같으면
                            System.out.println("안내] 로그인성공! 안녕하세요");
                            로그인성공 = true;
                            while (true){ // 로그인성공메뉴
                                System.out.println("========== 회원 메뉴 ===========");
                                System.out.print("1.회원탈퇴 2.로그아웃 : ");
                                int ch3 = scanner.nextInt();
                                if( ch3 == 1 ){
                                    System.out.println("-------------------------");
                                    System.out.print("안내] 정말 탈퇴 하시겠습니까? [Y:예 / N:아니요]");
                                    String ch4 = scanner.next();
                                    if( ch4.equals("Y") || ch4.equals("y") ) {
                                        memberlist.remove(i); // i : 로그인 성공한 객체의 인덱스
                                        // 리스트명.remove(인덱스) : 해당 인덱스의 데이터 제거
                                        System.out.println("안내] 회원탈퇴가 되었습니다. 안녕히 가세요!");
                                        break; // 로그아웃
                                    }
                                }
                                else if( ch3 == 2 ){
                                    System.out.println("안내] 로그아웃 합니다. ");
                                    break; // 가장 가까운 반복문 탈출
                                }
                                else{  System.out.println("안내] 알수없는 번호입니다. ");  }
                            } // while end
                            break;
                        }else{
                            System.out.println("안내] 패스워드가 다릅니다. "); break;
                        }
                    } // if end
                } // for end
                // 만약에 로그인성공이 false 이면 로그인 실패~
                if( 로그인성공 == false ){ System.out.println("안내] 로그인 실패 ");  }
            } // else if end
            else{
                System.out.println("안내] 알수 없는 행동입니다. ");
            }
        } // while end
    } // main end
} // class end
