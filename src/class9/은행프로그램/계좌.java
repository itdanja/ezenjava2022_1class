package class9.은행프로그램;

public class 계좌 { // 클래스 선언
    // public : 모든 패키지에서 호출 가능 키워드
        // class : 클래스 선언 키워드
    // 클래스 멤버
        // 1. 필드
    private String 계좌번호;
    private String 비밀번호;
    private String 계좌주;
    private String 은행명;
    // private : 현재 클래스에서만 호출 가능 키워드
        // 2. 생성자
    // 자동생성 -> 마우스 오른쪽클릭 -> Generate -> Constructor
    // 0.빈생성자
    public 계좌( ){ }
    // 1.모든 필드를 사용하는 생성자
    public 계좌(String 계좌번호, String 비밀번호, String 계좌주, String 은행명) {
        this.계좌번호 = 계좌번호;
        this.비밀번호 = 비밀번호;
        this.계좌주 = 계좌주;
        this.은행명 = 은행명;
    }
    // 3. 메소드
    // 필드에 private 사용할경우 외부와 연결 -> setter / getter
    // 자동생성 -> 마우스 오른쪽클릭 -> Generate -> getter and setter
    public String get계좌번호() {  return 계좌번호; }
    public void set계좌번호(String 계좌번호) {  this.계좌번호 = 계좌번호; }
    public String get비밀번호() { return 비밀번호;  }
    public void set비밀번호(String 비밀번호) { this.비밀번호 = 비밀번호; }
    public String get계좌주() {  return 계좌주;  }
    public void set계좌주(String 계좌주) { this.계좌주 = 계좌주;  }
    public String get은행명() { return 은행명; }
    public void set은행명(String 은행명) { this.은행명 = 은행명; }
}
