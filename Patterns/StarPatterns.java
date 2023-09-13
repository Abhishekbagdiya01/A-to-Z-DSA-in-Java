
public class StarPatterns {
    public static void main(String[] args) {
        pattern1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern7(5);
        System.out.println();
        pattern8(5);
        System.out.println();
        pattern9(5);
        System.out.println();
        pattern10(5);
        System.out.println();
        pattern11(5);
    }

    // Pattern 1
    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }

    // Pattern 2
    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }

    // Pattern 3
    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + col);
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(" " + col);
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalcolno = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalcolno; col++) {
                System.out.print(" " + col);
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            int totalspaces = n - row;
            for (int i = 1; i <= totalspaces; i++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + col);
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            int noOfSpace = n + row;
            for (int i = 1; i <= noOfSpace; i++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(" " + col);
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalcolno = row > n ? 2 * n - row : row;
            int totalspaces = n - totalcolno;
            for (int i = 1; i <= totalspaces; i++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalcolno; col++) {
                System.out.print(" " + col);
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        for (int row = 0; row <= n; row++) {
            for (int i = 0; i <= n - row; i++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int c = row > n ? 2 * n - row : row;
            for (int space = 1; space <= n - c; space++) {
                System.out.print("  ");
            }
            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}