public class OperacionesTTD {
    public static int suma(String numbers){
        int result = 0;
        if (!numbers.equals("")) {
            String[] inputs = numbers.split(",");

            for (String number : inputs) {
                result += Integer.parseInt(number);
            }
        }

        return result;
    }
}
