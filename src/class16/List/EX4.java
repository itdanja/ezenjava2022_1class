package class16.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EX4 {
    public static void main(String[] args) {

        // ArrayList vs LinkedList
        List<String> list1 = new ArrayList<>(); // ArrayList 클래스로 리스트 선언
        List<String> list2 = new LinkedList<>(); // LinkedList 클래스로 리스트 선언

        long startTime;
        long endTime;

        // 1. ArrayList 저장 속도 테스트
        startTime = System.nanoTime(); // 현재 나노시간 호출
        for( int i = 0 ; i<10000 ; i++ ){ // 10000 반복
            list1.add( 0  , String.valueOf(i) );
        } // for end
        endTime = System.nanoTime();    // 현재 나노시간 호출
        System.out.println(" Arraylist 10000 번 저장 시간 : " + (endTime-startTime)+" ns");

        // 2. LinkedList 저장 속도 테스트
        startTime = System.nanoTime();
        for( int i = 0 ; i<10000 ; i++ ){
            list2.add( 0 , String.valueOf(i) );
        }// for end
        endTime = System.nanoTime();
        System.out.println(" LinkedList 10000 번 저장 시간 : " + (endTime-startTime)+" ns");


    } // main end
} // class end
