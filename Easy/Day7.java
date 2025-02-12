public class ArrayDemo {
    public static void main(String[] args) {
        int arr[] = {4, 7, 1, 0, 9, 6, 8};
        // for-each or enhanced for loop        
        for(int i: arr){
            System.out.print(i + " ");
        }
        int flag;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 2) {
                flag = 0;
                for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                    if (arr[i] % j == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println(arr[i] + " is a prime number");
                }
            }
        }
    }
}
