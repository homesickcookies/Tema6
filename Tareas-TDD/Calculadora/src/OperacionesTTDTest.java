import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTTDTest {
    @ParameterizedTest
    @CsvSource({
            "'', 0",
            "'1', 1",
            "'1,1,2', 4",
    })
    void testCalculadora(String input, int resultadoEsperado){
        int resultadoReal = OperacionesTTD.suma(input);
        assertEquals(resultadoEsperado, resultadoReal);
    }
}