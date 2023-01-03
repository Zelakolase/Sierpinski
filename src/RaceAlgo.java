import java.util.ArrayList;

public class RaceAlgo {
    public static void main(String[] args) {
        ArrayList<Integer> Ks = new ArrayList<>(); // After MainLoop, it should have all Sierpenskis
        for(int temp = 1; temp < Config.maxK; temp+=2) Ks.add(temp);

        MainLoop : for(int n = 0; n < Config.maxN; n++) {
            long F = System.nanoTime();
            for(int i = 0;i < Ks.size(); i++) {
                if(Utils.isPrime((long) (Ks.get(i) * Utils.TwoPow(n) + 1))) Ks.remove(i);
            }
            System.out.println(Ks.size()+","+(System.nanoTime()-F)/1_000_000d);
        }
    }
}
