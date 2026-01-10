package p2;

public class P2_main {
    public static void main(String[] args){
        System.out.println(log(16));
        System.out.println(logIter(16));
    }

    public static int log(int i){
        int base = 2;
        if (i == base) return 1;
        return log(i / base) + 1;
    }

    public static int logIter(int i){
        int base = 2;
        int log = 1;
        while (i != base){
            i /= 2;
            log++;
        }
        return log;
    }
}
