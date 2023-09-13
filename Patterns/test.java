public class test {
    public static void main(String[] args) {
        test obj = new test();
        obj.pattern1(5);
        System.out.println();
        System.out.println("1------------------------------------------------------------------");
        System.out.println();
        obj.pattern2(5);
        System.out.println();
        System.out.println("2------------------------------------------------------------------");
        System.out.println();
        obj.pattern3(5);
        System.out.println();
        System.out.println("3------------------------------------------------------------------");
        System.out.println();
        obj.pattern4(5);
        System.out.println();
        System.out.println("4------------------------------------------------------------------");
        System.out.println();
        obj.pattern5(5);
        System.out.println();
        System.out.println("5------------------------------------------------------------------");
        System.out.println();
        obj.pattern6(5);
        System.out.println();
        System.out.println("6------------------------------------------------------------------");
        System.out.println();
        obj.pattern7(5);
        System.out.println();
        System.out.println("7------------------------------------------------------------------");
        System.out.println();
        obj.pattern8(5);
        System.out.println();
        System.out.println("8------------------------------------------------------------------");
        System.out.println();
        obj.pattern9(5);
        System.out.println();
        System.out.println("9------------------------------------------------------------------");
        System.out.println();
        obj.pattern10(5);
        System.out.println();
        System.out.println("10------------------------------------------------------------------");
        System.out.println();
        obj.pattern11(5);
        System.out.println();
        System.out.println("11------------------------------------------------------------------");
        System.out.println();

    }

    void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print(" * ");
                } else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == col || col == n - row + 1) {
                    System.out.print(" * ");
                } else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    void pattern5(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            for (int i = 1; i <= n - row; i++) {
                System.out.print("   ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    void pattern7(int n) {

        for (int row = 1; row <= n; row++) {
            for (int i = 1; i <= row - 1; i++) {
                System.out.print("   ");
            }
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            for (int i = 1; i <= n - row; i++) {
                System.out.print("   ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("  *   ");
            }
            System.out.println();
        }
    }

    void pattern9(int n) {
        for (int row = 0; row <= n; row++) {
            for (int i = 1; i <= row; i++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" *  ");
            }
            System.out.println();

        }
    }

    void pattern10(int n) {
        int spacing;
        for (int row = 1; row <= n * 2; row++) {

            spacing = row <= 5 ? n - row : row - n;
            for (int i = 1; i <= spacing; i++) {
                System.out.print("   ");
            }
            int a = row <= 5 ? row : 2 * n - row;
            for (int col = 1; col <= a; col++) {
                // System.out.print(" " + col + " ");
                System.out.print(" *    ");

            }
            System.out.println();
        }
    }

    void pattern11(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int a = row <= 5 ? row : 2 * n - row;
            for (int col = 1; col <= a; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
