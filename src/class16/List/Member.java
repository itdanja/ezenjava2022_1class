package class16.List;

public class Member {
    // 1. 필드
    private String name;
    private String phone;
    // 2. 생성자
    public Member(){ }
    public Member(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    // 3. get / set 메소드
    public String getName() {   return name;  }
    public void setName(String name) {  this.name = name;   }
    public String getPhone() {  return phone; }
    public void setPhone(String phone) {  this.phone = phone;   }
}
