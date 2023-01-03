import java.util.HashMap;
import java.util.Map.Entry;

public class Sandbox {
    public static void main(String[] args) {
        HashMap<Integer, Integer> pairs = new HashMap<>();
        for(int k = 1;k < Config.maxK; k += 2) {
            for(int n = 0;n < Config.maxN; n++) {
                double number = k * Utils.TwoPow(n) + 1;
                if(Utils.isPrime(number) && Utils.isPrime(n * Utils.TwoPow(k) + 1)) pairs.put(k, n);
            }
        }
        for(Entry<Integer, Integer> e : pairs.entrySet()) System.out.print("("+e.getKey()+","+e.getValue()+"),");
    }
}