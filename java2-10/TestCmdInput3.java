public class TestCmdInput3{
    public static void main(String args[]){
        int a;
        int len = args.length;
        try{
            if(len==1){
                a = Integer.parseInt(args[0]);
                for(int i=0;i<a;i++){
                    System.out.println(i+1 + "回目");
                }
            }else{
                System.out.println("使用方法 : java TestCmdinput3 number");
                System.exit(1);
            }
        }catch(NumberFormatException e){
            System.out.println("数値に変換できません。");
            System.exit(1);
        }
    }
}