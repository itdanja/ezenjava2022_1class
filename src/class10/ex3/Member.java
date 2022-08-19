package class10.ex3;

public class Member {
    // 1.필드 [ 데이터 저장 ]
    private String id ; // private : [접근제한자] 현 클래스에서만 사용
    private String password;
    // 2.생성자 [ 객체 선언시 초기값 ]
    public Member(){} // 1. 빈(기본) 생성자
    public Member(String id, String password) { // 2. 매개변수2개 생성자
        this.id = id;
        this.password = password;
    }
    // 3.메소드 [ 객체의 동작=미리 작성된 코드 ]
        // getter , setter => 호출 , 저장
    public String getId() {  return id;   }
    public void setId(String id) {   this.id = id;  }
    public String getPassword() {   return password; }
    public void setPassword(String password) { this.password = password; }
}
