public class Divisible3 {
    public static String esDibisible(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        if (sum % 3 == 0) {
            return "SI";
        } else {
            return "NO";
        }

    }
}
