import java.util.ArrayList;

public class NotSPS {
    public static int maxK = 100;
    public static int maxN = 100;
    public static void main(String[] args) {
        for(int k = 1;k < maxK; k += 2) {
            ArrayList<Integer> solutions = new ArrayList<>();
            for(int n = 0;n < maxN; n++) {
                double number = k * Utils.TwoPow(n) + 1;
                if(!Utils.isPrime((int) number)) solutions.add((int) number);
                if(solutions.size() > 10) break;
            }
            System.out.println("K: "+k+" N: "+solutions);
        }
    }
}
