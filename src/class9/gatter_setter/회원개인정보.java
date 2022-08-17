package class9.gatter_setter;

public class 회원개인정보 {

    // 1. 필드
    private String 이름;
    private String 전화번호;
    private String 주민등록번호;
    // 2. 생성자
    회원개인정보(){ }
    회원개인정보( String 이름 , String 전화번호 , String 주민등록번호){
        this.이름 = 이름;
        this.전화번호 = 전화번호;
        this.주민등록번호 = 주민등록번호;
    }
    // 3. 메소드
    public void set이름(String 이름){
        this.이름 = 이름;
    }
    public void set전화번호( String 전화번호){
        this.전화번호 = 전화번호;
    }
    public void set주민등록번호( String 주민등록번호){
        this.주민등록번호 = 주민등록번호;
    }
    public String get이름(){ return this.이름; }
    public String get전화번호(){ return this.전화번호;  }
    public String get주민등록번호(){ return this.주민등록번호;  }

}
