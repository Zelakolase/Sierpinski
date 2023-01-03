import java.util.ArrayList;

public class RaceAlgo {
    public static void main(String[] args) {
        ArrayList<Integer> Ks = new ArrayList<>();
        for(int temp = 1; temp < Config.maxK; temp+=2) Ks.add(temp);

        for(int n = 0; n < Config.maxN; n++) {
            for(int i = 0;i < Ks.size(); i++) {
                if(Utils.isPrime((int) (Ks.get(i) * Utils.TwoPow(n) + 1))) Ks.remove(i);
            }
        }

        System.out.println("K values survived (Sierpinski): "+Ks);
    }
}
