public class PasswordVerify {
    public static String passwordVerificator(String password) {
        boolean isValid = true;
        String errors = "";
        int digitCount = 0, specialCharCount = 0, uppercaseCount = 0;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                digitCount++;
            }
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                specialCharCount++;
            }
            if (Character.isUpperCase(password.charAt(i))) {
                uppercaseCount++;
            }
        }

        if (!(password.length() >= 8)) {
            errors += "\nLa contraseña debe tener mínimo 8 caracteres.";
            isValid = false;
        }
        if (!(digitCount >= 2)) {
            errors += "\nLa contraseña debe tener mínimo 2 números.";
            isValid = false;
        }
        if (!(specialCharCount >= 1)) {
            errors += "\nLa contraseña debe tener mínimo 1 caracter especial.";
            isValid = false;
        }
        if (!(uppercaseCount >= 1)) {
            errors += "\nLa contraseña debe tener mínimo 1 letra mayúscula.";
            isValid = false;
        }

        return new PasswordResult(isValid, errors).toString();
    }
}
