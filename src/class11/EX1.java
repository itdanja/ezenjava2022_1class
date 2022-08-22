package class11;

class A{}   //  A클래스 선언
class B extends A{} // B클래스선언<--상속-- A클래스       // A--> B
class C extends A{} // C클래스선언<--상속-- A클래스       // A--> C
class D extends B{} // D클래스선언<--상속-- B클래스       // B--> D
class E extends C{} // E클래스선언<--상속-- C클래스       // C--> E
/*
                    A[ 부모=할머니 ]
       B[부모/자식]           C[부모/자식]
    D[자식]                          E[자식]

 */

public class EX1 { // class start
    public static void main(String[] args) { // main start
        // 1. 객체[클래스 기반으로 선언된 메모리] 선언
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

//        B b3 = e;
//        C c2 = d;

    } // main end

    /* P.335
         다형성 : 다양한 형태[모양]의 특징
            예시)
                            --> 금호 타이어
                   타이어
                            --> 한국 타이어
         자동 타입 변환
            [부모]클래스 ----상속-->  [자식]클래스
               동물                      고양이
               * 고양이는 동물이다.[O]
               * 동물은 고양이다 [X]
            자식은 부모로 변환이 가능하지만 부모는 자식 변환 불가능

    */

} // class end
