package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
//    first = 6 = 0110
//    second = 9 = 1001
    public void swap(int first, int second) {
        first ^= second;
        second = first ^ second;
        first ^= second;

        System.out.println(first);
        System.out.println(second);
    }
}
