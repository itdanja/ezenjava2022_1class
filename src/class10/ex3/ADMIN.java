package class10.ex3;

public class ADMIN extends Member {
                // * extends : 상속[연장하다]
    private String department;

    public ADMIN(){} // 1. 빈생성자
    public ADMIN(String id, String password, String department) {
        super(id, password); // super( ) : 부모의 생성자 호출
        this.department = department;
    }

    public String getDepartment() { return department;   }
    public void setDepartment(String department) {
        this.department = department;
    }
}
