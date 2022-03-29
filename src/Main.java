public class Main {
    public static void main(String[] args) {
        int a = 11;
        int b = 6;
        int c = minFunction(a, b);

        System.out.println("Hello, sun!");
        System.out.println("Hello, sky!");
        System.out.println("Hello, 123456BODY!");

    }

    public static int minFunction(int a, int b) {
        int c;
        if (a > b)
            c = b;
        else
            c = a;

        return c;

    }
}

