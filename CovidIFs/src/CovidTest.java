import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    TEST GENERADO CON CHAT-GPT
*/

public class CovidTest {

    @ParameterizedTest
    @MethodSource("patientData")
    void covidTest(PatientData data, String expected) {
        String result = Covid.covid(data);
        assertEquals(expected, result);
    }

    private static Stream<Object[]> patientData() {
        return Stream.of(
                new Object[]{new PatientData(37.6f, true, false, false, false, false, false, false, false, "Madrid"), "/diagnostico_bueno/"},
                new Object[]{new PatientData(37.8f, true, false, false, false, false, false, false, false, "Barcelona"), "/diagnostico_bueno/"},
                new Object[]{new PatientData(37.9f, true, true, false, false, false, false, false, false, "Valencia"), "/diagnostico_bueno/"},
                new Object[]{new PatientData(38f, true, false, false, false, false, false, false, false, "Sevilla"), "/diagnostico/Sevilla"},
                new Object[]{new PatientData(38.1f, true, true, false, false, false, false, false, false, "Zaragoza"), "/diagnostico/Zaragoza"},
                new Object[]{new PatientData(38.2f, true, true, true, false, false, false, false, false, "Bilbao"), "/diagnostico/Bilbao"},
                new Object[]{new PatientData(38.3f, true, true, true, true, false, false, false, false, "Murcia"), "/diagnostico/Murcia"},
                new Object[]{new PatientData(38.4f, true, true, true, true, true, false, false, false, "Málaga"), "/diagnostico/Málaga"},
                new Object[]{new PatientData(38.5f, true, true, true, true, true, true, false, false, "Alicante"), "/diagnostico/Alicante"},
                new Object[]{new PatientData(38.6f, true, true, true, true, true, true, true, false, "Vallecas"), "/diagnostico/Vallecas"},
                new Object[]{new PatientData(38.7f, true, true, true, true, true, true, true, true, "Granada"), "/diagnostico/Granada"},
                new Object[]{new PatientData(38.8f, false, false, false, false, false, false, false, false, "Cádiz"), "/cuarentena/"},
                new Object[]{new PatientData(38.9f, true, false, false, false, false, false, false, false, "Toledo"), "/diagnostico/Toledo"},
                new Object[]{new PatientData(39f, true, true, false, false, false, false, false, false, "Santander"), "/diagnostico/Santander"},
                new Object[]{new PatientData(39.1f, true, true, true, false, false, false, false, false, "Almería"), "/diagnostico/Almería"},
                new Object[]{new PatientData(39.2f, true, true, true, true, false, false, false, false, "Badajoz"), "/diagnostico/Badajoz"},
                new Object[]{new PatientData(39.3f, true, true, true, true, true, false, false, false, "Albacete"), "/diagnostico/Albacete"},
                new Object[]{new PatientData(39.4f, true, true, true, true, true, true, false, false, "Lugo"), "/diagnostico/Lugo"}
        );
    }
}
