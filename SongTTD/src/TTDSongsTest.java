import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TTDSongsTest {
    @ParameterizedTest
    @CsvSource({
            ",''",
    })

    void testTTDSongs(String input, String resultadoEsperado) {
        String resultadoReal = TTDSongs.ttdSongs(input);
        assertEquals(resultadoEsperado, resultadoReal);
    }
}