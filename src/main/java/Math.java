public class Math {
    public static int square(int x) {
        return x * x;
    }

    public static int cube(int x) {
        return x * x * x;
    }

    public static int power(int x, int y) throws NegativeInNegativePowerException, ZeroInNonPositivePowerException {
        if (x < 0 && y < 0) throw new NegativeInNegativePowerException();
        if (x == 0 && y <= 0) throw new ZeroInNonPositivePowerException();
        int result = 1;
        for (int i = 0; i < y; i++) result *= x;
        return result;
    }

    public static class NegativeInNegativePowerException extends Exception {
        @Override
        public String getMessage() {
            return "Cannot put a negative number in a negative power";
        }
    }
    public static class ZeroInNonPositivePowerException extends Exception {
        @Override
        public String getMessage() {
            return "Cannot put zero in a non-positive power";
        }
    }
}
