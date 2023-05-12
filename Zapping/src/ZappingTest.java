import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ZappingTest {
    @ParameterizedTest
    @CsvSource({
            "0, 0, '0 clics'",
//            "1, 2, '1 clics'",
//            "10, 30, '20 clics'",
//            "2, 99, '2 clics'",
//            "5, 63, '41 clics'",
//            "63, 5, '41 clics'"
    })
    void testCalculadora(int input0, int input1, String resultadoEsperado){
        String resultadoReal = Zapping.zap(input0, input1);
        assertEquals(resultadoEsperado, resultadoReal);
    }
}