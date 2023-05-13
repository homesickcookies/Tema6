public class Covid {
    public static String covid(PatientData data) {

        if ((data.bodyTemperature() >= 38)
                && (data.difficultyBreathing() || data.diabetes() || data.cancer() || data.isPregnant() ||
                data.isOver60yearsold() || data.hepatic() || data.kidnevDisease() || data.respiratoryDisease())
        ) {
            return "/diagnostico/" + data.provincia();
        } else if (data.bodyTemperature() >= 38) {
            return "/cuarentena/";
        } else {
            return "/diagnostico_bueno/";
        }
    }
}