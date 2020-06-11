class Employee{
    String name = null;
    int age = 0;
    void setName(String tmpName){
        name = tmpName;
    }
    void setAge(int tmpAge){
        age = tmpAge;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}

class TestEmployee{
    public static void main(String args[]){
        Employee emp = new Employee();
        System.out.println("名前をTanakaに設定します。");
        emp.setName("Tanaka");
        System.out.println("年齢を25に設定します。");
        emp.setAge(25);
        System.out.println();
        emp.display();
    }
}