@FunctionalInterface
interface A {

    int m1(int i, int j);

}

public class FunctinalI {

    public static void main(String[] args) {

        A a = new A() {
            @Override
            public int m1(int i, int j) {
                return i + j;
            }
        };
        System.out.println("result = " + a.m1(1, 2));

    }
}
