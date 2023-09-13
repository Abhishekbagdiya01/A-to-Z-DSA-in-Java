import java.util.Arrays;

class TwoDArray {
    int arr[][] = null;

    TwoDArray(int numberOfRow, int numberOfCOl) {
        this.arr = new int[numberOfRow][numberOfCOl];
        // for (int row = 0; row < arr.length; row++) {
        // for (int col = 0; col < arr[0].length; col++) {
        // arr[row][col] = 0;
        // }
        // }
    }

    void insert(int row, int col, int value) {

        try {
            if (arr[row][col] == 0) {
                arr[row][col] = value;
                System.out.println("value inserted successfully");
            } else {
                System.out.println("Index must already occupied");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Something went wrong");
        }
    }

    void accessingElem(int row, int col) {
        System.out.println("Row : " + row + " col : " + col);
        try {
            System.out.println("Element : " + arr[row][col]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Something went wrong");
        }
    }

    void traversing() {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                System.out.println(arr[row][col]);
            }
        }
    }

    void searching(int value) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                try {
                    if (arr[row][col] == value) {
                        System.out.println("Value " + value + " present at the index of : " + row + "," + col);
                    }
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Something went wrong");
                }
            }
        }
    }

    void delete(int row, int col) {
        try {
            arr[row][col] = 0;
            System.out.println("Value at the index number " + row + "," + col + "deleted successfully");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Something went wrong");
        }
    }

    void update(int row, int col, int value) {
        try {
            arr[row][col] = value;
            System.out.println("Value at the index number " + row + "," + col + "updated successfully");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Something went wrong");
        }
    }

    public static void main(String args[]) {
        TwoDArray tda = new TwoDArray(3, 3);
        tda.insert(0, 0, 260);
        tda.insert(0, 1, 450);
        tda.insert(0, 2, 40);
        tda.insert(1, 0, 50);
        tda.insert(1, 1, 450);
        // tda.accessingElem(1, 2);
        // System.out.println(Arrays.deepToString(tda.arr));
        tda.traversing();
        tda.searching(450);
        // tda.delete(1, 1);
        tda.update(0, 2, 500);
        tda.traversing();
    }
}