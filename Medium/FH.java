@FunctionalInterface
interface A
{
    int m1(int i, int j);    
}

public class FunctinalI 
{
    public static void main(String[] args) 
  {               
        A a = (int i, int j) ->  i+j;  
        System.out.println("result = " + a.m1(100, 200));       
  }
}
