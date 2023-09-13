import java.util.*;

class Array_Operations {
    int[] arr = null;

    Array_Operations(int size) {
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    void insert(int index, int value) {
        try {
            if (arr[index] == 0) {
                arr[index] = value;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }
    }

    void traversing() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    void searchInArray(int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println(element + " is present at the index of " + i);
                return;
            }
        }
    }

    void deleteInArray(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                arr[i] = 0;
                System.out.println("Value has been removed ");
            }
        }
    }

    public static void main(String[] args) {
        Array_Operations in = new Array_Operations(5);
        Scanner input = new Scanner(System.in);
        int arrIndex;
        int insertedValue;
        int seachingValue;
        int deletedValue;
        int choiceOfOperation;
        boolean istrue = true;
        while (istrue) {
            System.out.println(
                    "Chose the operation \n 1. Insertion \n 2. Deletion \n 3. Search \n 4. Show array \n 5. Exit");
            choiceOfOperation = input.nextInt();

            switch (choiceOfOperation) {
                case 1:
                    System.out.println("please enter the index and value to be insert ");
                    arrIndex = input.nextInt();
                    insertedValue = input.nextInt();
                    in.insert(arrIndex, insertedValue);

                    break;
                case 2:
                    System.out.println("please enter the value to be deleted ");
                    deletedValue = input.nextInt();
                    in.deleteInArray(deletedValue);

                    break;
                case 3:
                    System.out.println("please enter value to be search ");
                    seachingValue = input.nextInt();
                    in.searchInArray(seachingValue);

                    break;

                case 4:
                    System.out.println("Value of Element in array is : ");
                    in.traversing();
                    break;
                case 5:
                    istrue = false;
                default:
                    break;
            }

        }

    }
}