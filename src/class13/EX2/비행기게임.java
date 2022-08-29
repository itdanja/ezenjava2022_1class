package class13.EX2;

public class 비행기게임 implements 오락기 {
    @Override
    public void A버튼() {
        System.out.println("미사일공격");
    }
    @Override
    public void B버튼() {
        System.out.println("폭탄공격");
    }
    @Override
    public void C버튼() {
        System.out.println("피하기");
    }
    @Override
    public void D버튼() {
        System.out.println("교체");
    }

}
