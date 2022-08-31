package class14.API클래스;

public class Member {
// 모든 클래스는 Object 클래스로부터 상속[ extend ] 암묵적으로
    // 필드
    public String id;
    // 생성자 [ 클래스명 동일
    public Member( String id ){
        this.id = id;
    }
    // 메소드
    @Override // 오버라이딩( 부모클래스(Object클래스)의 메소드 재구현[수정] )
    public boolean equals(Object obj) {
        if( obj instanceof  Member ){
            // instanceof : 상속여부 확인
            Member member = (Member) obj; // object -> member 형 변환
            if( id.equals( member.id ) ){ //
                return true; // 같다.
            } // if end
        }// if end
        return false; // 다르다.
    } // equals end
}
