package view;

public class PhoneInheritance {
    public static void main(String[] args) {
        System.out.println("-------집전화-------");
        Phone phone = new Phone();
        phone.setCompany("금성");
        phone.setCall("제임스");
        System.out.println(phone);

        System.out.println("-------휴대전화-------");
        CellPhone cp = new CellPhone();
        cp.setCompany("노키아");
        cp.setCall("에릭");
        cp.setPortable(true);
        System.out.println(cp);

        System.out.println("-------아이폰-------");
        IPhone iPhone = new IPhone();
        iPhone.setCompany("Apple");
        iPhone.setCall("톰");
        iPhone.setData("전송하다.");
        iPhone.setPortable(true);
        System.out.println(iPhone ); // 애플 아이폰으로 톰에게 폰을 휴대할 수 있음 데이터를 전송하다.

        System.out.println("-------갤럭시 노트-------"); // 삼성 갤럭시노트로 제인에게 10인치 폰을 휴대할수 있음 데이터를 전송하다.
        AndroidPhone gp = new AndroidPhone();
        gp.setCompany("삼성");
        gp.setCall("제인");
        gp.setData("전송하다.");
        gp.setPortable(true);
        gp.setSize("10인치");
        System.out.println(gp);

    }
}

class AndroidPhone extends IPhone{
    public static String BRAND = "갤럭시 노트";

    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "AndroidPhone{" +
                "제조사='" + super.company + '\'' +
                this.BRAND + '\'' +
                ", 수신자='" + super.call + '\'' +
                "이동성=" + super.portable +
                ", 이동유무='" + super.move + '\'' +
                ", 데이터='" + data + '\'' +
                ", 크기='" + size + '\'' +
                '}';
    }
}

class IPhone extends CellPhone{
    protected String data;
    public static String BRAND = "iPhone";

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data ;
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "제조사='" + super.company + '\'' +
                BRAND + '\'' +
                ", 수신자='" + super.call + '\'' +
                ", 이동성=" + super.portable +'\'' +
                ", 이동유무='" + super.move + '\'' +
                ", 데이터='" + data + '\'' +
                '}';
    }
}

class CellPhone extends Phone {
    protected boolean portable; // 이동성, 휴대전화
    protected String move;

    public boolean isPortable() {
        return portable;
    }

    public void setPortable(boolean portable) {
        if (portable) {
            this.setMove("폰을 휴대할 수 있음");
        } else {
            this.setMove("폰을 휴대할 수 없음");
        }
        this.portable = portable;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    @Override
    public String toString() {
        return "휴대폰{" +
                "제조사='" + super.company + '\'' +
                ", 수신자='" + super.call + '\'' +
                ", 이동성=" + portable +'\'' +
                ", 이동유무='" + move + '\'' +
                '}';
    }
}

class Phone {
    protected String company, call; //인스턴스 변수 = 멤버번수 => 힙영역
    static final double TAX_RATE = 0.095; //스태틱 변수 = 전역변수 => 스태틱영역

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company + " 에서 제작하다.";
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call + "에게 전화를 걸다.";
    }

    @Override
    public String toString() {
        return "집전화{" +
                "제조사='" + company + '\'' +
                ", 수신자='" + call + '\'' +
                '}';
    }
}