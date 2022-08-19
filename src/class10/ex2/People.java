package class10.ex2;

public class People {
    // 1. 필드
    String name;
    String ssn;
    // 2. 생성자
    public People( String name , String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
    // 3. 메소드
    public void 구매하기( int 금액 ){
        System.out.println( 금액 + "만큼 구매합니다.");
    }




}
