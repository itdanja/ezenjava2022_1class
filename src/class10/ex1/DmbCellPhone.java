package class10.ex1;
/* 상속
        1. [생활] 부모에게 자산 물려받기
            // 부모 -> 자식 선택
        2. [컴퓨터] 부모에게 메모리 물려받기
            // 자식 -> 부모 선택 = extends
        // 상속받으면 자식은 부모의 자산/메모리 사용가능
        /
*/

public class DmbCellPhone extends CellPhone {
                // extends : 연장하다[상속 키워드]
    // 1.필드
    int channel;
    // 2. 생성자 [ 객체 생성시 초기값(처음값) ]
    DmbCellPhone( String model , String color , int channel) {
        this.model = model;
        this.color = color;
        this.channel = channel;
        // this.필드명 : 현 클래스의 필드
    }
    // 3. 메소드
    void turnOnDmb(){
        System.out.println("채널 "+channel+"번 DMB 방송 수신을 시작합니다. ");
    }
    void changeChanneDmb( int channel ){
        this.channel = channel;
        System.out.println("채널 " + channel + "번으로 바꿉니다.");
    }
    void turnOffDmb(){
        System.out.println("DMB 방송 수신을 멈춥니다.");
    }
}

