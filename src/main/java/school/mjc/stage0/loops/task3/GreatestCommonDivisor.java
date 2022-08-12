package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcd = 1;
        if (second==0) gcd = first;

        System.out.println(gcd(second,first%second));
    }

    public static int gcd(int a, int b) { return b==0 ? a : gcd(b, a%b); }
}
