package p3;

public class P3_main {
    public static void main(String[] args) {
        System.out.println(kapital(1000,5));
    }

    public static int kapital(int anlage, int n) {
        if (n == 1)
            return (int) (1.05 * anlage);
        return (int) (1.05 * kapital(anlage, n - 1));
    }
}
