package class3;

public class page124_대입연산자 {

    public static void main(String[] args) {

        // 5. 대입연산자
            //  = : 대입[ 오른쪽 데이터를 왼쪽 데이터에 대입 ]
            // += : 오른쪽 데이터를 왼쪽 데이터에 더한 후에 대입 ]
            // -= *= /= %=
        int x = 5; int y = 10; int z ;
        // 1. 대입
        z = x ;     // x의 값을 z에 대입하기
        System.out.println( " z : " + z );
        z += x ; //  z = z + x;
        System.out.println(" += 연산자 : " + z );
        z -= y ;    // z = z - y;
        System.out.println(" -= 연산자 : " + z );
        z *= y ;
        System.out.println(" *= 연산자 : " + z );
    }
}
