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
    public static boolean isPrime(int num){
        if (num > 2 && num%2 == 0) return false;
        int top = (int) Math.sqrt(num) + 1;
        for(int i = 3; i < top; i+=2) if(num % i == 0) return false;
        return true; 
    }
}