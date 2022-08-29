package class13;

// 인터페이스 선언시 : interface 키워드 사용
public interface RemoteControl {

    // 클래스 멤버 : 1.필드 , 2.생성자 , 3.메소드
    // 인터페이스 멤버 : 1.상수필드 2.추상메소드

    // 1. 상수필드 : 고정된 데이터
    public int MAX_VOLUME = 10; // final이 생략
    public int MIN_VOLUME = 0;

    // 2. 추상메소드 : 선언된 메소드 -> 각 클래스에서 구현
    public void turnOn();
    public void turnOff();
    public void setVolume( int volume );
}
