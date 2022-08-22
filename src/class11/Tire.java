package class11;

public class Tire { // 1.타이어 클래스 선언
    public int maxRotation; // 최대 회전수 
    public int accumulatedRotation; // 누적 회전수
    public String location; // 타이어 위치

    public Tire( String location , int maxRotation ){
        this.location = location;
        this.maxRotation = maxRotation;
    }

    public boolean roll(){ // 타이어 회전 함수
        ++accumulatedRotation; // 누적 회전수 증가
        if( accumulatedRotation<maxRotation ){
            // 만약에 누적횟수보다 최대 회전수가 더 작으면
            System.out.println(location +" Tire 수명 : " +
                    (maxRotation-accumulatedRotation)+" 회");
            return true;
        }else{
            System.out.println("***"+location +"Tire펑크");
            return false;
        }
    }


}
