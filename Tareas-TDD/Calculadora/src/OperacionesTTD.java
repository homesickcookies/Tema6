public class OperacionesTTD {
    public static int suma(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        if (numbers.endsWith(",") || numbers.contains("-")) {
            return -1;
        }

        String[] inputs = numbers.split(",");
        int result = 0;

        for (String input : inputs) {

            if (Integer.parseInt(input) >= 1000) {
                System.err.println("Número superior a 1000 ignorado");
            } else {
                result += Integer.parseInt(input);
            }
        }


        return result;
    }
}
