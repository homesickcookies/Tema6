import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PasswordVerifyTest {
    @ParameterizedTest
    @CsvSource({
            "'',"
    })

    void verifyTest(String input, boolean resultadoEsperado) {
        boolean resultadoReal = PasswordVerify.passwordVerificator(input);
        assertEquals(resultadoEsperado, resultadoReal);
    }
}