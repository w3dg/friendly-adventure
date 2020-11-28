public class CheckPrime {

  boolean recprime(int n, int i) {

    // if its less than 2 -> not prime
    if (n <= 2)
      return (n == 2);

    if (n % i == 0)
      return false;

    if (i * i > n) {
      return true;
    }

    return recprime(n, i + 1);
  }

  public static void main(String[] args) {
    CheckPrime obj = new CheckPrime();
    System.out.println("2 is prime ?" + obj.recprime(2, 2));
    System.out.println("3 is prime ?" + obj.recprime(3, 2));
    System.out.println("11 is prime ?" + obj.recprime(11, 2));
    System.out.println("20 is prime ?" + obj.recprime(20, 2));
    System.out.println("220 is prime ?" + obj.recprime(220, 2));
  }
}