package class6;

import java.util.Scanner;

public class EX1_학생점수관리프로그램 { // class start
    public static void main(String[] args) { // main start

        Scanner scanner = new Scanner(System.in); // 1. 입력객체
        int[] 학생점수목록 = null;  // 2.여러명 학생들의 점수를 저장하는 배열 선언

        while ( true ){ // 무한루프 [ 종료조건 : 4 입력했을때 종료된다 ]
            System.out.println("1.학생수 2.점수입력 3.분석(높은순으로출력) 4.종료");
            System.out.print("안내) 선택 : "); int ch = scanner.nextInt();
            if( ch == 1 ){
                System.out.print("안내) 학생수 : "); int count = scanner.nextInt();
                학생점수목록 = new int[count]; // 입력받은 수 만큼 배열의 길이로 선언하기
            }
            else if( ch == 2 ){
                System.out.println(" 학생수 : " + 학생점수목록.length +"명");
                for( int i = 0 ; i< 학생점수목록.length ; i++ ){
                    System.out.print(i+"번째 학생 점수 입력 : ");
                    학생점수목록[i] = scanner.nextInt();
                }
            }
            else if( ch == 3 ){
                // 배열 정렬 [ 높은순으로 출력(내림차순) ]
                for( int i = 0 ; i<학생점수목록.length ; i++ ){
                    // i : 비교기준 [  i 는 0부터 배열의길이까지 1씩 증가한다.
                    for( int j = i+1 ; j<학생점수목록.length ; j++ ){
                        // j : 비교대상 [ j는 i+1 부터 배열의길이까지 1씩 증가한다.
                        if( 학생점수목록[i] < 학생점수목록[j] ){
                            // 비교대상이 더 크면 값 교환[스왑]
                            int temp = 학생점수목록[i];
                            학생점수목록[i] = 학생점수목록[j];
                            학생점수목록[j] = temp;
                        } // if end
                    } // for end
                } // for end
                // 정렬 후 출력
                for( int i = 0 ; i< 학생점수목록.length ; i++ ){
                    System.out.println( (i+1)+"등 점수 : " + 학생점수목록[i] );
                }

            } // else if end
            else if( ch == 4 ){
                System.out.println("안내) 프로그램을 종료 합니다.");
                break;  /* 가장 가까운 반복문 탈출 */
            }
            else { System.out.println("안내) 알수 없는 행동입니다."); }
        } // while end
    } // main end
}// class end


/*
        90  95  90
        i = 90 일때
            j = 95  i < j
            j = 90  i < j
        i = 95 일때
            j = 90  i < j


 */











