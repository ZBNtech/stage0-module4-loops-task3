package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int[] s = {9, 99, 999, 9999, 99999, 999999, 9999999};

        for (int i = 0; i < lengthOfLastNumber; i++){
            sum += s[i];
        }

        System.out.println(sum);
    }
}
