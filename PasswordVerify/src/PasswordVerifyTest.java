import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PasswordVerifyTest {
    //    \nLa contraseña debe tener mínimo 8 caracteres.\nLa contraseña debe tener mínimo 2 números.\nLa contraseña debe tener mínimo 1 caracter especial.\nLa contraseña debe tener mínimo 1 letra mayúscula.
    @ParameterizedTest
    @CsvSource({
            "'', false," +
                    "'\nLa contraseña debe tener mínimo 8 caracteres." +
                    "\nLa contraseña debe tener mínimo 2 números." +
                    "\nLa contraseña debe tener mínimo 1 caracter especial." +
                    "\nLa contraseña debe tener mínimo 1 letra mayúscula.'",
            "'hola12', false," +
                    "'\nLa contraseña debe tener mínimo 8 caracteres." +
                    "\nLa contraseña debe tener mínimo 1 caracter especial." +
                    "\nLa contraseña debe tener mínimo 1 letra mayúscula.'",
            "'holA', false," +
                    "'\nLa contraseña debe tener mínimo 8 caracteres." +
                    "\nLa contraseña debe tener mínimo 2 números." +
                    "\nLa contraseña debe tener mínimo 1 caracter especial.'",
            "'hola!', false," +
                    "'\nLa contraseña debe tener mínimo 8 caracteres." +
                    "\nLa contraseña debe tener mínimo 2 números." +
                    "\nLa contraseña debe tener mínimo 1 letra mayúscula.'",
            "'holaA!', false," +
                    "'\nLa contraseña debe tener mínimo 8 caracteres." +
                    "\nLa contraseña debe tener mínimo 2 números.'",
            "'hola12!', false," +
                    "'\nLa contraseña debe tener mínimo 8 caracteres."+
                    "\nLa contraseña debe tener mínimo 1 letra mayúscula.'",
            "'hola12A', false," +
                    "'\nLa contraseña debe tener mínimo 8 caracteres." +
                    "\nLa contraseña debe tener mínimo 1 caracter especial.'",
            "'holacaracola!', false," +
                    "'\nLa contraseña debe tener mínimo 2 números." +
                    "\nLa contraseña debe tener mínimo 1 letra mayúscula.'",
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