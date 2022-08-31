package class14.API클래스;

public class SmartPhone { // 자동으로 Object클래스에게 상속받음
    //필드
    private String company;
    private String os;
    //생성자
    public SmartPhone(String company , String os ) {
        this.company = company;
        this.os = os;
    }
    //메소드
    @Override // 오버라이딩( 상속받은 메소드를 재구현 )
    public String toString() {
        return company +","+os;
    }
}
