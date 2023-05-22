import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TTDSongsTest {
    @ParameterizedTest
//    @CsvFileSource(delimiter = '|', resources = "/testData/tasca7.csv")
    @CsvFileSource(delimiter = '|', Te)
    void testTTDSongs(String input, String resultadoEsperado) {
        String resultadoReal = TTDSongs.ttdSongs(input);
        assertEquals(resultadoEsperado, resultadoReal);
    }
}



/*
"There was an old lady who swallowed a bird.\n" +
"I don't know why she swallowed a bird - perhaps she'll die!\n" +
"\n" +
"There was an old lady who swallowed a fly;\n" +
"That wriggled and wiggled and tickled inside her.\n" +
"She swallowed the fly to catch the bird;\n" +
"I don't know why she swallowed a bird - perhaps she'll die!\n" +
"\n" +
"There was an old lady who swallowed a spider;\n" +
"How absurd to swallow a spider.\n" +
"She swallowed the spider to catch the fly,\n" +
"She swallowed the fly to catch the bird;\n" +
"I don't know why she swallowed a bird - perhaps she'll die!\n" +
"\n"

 */