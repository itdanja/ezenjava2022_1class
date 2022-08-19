package class10.ex1;

public class 예제실행 {

    public static void main(String[] args) {

        // 1. 자식 클래스로 객체 선언
        DmbCellPhone dmbCellPhone =
                new DmbCellPhone("자바폰","검정",10);

        // 2. 클래스로부터 상속받은 필드 호출
        System.out.println("모델 : " + dmbCellPhone.model);
        System.out.println("색상 : " + dmbCellPhone.color);

        // 3.
        System.out.println("채널 : " + dmbCellPhone.channel);

        // 상속받은 메소드 호출
        dmbCellPhone.powerOn();
        dmbCellPhone.bell();;
        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동입니다.");
        dmbCellPhone.sendVoice("아~ 예 반갑ㄴ습니다.");
        dmbCellPhone.hangUp();
        // 본인 메소드
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChanneDmb( 12 );
        dmbCellPhone.turnOffDmb();



    }


}
