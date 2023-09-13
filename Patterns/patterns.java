/**
 * Important Pattern Problems from Strivers sheet
 */
public class patterns {

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
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        n = 2 * n;
        for (int row = 1; row <= n; row++) {
            int ttl_space = n - row;
            for (int i = 1; i <= ttl_space; i++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                if (row % 2 != 0)
                    System.out.print(" *  ");
                // System.out.print(row);
            }
            System.out.println();
        }

    }

    static void pattern8(int n) {

        for (int row = 1; row <= n; row++) {
            int ttl_space = n + row - 1;
            for (int i = 1; i <= ttl_space; i++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}