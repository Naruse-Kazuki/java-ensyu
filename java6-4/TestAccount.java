class Account {
  private String name;
  private int balance;

  public Account(String name, int balance) {
    this.name = name;
    this.balance = balance;
  }

  public String getName() {
    return name;
  }

  public int getBalance() {
    return balance;
  }

  public void deposit(int amount) {
    this.balance = this.balance + amount;
  }

  public void withdraw(int amount) throws Exception {
    if (this.balance < amount) {
      throw new Exception();
    } else {
      this.balance = this.balance - amount;
    }
  }
}

class TestAccount {
  public static void main(String[] args) {
    Account account = new Account("Suzuki", 200000);
    System.out.println(account.getName() + "さんの預金残高は" + account.getBalance() + "円です。");
    System.out.println();
    System.out.println("300000円引き落とします。");

    try {
      account.withdraw(300000);
    } catch (Exception e) {
      System.out.println("残高不足のため引き落としできません");
    }

    System.out.println();
    System.out.println(account.getName() + "さんの預金残高は" + account.getBalance() + "円です。");
  }
}