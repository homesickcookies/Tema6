public class Zapping {
    public static String zap(int canalA, int canalB){
        int zaps;


        if (canalA == canalB){
            zaps = 0;
        }


        if (canalA < 50 && canalB > 50) {
            zaps = (canalA + 99) - canalB;
        } else {
            zaps = canalB - canalA;
        }


        return zaps + " clics";
    }
}
