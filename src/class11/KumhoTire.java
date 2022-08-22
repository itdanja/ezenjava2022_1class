package class11;

public class KumhoTire extends Tire {

    // 필드
    //생성자
    public KumhoTire( String location , int maxRotation ){
        super( location , maxRotation );
    }

    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if( accumulatedRotation<maxRotation ){
            System.out.println(location+" 한국타이어 수명 : " +
                    (maxRotation-accumulatedRotation)+"회");
            return false;
        }else{
            System.out.println("** " + location+" 한국타이어 펑크");
            return false;
        }
    }
}
