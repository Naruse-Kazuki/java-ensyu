public class TestCalc{
    public static void main(String args[]){
        int japanese = 80;
        int math = 98;
        int science = 100;
        int social = 70;
        int english = 85;
        int sum = japanese+math+science+social+english;
        double average = (double)sum/5;

        System.out.println("国語 : " + japanese + "点");
        System.out.println("数学 : " + math + "点");
        System.out.println("理科 : " + science + "点");
        System.out.println("社会 : " + social + "点");
        System.out.println("英語 : " + english + "点");
        System.out.println("5科目の合計点は" + sum + "点です。");
        System.out.println("平均点は" + average + "点です。");
    }
}