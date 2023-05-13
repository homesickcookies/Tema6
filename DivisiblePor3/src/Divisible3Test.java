import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Divisible3Test {
    @ParameterizedTest
    @CsvSource({
            "2, 'SI'",
            "6, 'SI'",
            "4, 'NO'",

            "1234123,'NO'",
    })

    void testDibisible3(int input, String resultadoEsperado) {
        String resultadoReal = Divisible3.esDibisible(input);
        assertEquals(resultadoEsperado, resultadoReal);
    }
}