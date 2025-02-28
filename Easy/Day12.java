import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Ap[][] = {
            {2, 3, 5},
            {6, 8, 9},
            {4, 1, 7}
        };

        int sum = calSum(Ap);
        int product = calProduct(Ap);

        System.out.println("Sum of matrix elements: " + sum);
        System.out.println("Product of matrix elements: " + product);
    }

    public static int calSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static int calProduct(int[][] matrix) {
        int product = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                product *= matrix[i][j];
            }
        }
        return product;
    }
}
