public class Calc {
  public static void main(String[] args) {
    int x = 10;
    int y = 2;
    int z = 10;

    System.out.println(x + y);
    System.out.println(x - y);
    System.out.println(x * y);
    System.out.println(x / y);
    System.out.println(x % y);

    System.out.println(x < y);
    System.out.println(x > y);
    System.out.println(x > z);
    System.out.println(x < z);
    System.out.println(x <= y);
    System.out.println(x >= y);
    System.out.println(x >= z);
    System.out.println(x <= z);

    System.out.println(x == y);
    System.out.println(x != y);

    int a = 8;
    int b = 3;

    System.out.println(a <= 10 && a >= 5);
    System.out.println(b <= 10 && b >= 5);
    System.out.println(a <= 10 || a >= 5);
    System.out.println(b <= 10 || b >= 5);

    a++;
    b--;
    
    System.out.println(a);
    System.out.println(b);
  }
}
