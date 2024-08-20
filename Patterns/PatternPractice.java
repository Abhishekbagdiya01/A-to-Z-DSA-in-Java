public class PatternPractice {

  public void pattern1(int n) {
    for (int i = 0; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(" * ");
      }
      System.out.println();
    }
  }

  public void pattern2(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        System.out.print(" * ");
      }
      System.out.println();
    }
  }

  public void pattern3(int n) {
    for (int i = 0; i <= n; i++) {
      for (int j = i; j < n; j++) {
        System.out.print("  ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print(" * ");
      }
      System.out.println();
    }
  }

  public void pattern4(int n) {
    for (int i = 1; i <= 2 * n; i++) {
      int totalSpace = i > n ? 2 * n - i : i;
      for (int j = 0; j < totalSpace; j++) {
        System.out.print(" ");
      }

      for (int col = totalSpace; col >= 1; col--) {
        System.out.print(col + " ");
      }
      for (int col = 2; col <= totalSpace; col++) {
        System.out.print(col + " ");
      }

      System.out.println();
    }
  }

  public static void main(String[] args) {
    PatternPractice pattern = new PatternPractice();
    int n = 5;
    // pattern.pattern1(n);
    // System.out.println("---------------------------------");
    // pattern.pattern2(n);
    // System.out.println("---------------------------------");
    // pattern.pattern3(n);
    // System.out.println("---------------------------------");
    pattern.pattern4(n);
  }
}
