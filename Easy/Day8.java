import java.util.Scanner;
public class Binarysearch {
    public static int binarySearch(int[] arr, int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, left, mid - 1, x);
            else
                return binarySearch(arr, mid + 1, right, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n]; 

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }
      
        System.out.println("Enter your number to find: ");
        int x = sc.nextInt();

        int result = binarySearch(arr, 0, n+1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);           
    }
}
