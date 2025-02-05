import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        
        // Reading array elements from user
        System.out.println("Enter 7 elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Reverse an array
        reverseArray(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));

        // Search for an element in a sorted array
        Arrays.sort(arr);
        System.out.print("Enter element to search: ");
        int element = sc.nextInt();
        int index = binarySearch(arr, element);
        System.out.println("Element " + element + " found at index: " + index);

        // Sort an array in descending order
        sortDescending(arr);
        System.out.println("Array sorted in descending order: " + Arrays.toString(arr));

        // Find the median of an array
        double median = findMedian(arr);
        System.out.println("Median of the array: " + median);

        // Print duplicates from an array
        System.out.print("Duplicates in the array: ");
        printDuplicates(arr);

        // Find the first duplicate in an array8
        int firstDuplicate = findFirstDuplicate(arr);
        System.out.println("First duplicate in the array: " + firstDuplicate);

        // Check if an array is a palindrome
        boolean isPalindrome = checkPalindrome(arr);
        System.out.println("Is the array a palindrome? " + isPalindrome);
    }

    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static int binarySearch(int[] arr, int element) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == element) {
                return mid;
            }
            if (arr[mid] < element) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Element not found
    }

    public static void sortDescending(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static double findMedian(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 == 0) {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
            return arr[n / 2];
        }
    }

    public static void printDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        for (int num : duplicates) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int findFirstDuplicate(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                return num;
            }
        }
        return -1; // No duplicate found
    }

    public static boolean checkPalindrome(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}