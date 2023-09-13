public class patterns1 {

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
        System.out.println();

    }

    public static void pattern1(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(col + 1);
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(row + 1);
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {

        for (int row = 0; row <= n; row++) {
            for (int col = 0; col < n - row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void pattern6(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 1; col < n - row + 1; col++) {
                System.out.print(" " + col);
            }
            System.out.println();
        }

    }

    public static void pattern7(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == col || row == n - col + 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }

    public static void pattern9(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (col >= row) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }

    public static void pattern10(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n + row; col++) {
                if (col >= row) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }

    public static void pattern11(int n) {
        int i = 1;
        for (int row = 1; row <= n; row++) {
            for (i = 1; i <= n - row; i++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            for (int col = 1; col <= n - i; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

