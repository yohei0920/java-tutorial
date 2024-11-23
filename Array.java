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

    String[] arr_2 = { "sato", "suzuki", "takahashi"};
    System.out.println(arr_2[0]);
    System.out.println(arr_2[1]);
    System.out.println(arr_2[2]);

    arr_2[1] = "tanaka";
    System.out.println(arr_2[1]);
  }
}
