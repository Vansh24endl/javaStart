import java.util.Scanner;
public class Lcm
{
  public static void main(String agrs[])
  {
    Scanner sc = new Scanner(System.out);

    System.out.println("Enter First number: ");
    int a = sc.nextInt();

    System.out.println("Enter Second number: ");
    int b = sc.nextInt();

    int Lcm;
    Lcm = (a>b) ? a:b;

    while(true)
      {
       if(LCM % a == 0 && Lcm % b == 0)
       {
         System.out.println("Lcm of " + a + "," + b + "," + Lcm);
         break;
       }
        ++Lcm;
      }
  }
}
