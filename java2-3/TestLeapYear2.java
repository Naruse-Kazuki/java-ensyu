public class TestLeapYear2{
    public static void main(String args[]){
        int year = 1900;
        while(year<=2000){
            if(year%4==0 && year%100!=0){
                System.out.println(year + "年");
            }else if(year%400==0){
                System.out.println(year + "年");
            }
            year++;
        }
    }
}