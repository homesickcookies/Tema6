import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTTDTest {
    @ParameterizedTest
    @CsvSource({
            "'', 0",
            "'1', 1",
            "'1,1,2', 4",
            "'1,1,2', 4",
            "'1,2,', -1",
            "'1,2,-2', -1",
            "'5,1002', 5"
    })
    void testCalculadora(String input, int resultadoEsperado){
        int resultadoReal = OperacionesTTD.suma(input);
        assertEquals(resultadoEsperado, resultadoReal);
    }
}