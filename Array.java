class Array {
  public static void main(String[] args) {
    String[] arr;
    arr = new String[3];

    arr[0] = "sato";
    arr[1] = "suzuki";
    arr[2] = "takahashi";

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

    String[] arr_2 = { "sato", "suzuki", "takahashi" };
    System.out.println(arr_2[0]);
    System.out.println(arr_2[1]);
    System.out.println(arr_2[2]);

    arr_2[1] = "tanaka";
    System.out.println(arr_2[1]);

    System.out.println("========");
    // two dimensional array

    String[][] d_arr;
    d_arr = new String[1][3];

    d_arr[0][0] = "hiro";
    d_arr[0][1] = "takeshi";
    d_arr[0][2] = "yoshi";

    System.out.println(d_arr[0][0]);
    System.out.println(d_arr[0][1]);
    System.out.println(d_arr[0][2]);

    String[][] d_arr_2 = {{"sato", "suzuki"}, {"takahashi", "tanaka"}};
    
    System.out.println(d_arr_2[0][0]);
    System.out.println(d_arr_2[0][1]);
    System.out.println(d_arr_2[1][0]);
    System.out.println(d_arr_2[1][1]);
  }
}
