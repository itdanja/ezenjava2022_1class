package class3;

import java.util.Scanner;

public class EX5 { // cs
    public static void main(String[] args) { // ms
        // 키보드입력 -> 변수저장 -> 변수출력
        // 1. 입력객체
        Scanner scanner = new Scanner(System.in);
        // 2. 입력받은 데이터를 가져오기
        System.out.print(" 나이 : ");
        int 나이 = scanner.nextInt();
        // 3. 증감연산자
        나이--; // 1 감소
        // 4. 삼항연산자
        String 결과 = 나이 >= 40 ? "중년" :
                        나이 >= 30 ? "청년" :
                            나이 >=20 ? "학생" : "미성년자";
        System.out.println(" 당신은 : " + 결과 + " 이군요~");
    }//me
} // ce


/*
EX5
[입력] 나이
[조건] 증감연산자를 이용한 나이 -1감소
[출력조건]
	나이가 40이상이면 '중년'
	나이가 30이상이면 '청년'
	나이가 20이상이면 '학생'
 */