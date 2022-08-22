package class11;

public class HankookTire extends Tire {
    // extends : 연장하다[상속]

    // 생성자
    public HankookTire( String location , int maxRotation){
        super(location , maxRotation);
    }

    // 오버라이딩[ 부모로부터 상속받은 메소드 재정의[수정] ]
    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if( accumulatedRotation < maxRotation ){
            System.out.println(location+"한국타이어 수명 : "+
                    (maxRotation-accumulatedRotation)+"회");
            return true;
        }else{
            System.out.println("*** : " + location+"한국타이어 펑크**");
            return false;
        }
    }
}
