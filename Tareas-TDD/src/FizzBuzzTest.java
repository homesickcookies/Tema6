import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    static String resultadoEsperado;
    static String resultadoReal;
    static int input;

    @Test
    void test01() {
        input = 1;

        resultadoEsperado = "1";
        resultadoReal = FizzBuzz.getFizzBuzz(input);

        assertEquals(resultadoEsperado, resultadoReal);
    }
    @Test
    void test02() {
        input = 2;

        resultadoEsperado = "2";
        resultadoReal = FizzBuzz.getFizzBuzz(input);

        assertEquals(resultadoEsperado, resultadoReal);
    }
    @Test
    void test03() {
        input = 3;

        resultadoEsperado = "Fizz";
        resultadoReal = FizzBuzz.getFizzBuzz(input);

        assertEquals(resultadoEsperado, resultadoReal);
    }
    @Test
    void test04() {
        input = 4;

        resultadoEsperado = "4";
        resultadoReal = FizzBuzz.getFizzBuzz(input);

        assertEquals(resultadoEsperado, resultadoReal);
    }
    @Test
    void test05() {
        input = 5;

        resultadoEsperado = "Buzz";
        resultadoReal = FizzBuzz.getFizzBuzz(input);

        assertEquals(resultadoEsperado, resultadoReal);
    }
    @Test
    void test06() {
        input = 6;

        resultadoEsperado = "Fizz";
        resultadoReal = FizzBuzz.getFizzBuzz(input);

        assertEquals(resultadoEsperado, resultadoReal);
    }
    @Test
    void test07() {
        input = 7;

        resultadoEsperado = "7";
        resultadoReal = FizzBuzz.getFizzBuzz(input);

        assertEquals(resultadoEsperado, resultadoReal);
    }
    @Test
    void test08() {
        input = 8;

        resultadoEsperado = "8";
        resultadoReal = FizzBuzz.getFizzBuzz(input);

        assertEquals(resultadoEsperado, resultadoReal);
    }
    @Test
    void test09() {
        input = 9;

        resultadoEsperado = "Fizz";
        resultadoReal = FizzBuzz.getFizzBuzz(input);

        assertEquals(resultadoEsperado, resultadoReal);
    }
    @Test
    void test10() {
        input = 10;

        resultadoEsperado = "Buzz";
        resultadoReal = FizzBuzz.getFizzBuzz(input);

        assertEquals(resultadoEsperado, resultadoReal);
    }
}