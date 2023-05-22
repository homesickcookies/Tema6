public class TTDSongs {
    public static String ttdSongs(String animals) {
        String song = "";
        if (animals == null) {
            return song;
        }
        String[] yard = animals.split(",");

        if (yard.length == 1) {
            song += "There was an old lady who swallowed a " + yard[0] + ".\n" +
                    "I don't know why she swallowed a " + yard[0] + " - perhaps she'll die!" +
                    "\n";
        }

        return song;

    }


}