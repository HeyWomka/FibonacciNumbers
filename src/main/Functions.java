package main;

public final class Functions {

    private Functions() {
        throw new IllegalStateException("Functions utility class");
    }

    public static void showMsg(String str, StringParam param) {
        if (param.equals(StringParam.INLINE_ROW)) System.out.print(str);
        else System.out.println(str + param.getParam());
    }

    public static void showMsg(StringParam param) {
        System.out.print(param.getParam());
    }

    public static void showMsg(String str) {
        System.out.println(str);
    }

    private static long counter;

    public static void initCounter() {
        counter = 0;
    }

    private static void countCalls() {
        counter++;
    }

    public static long getCounter() {
        return counter;
    }

    public static long fib1(long n) { // exponential complexity
        countCalls();

        if (n < 2) {
            return n;
        } else {
            return fib1(n - 1) + fib1(n - 2);
        }
    }

    public static long fib2(long n) { // linear complexity
        long i = 1;
        long j = 0;

        for (long k = 1; k <= n; k++) {
            j += i;
            i = j - i;

            countCalls();
        }

        return j;
    }

    public static long fib3(long n) { // logarithmic complexity
        long i = 1;
        long j = 0;
        long k = 0;
        long h = 1;

        long t;
        while (n > 0) {
            countCalls();

            if (n % 2 != 0) {
                t = j * h;
                j = i * h + j * k + t;
                i = i * k + t;
            }

            t = h * h;
            h = 2 * k * h + t;
            k = k * k + t;
            n = n / 2;
        }

        return j;
    }
}
