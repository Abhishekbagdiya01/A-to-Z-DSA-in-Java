import java.util.Scanner;

public class AvgTemprature {
    public static void main(String argds[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of days");
        int noOfDays = in.nextInt();
        int arr[] = new int[noOfDays];
        int temperatureOfDay;
        int temp = 0;
        double avgtemp = 0.0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the temperature of day " + (i + 1));
            temperatureOfDay = in.nextInt();
            arr[i] = temperatureOfDay;
            temp = temp + temperatureOfDay;
            avgtemp = temp / noOfDays;
        }

        System.out.println("Avg temperature is " + avgtemp);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avgtemp) {
                System.out.println("Day " + (i + 1) + " is a day when day temperature is above average temperature");
            }
        }

        in.close();
    }
}
