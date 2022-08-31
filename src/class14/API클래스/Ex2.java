package class14.API클래스;

import java.util.Date;

public class Ex2 {

    public static void main(String[] args) {
        // p.478 : toString() : 객체정보 출력하는 메소드
        Object obj1 = new Object();
        Date obj2 = new Date();

        System.out.println(" 객체1 정보 : " + obj1.toString() ); // 16진수 객체 번지
        System.out.println(" 객체2 정보 : " + obj2.toString() );

        // p.479
        SmartPhone myPhone = new SmartPhone("구글","안드로이드");

        System.out.println( myPhone.toString() );

    }
}
