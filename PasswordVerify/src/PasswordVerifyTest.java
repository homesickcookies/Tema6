import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PasswordVerifyTest {
    @ParameterizedTest
    @CsvSource({
            """
                    '', false,'
                    La contraseña debe tener mínimo 8 caracteres.
                    La contraseña debe tener mínimo 2 números.
                    La contraseña debe tener mínimo 1 caracter especial.
                    La contraseña debe tener mínimo 1 letra mayúscula.'""",
            """
                    'hola12', false,'
                    La contraseña debe tener mínimo 8 caracteres.
                    La contraseña debe tener mínimo 1 caracter especial.
                    La contraseña debe tener mínimo 1 letra mayúscula.'""",
            """
                    'holA', false,'
                    La contraseña debe tener mínimo 8 caracteres.
                    La contraseña debe tener mínimo 2 números.
                    La contraseña debe tener mínimo 1 caracter especial.'""",
            """
                    'hola!', false,'
                    La contraseña debe tener mínimo 8 caracteres.
                    La contraseña debe tener mínimo 2 números.
                    La contraseña debe tener mínimo 1 letra mayúscula.'""",
            """
                    'holaA!', false,'
                    La contraseña debe tener mínimo 8 caracteres.
                    La contraseña debe tener mínimo 2 números.'""",
            """
                    'hola12!', false,'
                    La contraseña debe tener mínimo 8 caracteres.
                    La contraseña debe tener mínimo 1 letra mayúscula.'""",
            """
                    'hola12A', false,'
                    La contraseña debe tener mínimo 8 caracteres.
                    La contraseña debe tener mínimo 1 caracter especial.'""",
            """
                    'holacaracola!', false,'
                    La contraseña debe tener mínimo 2 números.
                    La contraseña debe tener mínimo 1 letra mayúscula.'""",
            "'holacaracolaA!', false," +
                    "'\nLa contraseña debe tener mínimo 2 números.'",
            "'holacaracola12!', false," +
                    "'\nLa contraseña debe tener mínimo 1 letra mayúscula.'",
            "'holacaracola12A', false," +
                    "'\nLa contraseña debe tener mínimo 1 caracter especial.'",
            "'holacaracola12A!', true," +
                    "''",
            "'#P4blit0cl4v0uncl4vit0#', true," +
                    "''",
    })
    void verifyTest(String input, boolean isValidEsperado, String erroresEsperados) {
        PasswordResult resultadoEsperado = new PasswordResult(isValidEsperado, erroresEsperados);
        String resultadoReal = PasswordVerify.passwordVerificator(input);
        assertEquals(resultadoEsperado.toString(), resultadoReal);
    }
}