package p1;

public class P1_main {
    public static void main(String[] args) {
        System.out.println(potenz(1.5, 3));
        System.out.println(potenzIter(3.0, 3));
    }

    public static double potenz(double a, int b) {
        if (b == 1) return a;
        return potenz(a, b - 1) * a;
    }

    public static double potenzIter(double a, int b) {
        double result = a;
        for (int i = 1; i < b; i++)
            result *= a;
        return result;
    }
}
