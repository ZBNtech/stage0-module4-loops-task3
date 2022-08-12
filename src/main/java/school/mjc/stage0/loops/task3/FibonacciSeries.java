package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {

        for (int i = 0; i < lastFibonacci; i++) {

            System.out.println(fib(i));
        }
    }

    static int fib(int n)
    {
        if (n <= 1)
            return n;

        return fib(n - 1)
                + fib(n - 2);
    }
}
