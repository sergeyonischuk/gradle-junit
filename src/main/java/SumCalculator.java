public class SumCalculator {

    public int sum (int n) {
        int result = 0;
        if (n > 0) {
            while (n > 0) {
                result += n;
                n--;
            }
        } else throw new IllegalArgumentException("argument value must be > 0");
        return result;
    }
}