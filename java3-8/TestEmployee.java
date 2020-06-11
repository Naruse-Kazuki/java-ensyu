class Employee{
    private String name;
    private int age;
    public void setData(){
        this.name = "未設定";
        this.age = 0;
    }
    public void setData(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void display(){
        System.out.println("名前 : "+name);
        System.out.println("年齢 : "+age);
    }

}

public class TestEmployee{
    public static void main(String args[]){
        Employee emp = new Employee();
        System.out.println("名前と年齢をデフォルトに設定します。");
        emp.setData();
        emp.display();
        System.out.println();
        System.out.println("名前をTanaka、年齢を25で設定します。");
        emp.setData("Tanaka",25);
        emp.display();
    }
}