public class TestCmdInput2{
    public static void main(String args[]){
        int a[] = new int[2];
        int len = args.length;
        try{
            if(len==2){
                for(int i=0;i<2;i++){
                    a[i] = Integer.parseInt(args[i]);
                }
            }else{
                System.out.println("引数を2つ指定してください");
                System.exit(0);
            }
        }catch(NumberFormatException e){
            System.out.println("数値に変換できません。");
            System.exit(0);
        }
        System.out.println("1つ目の数値 : " + args[0]);
        System.out.println("2つ目の数値 : " + args[1]);
        int sum = a[0] + a[1];
        int x = a[0]*a[1];
        System.out.println("足し算の結果" + sum);
        System.out.println("掛け算の結果" + x);
    }
}