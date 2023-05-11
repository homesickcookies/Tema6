import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    static String resultadoEsperado;
    static String resultadoReal;
    static int input;

    @Test
    void test1() {
        input = 1;

        resultadoEsperado = "1";
        resultadoReal = FizzBuzz.getFizzBuzz(input);

        assertEquals(resultadoEsperado, resultadoReal);
    }
    @Test
    void test2() {
        input = 2;

        resultadoEsperado = "2";
        resultadoReal = FizzBuzz.getFizzBuzz(input);

        assertEquals(resultadoEsperado, resultadoReal);
    }
    @Test
    void test3() {
        input = 3;

        resultadoEsperado = "Fizz";
        resultadoReal = FizzBuzz.getFizzBuzz(input);

        assertEquals(resultadoEsperado, resultadoReal);
    }
}