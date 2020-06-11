public class TestCalc3{
    public static void main(String args[]){
        int scores[] = {80,98,100,70,85};
        int i = scores.length;
        int sum = 0;
        for(int a=0;a<i;a++){
            sum = sum+scores[a];
        }
        double average = (double)sum/i;
        System.out.println("国語 : " + scores[0] + "点");
        System.out.println("数学 : " + scores[1] + "点");
        System.out.println("理科 : " + scores[2] + "点");
        System.out.println("社会 : " + scores[3] + "点");
        System.out.println("英語 : " + scores[4] + "点");
        System.out.println("5科目の合計点は" + sum + "点です。");
        System.out.println("平均点は" + average + "点です。");
    }
}