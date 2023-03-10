import java.util.ArrayList;

public class NotSPS {
    public static void main(String[] args) {
        for(int k = 1;k < Config.maxK; k += 2) {
            ArrayList<Integer> solutions = new ArrayList<>();
            for(int n = 0;n < Config.maxN; n++) {
                double number = k * Utils.TwoPow(n) + 1;
                if(Utils.isPrime(number)) solutions.add(n);
            }
            System.out.println("K: "+k+" N: "+solutions);
        }
    }
}
