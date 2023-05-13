import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PasswordVerifyTest {
    @ParameterizedTest
    @CsvSource({
            "'', false",
            "'hola12', false",
            "'holA', false",
            "'hola!', false",
            "'holaA!', false",
            "'hola12!', false",
            "'hola12A', false",
            "'holacaracola12', false",
            "'holacaracola!', false",
            "'holacaracolA', false",
            "'ho12A!', false"
    })

    void verifyTest(String input, boolean resultadoEsperado) {
        boolean resultadoReal = PasswordVerify.passwordVerificator(input);
        assertEquals(resultadoEsperado, resultadoReal);
    }
}