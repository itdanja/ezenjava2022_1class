package class13;

public class Television implements RemoteControl  {
    // extends : 상속 [ 클래스 연결 ]
    // implements : 구현[ 인터페이스 연결 ]
        // 만일 인터페이스에 추상메소드가 있을경우 빨강줄 생김
        // 구현 한다고 했기때문에 인터페이스내 존재하는 추상메소드 모두 구현
        // ctrl+스페이바
    private int volume;
    // 추상메소드를 구현하기
    @Override
    public void turnOn() { System.out.println("TV를 켭니다."); }
    @Override
    public void turnOff() { System.out.println("TV를 끕니다."); }
    @Override
    public void setVolume(int volume) {
        if( volume>RemoteControl.MAX_VOLUME ){this.volume = RemoteControl.MAX_VOLUME;}
        else if( volume<RemoteControl.MIN_VOLUME ){ this.volume = RemoteControl.MIN_VOLUME;}
        else{this.volume = volume;}
        System.out.println("현재 TV 볼륨 : " + this.volume );
    }
}
