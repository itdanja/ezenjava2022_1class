package class7;

public class EX6_korean {
    public static void main(String[] args) {
        // 생성자 사용 [ 객체 선언과 동시에 필드에 값 대입 ]
        Korean k1 = new Korean("박자바","011225-1234567");

        // 빈생성자 [ 객체 선언과 동시에 초기 필드 사용 -> 추후에 필드의 값 변경  ]
        Korean k2 = new Korean();
        k2.name ="박자바";
        k2.ssn ="011225-1234567";
    }
}
