package class13;

public class EX1 {

    public static void main(String[] args) {

        RemoteControl rc;  /* 인터페이스 변수 선언 */

        System.out.println(" *리모컨에 텔레비전 연결 ");
        rc = new Television();   /* 인터페이스 변수에 구현객체 대입 */
            rc.turnOn();
            rc.turnOff();
            rc.setVolume( 3 );

        System.out.println(" *리모컨에 오디오 연결");
        rc = new Audio();  /* 인터페이스 변수에 구현객체 대입 */
            rc.turnOn();
            rc.turnOff();
            rc.setVolume( 8 );

        System.out.println(" *리모컨에 스마트tv 연결");
        rc = new SmartTelevision();
            rc.turnOn();
            rc.turnOff();
            rc.setVolume( 15 );
        System.out.println(" *검색기능에 스마트tv 연결 ");
        Searchable search = new SmartTelevision();
            search.search("엠비씨");
            
            
            

    }
}
