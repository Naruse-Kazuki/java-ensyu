public class TestBMI{
    public static void main(String args[]){
        double height = 180.5;
        double weight = 72.6;
        double bmi = weight*10000/(height*height);
        if(bmi>=18.5 && bmi<25){
            System.out.println("BMI値 : " + bmi);
            System.out.println("適正なBMI値です。");
        }else{
            System.out.println("BMI値を改善しましょう。");
        }
    }
}