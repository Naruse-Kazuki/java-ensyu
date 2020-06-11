public class TestCalcTotal{
    public static void main(String args[]){
        int a = 1200;
        int b = 3500;
        int c = 2400;
        int sum = a+b+c;
        double tax = sum*0.08;
        int sumtax = sum+(int)tax;

        System.out.println("----------明細---------");
        System.out.println("商品A : " + a + "円");
        System.out.println("商品B : " + b + "円");
        System.out.println("商品C : " + c + "円");
        System.out.println("----------------------");
        System.out.println("合計 : " + sumtax + "円");
        System.out.println("（内消費税等 : " + (int)tax + "円");
    }
}