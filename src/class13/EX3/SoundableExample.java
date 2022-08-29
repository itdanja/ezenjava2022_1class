package class13.EX3;

public class SoundableExample {

    // 1.
    private static void printSound( Soundable soundable){
        System.out.println( soundable.sound() );
    }
    // 2.
    public static void main(String[] args) {
        printSound( new Cat() );
        printSound( new Dog() );
    }



}
