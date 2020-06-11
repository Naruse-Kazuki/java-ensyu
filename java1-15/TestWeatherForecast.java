public class TestWeatherForecast{
    public static void main(String args[]){
        int probability;
        probability = 70;
        if(probability>=70){
            System.out.println("降水確率は" + probability + "%です。\n傘を持って出かけましょう。");
        }else if(probability>=30 && probability<70){
            System.out.println("降水確率は" + probability + "%です。\n折り畳み傘があると安心です。");
        }else{
            System.out.println("降水確率は" + probability + "%です。\nは必要ありません。");
        }
    }
}