package class10.ex2;

public class Student extends People {
    int studentNo;

    Student( String name , String ssn , int studentNo){
        super( name,ssn );
        this.studentNo = studentNo;
    }

    // 3. 오버라이딩
        // 부모클래스내 메소드 재정의[수정]
    @Override
    public void 구매하기(int 금액) {
        System.out.println(금액+"만큼 판매합니다.");

    }
}
