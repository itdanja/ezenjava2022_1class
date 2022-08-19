package class10.ex3;

public class USER extends Member {
                /* extends : 상속 */
    // 1. 필드
    private String name;
    // 2. 생성자
    private USER(){} // 1. 빈생성자
    public USER(String id, String password, String name) {
        super(id, password); // 부모클래스의 생성자 호출
        this.name = name;
    }
    // 3. 메소드 [ getter , setter ]
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
