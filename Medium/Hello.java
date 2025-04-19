import java.util.LinkedList;

public class Hello
{
    public static void main(String args[])
    {
        LinkedList <Integer> ll = new LinkedList<>();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.remove(1);
        System.out.println(ll);
    }
}
