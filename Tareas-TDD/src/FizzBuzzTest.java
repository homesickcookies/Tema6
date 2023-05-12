import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @ParameterizedTest
    @CsvSource({
            "1, '1'",
            "2, '2'",
            "3, 'Fizz'",
            "4, '4'",
            "5, 'Buzz'",
            "6, 'Fizz'",
            "7, '7'",
            "8, '8'",
            "9, 'Fizz'",
            "10, 'Buzz'",
            "11, '11'",
            "12, 'Fizz'",
            "13, '13'",
            "14, '14'",
            "15, 'FizzBuzz'"
    })
    void testFizzBuzz(int input, String resultadoEsperado) {
        String resultadoReal = FizzBuzz.getFizzBuzz(input);
        assertEquals(resultadoEsperado, resultadoReal);
    }
}