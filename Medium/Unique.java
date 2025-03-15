public class Unique
{
  public static void main(String args[])
  {
    int[] arr = new int{2,3,3,2,4};
    int unique = 0;
    for(int num:arr)unique ^= num;
      System.out.println(unique);
  }
}
