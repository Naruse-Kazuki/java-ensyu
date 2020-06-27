class Employ {
  int count = 0;
  public static final String COMPANY_NAME = "〇〇会社";
  private static int numberOfEmployee = 0;
  private int id;
  private String name;

  public Employ(int id, String name) {
    this.id = id;
    this.name = name;
    numberOfEmployee++;
  }

  public static int getNumberOfEmploy() {
    return numberOfEmployee;
  }

  public void display() {
    System.out.println("社員 ID：" + this.id);
    System.out.println("名前：" + this.name);
  }
}

class TestEmployee {
  public static void main(String[] args) {
    System.out.println("会社名：" + Employ.COMPANY_NAME);
    System.out.println("社員数：" + Employ.getNumberOfEmploy());

    Employ em1 = new Employ(10201, "中村健一");
    Employ em2 = new Employ(10302, "大野知美");
    em1.display();
    em2.display();

    System.out.println("社員数：" + Employ.getNumberOfEmploy());
  }
}