class DataType {
  public static void main(String[] args) {
    byte var01 = 1;
    short var02 = 12345;
    int var03 = 1234567890;
    long var04 = 1234566789000L;

    System.out.println(var01);
    System.out.println(var02);
    System.out.println(var03);
    System.out.println(var04);

    double var05 = 1.23456789;
    float var06 = 1.234F;

    System.out.println(var05);
    System.out.println(var06);

    char var07 = 'c';
    String var08 = "hello, world";

    System.out.println(var07);
    System.out.println(var08);

    int var_a = 10;
    int var_b = 1;
    boolean var_bool_true;
    boolean var_bool_false;

    var_bool_true = var_a > var_b;
    var_bool_false = var_a < var_b;

    System.out.println(var_bool_true);
    System.out.println(var_bool_false);
  }
}