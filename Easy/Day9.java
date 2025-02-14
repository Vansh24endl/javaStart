import java.util.Scanner;

public class M2DA{
    public static void Sumarray(int[][] S2){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter your matrix");
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                S2[i][j] = sc.nextInt();
            }

            }
            for(int i = 0; i < 3; i++){
                for(int k = 0; k < 3; k++){
                    sum += S2[i][k];
                }
        }
        double Avg = (double) sum / (S2.length * S2[0].length);
        System.out.println("Sum: " + sum); 
        System.out.println("Average: " + Avg + " %");
        sc.close();
    }

    public static void main(String args[]){
        int S2[][] = new int[3][3];
        System.out.println("A matrix");
        Sumarray(S2);
    }
}
