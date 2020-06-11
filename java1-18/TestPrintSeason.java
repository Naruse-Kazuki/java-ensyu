public class TestPrintSeason{
    public static void main(String args[]){
        char season = '夏';
        switch(season){
            case '春':
                System.out.println(season + " : spring");
                break;
            case '夏':
                System.out.println(season + " : summer");
                break;
            case '秋':
                System.out.println(season + " : autumn");
                break;
            case '冬':
                System.out.println(season + " : winter");
                break;
            default:
                System.out.println("季節を表す文字ではありません");
        }
    }
}