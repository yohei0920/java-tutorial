public class Student {
  public static void main(String[] args) {
    Student student = new Student();

    double[] scores = {10, 35, 60, 90, 75}; // 例: テストの点数

    double average = student.calculateAvg(scores);

    String result = student.judge(average);

    System.out.println("Average Score: " + average);
    System.out.println("Result: " + result);
  }

  public double calculateAvg(double[] data) {
    double sum = 0;

    for(int i = 0; i < data.length; i ++ ) {
      sum += data[i];
    }
    double avg = sum / data.length;
    return avg;
  }

  public String judge(double avg) {
    String result;
    if(avg >= 60) {
      result = "passed";
    } else {
      result = "failed";
    }
    return result;
  }
}
