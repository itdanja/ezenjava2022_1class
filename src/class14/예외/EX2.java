package class14.예외;

public class EX2 {

    public static void main(String[] args) {
        /*
            예외처리 : 예외발생시 프로그램종료
            [ 안정적인 프로그램을 위한 프로그램 강제 종료 방지 ]
            [ (try)예외(오류) 발생하면 다른코드( catch )로 피해가기 ]

            try{ 예외가 발생 할것 같은 코드 }
            catch{ 예외가 발생하면 실행되는 코드 }
            finally{ 무조건[예외유무 상관없이] 실행되는 코드 }

         */
        // p.455
            // 1. 일반예외 발생 : 컴파일[실행] 전에 오류 확인
        try {
            Class clazz = Class.forName("java.lang.String2");
        }catch ( ClassNotFoundException e ){
            System.out.println("클래스가 존재하지 않습니다.");
        }

        // p.458
        try { // 예외가 발생할것 같은 코드
            String data1 = args[0];
            String data2 = args[1]; // 예외발생 : ArrayIndexOutOfBoundsException
            int value1 = Integer.parseInt(data1); // 예외발생 : NumberFormatException
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(data1 + "+" + data2 + "=" + result);
        }catch ( ArrayIndexOutOfBoundsException e ){
            // 배열인덱스 예외이면 실행되는 코드
            System.out.println("실행 매개값의 수가 부족합니다. ");
        }catch ( NumberFormatException e2 ){
            // 숫자 변환시 예외이면 실행되는 코드
            System.out.println("숫자로 변환할수 없습니다.");
        }finally {
            // 무조건 실행되는 코드
            System.out.println("다시 실행하세요.");
        }

        // p.462 : 예외 떠넘기기
        try {
            findClass();
        }catch ( Exception e ){
            System.out.println("클래스가 존재하지 않습니다.");
        }
    } // main end

    public static void findClass() throws Exception  {

        Class clazz = Class.forName("java.lang.String2");

    }

} // class end


