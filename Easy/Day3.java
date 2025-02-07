public class Day3 {
    public static void main(String[] args) {
        int number = 29; // Example number
        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
