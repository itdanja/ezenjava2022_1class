package class14.API클래스;

public class EX1 {
    public static void main(String[] args) {
        // p.473
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        // obj1 과 obj2 비교
        if( obj1.equals(obj2) ){
            System.out.println("obj1과 obj2는 동등합니다.");
        }else{
            System.out.println("obj1과 obj2는 동등하지 않습니다.");
        }
        // obj1 과 obj3 비교
        if( obj1.equals(obj3) ){
            System.out.println("obj1과 obj3는 동등합니다.");
        }else{
            System.out.println("obj1과 obj3는 동등하지 않습니다.");
        }


    }}
