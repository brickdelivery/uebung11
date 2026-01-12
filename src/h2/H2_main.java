package h2;

public class H2_main {
    private static int[] cache = new int[1000];

    public static void main(String[] args) {

    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int fibonacciCached(int n) {
        if (n == 1 || n == 2) return 1;
        if (cache[n-1] != 0)
            return cache[n-1];
        cache[n - 1] = fibonacciCached(n - 1) + fibonacciCached( n - 2);
        return cache[n - 1];
    }

    public static int fibonacciIter(int n) {
        int fn = 1;
        int f1 = 0;
        int f2;
        for (int i = 1; i < n; i++) {
            f2 = f1;
            f1 = fn;
            fn = f1 + f2;
        }
        return fn;
    }

    public static void benchmark(int n) {
        long timeStart, timeFin;
        timeStart = System.nanoTime();
        System.out.println(fibonacci(n));
        timeFin = System.nanoTime() - timeStart;
        System.out.println("Elapsed nanoseconds (fibonacci()): " + timeFin);
        timeStart = System.nanoTime();
        System.out.println(fibonacciCached(n));
        timeFin = System.nanoTime() - timeStart;
        System.out.println("Elapsed nanoseconds (fibonacciCached()): " + timeFin);
        timeStart = System.nanoTime();
        System.out.println(fibonacciIter(n));
        timeFin = System.nanoTime() - timeStart;
        System.out.println("Elapsed nanoseconds (fibonacciIter()): " + timeFin);
    }
}

