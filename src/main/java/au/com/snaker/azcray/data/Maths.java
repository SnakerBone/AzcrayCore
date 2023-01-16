package au.com.snaker.azcray.data;

public class Maths {
    // simple factorial number generator
    public static long generateFactorial(long i) {
        if (i == 0) {
            return 1;
        } else {
            return (i * generateFactorial(i-1));
        }
    }
}