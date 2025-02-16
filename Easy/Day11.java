class ABC{
    {
        System.out.println("non-static block executed");
        a = 500;
    }
    static{
        System.out.println("ABC class static block executed");
    }
    int a;
    
    ABC(){
        System.out.println("object created");
    }
}

public class Blocks {
    static int x;
    int y;
    static{
        System.out.println("static block-1 executed");
        x = 100;
    }
    static{
        System.out.println("static block-2 executed");
    }  
    {
        System.out.println("Main class non-static block executed");
    }
    public static void main(String[] args) {
        System.out.println("main method executed");
        System.out.println("x = " + x);
        ABC abc = new ABC();
        Blocks b = new Blocks();
    }
}
