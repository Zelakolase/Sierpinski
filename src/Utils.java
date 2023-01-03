public class Utils {
    public static double log2 = Math.log(2);
    public static double TwoPow(long power) {
        return (1l << power);
    }
    public static double XPow(double q, int exp) {
        int result = 1;
        while (exp != 0) {
            if ((exp & 1) == 1)
                result *= q;
            exp >>= 1;
            q *= q;
        }
        return (double) result;
    }
    public static boolean isPrime(long l){
        if (l > 2l && l%2l == 0l) return false;
        int top = (int) Math.sqrt(l) + 1;
        for(long i = 3; i < top; i+=2) if(l % i == 0) return false;
        return true; 
    }
}