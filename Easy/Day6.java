import java.util.Scanner;

public class Ad {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Reading marks
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + " Enter your marks: ");
            arr[i] = sc.nextInt();
        }

        // Calculating sum, max, and min
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Calculating average
        double avg = (double) sum / arr.length;

        // Printing results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg + " %");
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // Printing prime numbers
        System.out.print("Prime numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        // Searching for a given element
        System.out.print("Enter element to search: ");
        int element = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                found = true;
                break;
            }
        }
            if (found) {
                System.out.println("Element found in the array.");
            } else {
                System.out.println("Element not found in the array.");
            }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
