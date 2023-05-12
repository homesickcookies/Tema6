public class Zapping {
    public static String contadorZaps(int canalA, int canalB) {
        int zaps;

        if (canalA < canalB) {
            if (canalA < 50 && canalB > 50) {
                zaps = (canalA + 99) - canalB;
            } else {
                zaps = canalB - canalA;
            }
        } else {
            if (canalA > 50 && canalB < 50) {
                zaps = (canalB + 99) - canalA;
            } else {
                zaps = canalA - canalB;
            }
        }


        return zaps + " clics";
    }
}
