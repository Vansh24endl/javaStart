//wap to revrse the array
public class Ad1{

    public static void printArray(int arr[]){
        for(int i: arr){
            System.out.print(i + " ");
        }
    }

    public static void reversal(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int arr[] = {4, 5, 9, 8, 1, 7};
        System.out.println("Before reversal: ");
        printArray(arr);
        reversal(arr);
        System.out.println("\nAfter reversal: ");
        printArray(arr);
    }
}
