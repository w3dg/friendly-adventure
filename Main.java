import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    AccountISC a = new AccountISC("MEIAMSOME", 1926541893, 50000, 50000);
    a.withdraw();
    a.displays();
  }
}
