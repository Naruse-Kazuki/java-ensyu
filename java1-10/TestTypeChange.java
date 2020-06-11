public class TestTypeChange{
    public static void main(String args[]){
        int number1 = 10;
        int number2 = 4;
        double result;
        result = number1/number2;
        System.out.println("result = " + result);
        result = (double)number1/number2;
        System.out.println("result = " + result);
    }
}