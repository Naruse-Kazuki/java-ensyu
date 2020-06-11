public class TestLeapYear{
    public static void main(String args[]){
        int year = 2016;
        if(year%4!=0){
            System.out.println(year + "年は平年です。");
        }else if(year%4==0 && year%100!=0){
            System.out.println(year + "年はうるう年です。");
        }else if(year%100==0 && year%400!=0){
            System.out.println(year + "年は平年です。");
        }else if(year%400==0){
            System.out.println(year + "年はうるう年です。");
        }
    }
}