package class13;

public class SmartTelevision implements RemoteControl , Searchable {
                        // 다중 인터페이스 구현 클래스 [ 2개이상의 인터페이스 연결 가능 ]
    private int volume;
    @Override
    public void turnOn() { System.out.println("스마트tv 켭니다."); }
    @Override
    public void turnOff() { System.out.println("스마트tv 끕니다.");  }
    @Override
    public void setVolume(int volume) {
        if( volume > RemoteControl.MAX_VOLUME ){ this.volume = RemoteControl.MAX_VOLUME; }
        else if( volume < RemoteControl.MIN_VOLUME ){ this.volume = RemoteControl.MIN_VOLUME; }
        else { this.volume = volume; }
        System.out.println("현재 스마트tv 볼륨 : " + this.volume );
    }
    @Override
    public void search(String url) { System.out.println( url + "을 검색합니다.");  }
}
