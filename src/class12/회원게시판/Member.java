package class12.회원게시판;

public class Member { // 클래스 선언
    // private[현 클래스 범위] vs public[ 모든 클래스 범위]  : 접근제한자[ 접근할수 있는 권한 ]
    // 클래스 멤버
    // 1. 필드 : 데이터 저장하는 공간
        // 필드에 private 사용하는 이유 [ 안정성 때문에 ]
            // 다른 클래스에서 private 필드 접근 불가 -> 대책 [ get , set 메소드 활용 ]
    private String id;  // 회원아이디
    private String password; // 회원비밀번호
    private String name; // 회원명
    private String phone; // 회원 전화번호
    // 2. 생성자 : 객체 생성시 초기[처음]값
        // 1. 빈생성자
    public Member(){}
        // 2. 모든 필드를 받는 생성자
    public Member(String id, String password, String name, String phone) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.phone = phone;
    }
    // 3 메소드[함수] : 미리 작성된 코드
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
} // 클래스 end
