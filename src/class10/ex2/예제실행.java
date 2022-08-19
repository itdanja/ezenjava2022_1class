package class10.ex2;

public class 예제실행 {

    public static void main(String[] args) {

        // *기본 생성자가 없기 때문에 사용불가능
        // Student student = new Student();

        Student student = new Student(
                "홍길동" ,
                "123456-1234567" ,
                1
        );
    }
}
