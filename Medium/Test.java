public class Test
{
  int c;
  public void Add(int x, int y) 
  {
    c = x + y;
    System.out.println("Addition of your number: " + c);
  }
  public void Sub(int x, int y) 
  {
    c = x - y;
    System.out.println("Substraction of your number: " + c);
  }
      
  public static void main(String args[])
  {
    int a = 10, b = 5;
    Test cal = new Test();
    cal.Add(a,b);
    cal.Sub(a,b);
  } 
}
