package class4;

    // { } : 클래스정의 , 함수정의 , if , for

    /*
        자판기[키오스크] 프로그램
            조건1 : 메뉴 [ 1.콜라(300) 2.환타(200) 3.사이다(100) 4.결제 ]
            조건2 : 초기 재고는 각 제품별로 10개씩
            조건2 : 제품 메뉴 선택시 장바구니에 담는다.
            조건3 : 결제 메뉴 선택시 장바구니내 모든 제품을 한번에 결제한다.
            조건4 : 결제시 금액이 부족하면 결제불가 혹은 결제금액보다 크면 잔돈 출력
     */

import java.util.Scanner;

public class EX3 { // class s
    public static void main(String[] args) { // main s

        //  * 입력객체
        Scanner scanner = new Scanner(System.in);
        // 3. 변수 vs 배열
        // 방법1 : 변수를 여러개 사용
        // int 콜라재고 = 10;  int 환타재고 = 10; int 사이다재고 = 10;
            // -> n개 -> 1개[배열]
            // 인덱스 : 배열에 저장된 순서번호 [ 0번시작 ]

        // 방법2 : 배열을 사용 [ 배열선언 -> 재고 채운다 ]
//        int[] 재고목록 = new int[3]; // 전제조건 : [0] 콜라 [1]환타 [2]사이다
//        for( int i = 0 ; i<3 ; i++ ){ 재고목록[i] = 10; }

        // 방법3 : 배열을 사용 [ 배열 선언과 동시에 재고를 넣어준다.
        int[] 재고목록 = { 10 , 10 , 10 }; // 배열 선언과 동시에 초기값
        //               [0] , [1] , [2]
        int[] 장바구니목록 = { 0 , 0 , 0 };

        // 1. 메뉴 반복실행한다.
        while ( true ) { // 무한루프[무한반복]
            System.out.println("------------ 롯데리아 키오스크 ----------- ");
            System.out.println("1.콜라[300] 2.환타[200] 3.사이다[100] 4.결제 ");
            System.out.print(" >>안내) 버튼 선택 : ");
            int 선택버튼 = scanner.nextInt();
            // 2. 선택버튼 제어
            if( 선택버튼 == 1 ){ // if s
                System.out.println(" >>안내)콜라 선택했습니다.");
                // 재고목록 --> 장바구니 목록
                // 만약에 재고가 있을경우
                if( 재고목록[선택버튼-1] == 0 ){ // 재고가 없으면
                    System.out.println(">>안내) 구매불가 [재고가 없습니다.]");
                } // if end
                else{ // 재고가 있으면
                    System.out.println(">>안내)) 장바구니 콜라 1개를 담앗습니다.");
                    재고목록[ 선택버튼-1 ]--;   // 콜라재고 1 감소
                    장바구니목록[선택버튼-1]++;   // 콜라장바구니 1증가
                }// else end
            } // if end
            else if( 선택버튼 == 2 ) {
                System.out.println(">>안내)환타 선택했습니다.");
                if( 재고목록[선택버튼-1] == 0 ){  // 재고가 없으면
                    System.out.println(">>안내) 구매불가 [재고가 없습니다.]");
                } // if end
                else{  // 재고가 있으면
                    System.out.println(">>안내)) 장바구니 환타 1개를 담앗습니다.");
                    재고목록[ 선택버튼-1 ]--;   장바구니목록[선택버튼-1]++;
                }// else end
            }
            else if( 선택버튼 == 3 ) {
                System.out.println(">>안내)사이다 선택했습니다.");
                if( 재고목록[선택버튼-1] == 0 ){  // 재고가 없으면
                    System.out.println(">>안내) 구매불가 [재고가 없습니다.]");
                } // if end
                else{  // 재고가 있으면
                    System.out.println(">>안내)) 장바구니 사이다 1개를 담앗습니다.");
                    재고목록[ 선택버튼-1 ]--;   장바구니목록[선택버튼-1]++;
                }// else end
            }
            else if( 선택버튼 == 4 ) {
                System.out.println(">>안내)결제 합니다.");
                System.out.println("------- 결제할 제품 목록 ----------");
                System.out.println("제품명\t수량\t가격");
                if( 장바구니목록[0] != 0 )
                System.out.println("콜라\t"+장바구니목록[0]+"개\t\t"+(장바구니목록[0]*300)+"원" );
                if( 장바구니목록[1] != 0 )
                System.out.println("환타\t"+장바구니목록[1]+"개\t\t"+(장바구니목록[1]*200)+"원" );
                if( 장바구니목록[2] != 0 )
                System.out.println("사이타\t"+장바구니목록[2]+"개\t\t"+(장바구니목록[2]*100)+"원" );
            }
            else System.out.println(">>안내)알수 없는 번호 입니다. ");
        } // while end

    } // main e
} // class e


