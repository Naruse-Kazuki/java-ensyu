public class TestMultiplesOfThree{
    public static void main(String args[]){
        int number = 14;
        switch(number%3){
            case 0:
                System.out.println(number + "は、3の倍数です。");
                break;
            case 1:
                System.out.println(number + "は、3で割ると1余ります。");
                break;
            case 2:
                System.out.println(number + "は、3で割ると2余ります。");
                break;
        }
    }
}