import java.util.ArrayList;
public class T
  {
    public static void main(String args[])
    {
      ArrayList al = new ArrayList();
      al.add(10);
      al.add("black");
      al.add(true);
      al.add(null);

      System.out.println(al);
      for(int i = 0; i <al.size(); i++)
        {
          System.out.println(al.get(i));
        }
       al.set(2,"green");
      System.out.println(al);
      System.out.println("Index of black object: " + al.firstIndexof(10);
       al.removeall();
      System.out.println(al);
    }
  }
