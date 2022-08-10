package class8;

public class Car { // 클래스 선언

    // *클래스 멤버
    // 1. 필드  = 데이터를 저장하는 곳
    int gas;    // int형 필드를 선언 [ 변수와 같지만 변수라고 부르지 않음 ]
    // 2. 생성자 = 객체생성시 초기값
    // 3. 메소드 = 미리 정의된 코드
        // void : 반환타입 없다 = return 없다 = 함수 실행후 결과없다. = 반환x
        // this : 현재 클래스의 필드 와 매개변수 이름이 동일한 경우
    void setGas( int gas ){ this.gas = gas; }
    boolean isLeftGas(){
        if( gas == 0 ){
            System.out.println("gas가 없습니다.");
            return false;
        }
        System.out.println("gas가 있습니다.");
        return true;
    }

    void run(){
        while (true){ // 무한반복 [ 종료조건 : 가스가 0일때 trturn ]
            if( gas > 0 ){
                System.out.println("달립니다.(gas잔량 : "+gas+")");
                gas -= 1; // gas 1씩 차감
            }else{
                System.out.println("멈춥니다.(gas잔량 : "+gas+")");
                return; // void 인데 return 있는경우 [ 반환 없이 메소드 종료 뜻 ]
            }
        }
    }


} // 클래스 끝
