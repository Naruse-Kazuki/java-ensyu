class Telephone{
    private String number;
    public String getNumber(){
        return this.number;
    }
    public void setnumber(String number){
        this.number = number;
    }
    public void display(){
        System.out.println("電話番号 : "+number);
    }
}
class Mobilephone extends Telephone{
    private String mailAddress;
    public String getMailAddress(){
        return this.mailAddress;
    }
    public void setMailAddress(String mailAddress){
        this.mailAddress = mailAddress;
    }
    public void display(){
        System.out.println("電話番号 : "+getNumber());
        System.out.println("メールアドレス : "+mailAddress);
    }
}
public class TestTelephone{
    public static void main(String[] args){
        Telephone te = new Telephone();
        Mobilephone mo = new Mobilephone();
        te.setnumber("03-1234-5678");
        mo.setnumber("090-9876-5432");
        mo.setMailAddress("foo@bar.ne.jp");
        te.display();
        mo.display();
    }
}