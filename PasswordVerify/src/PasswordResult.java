public class PasswordResult {
    private final boolean IS_VALID;
    private final String ERRORS;

    public PasswordResult(boolean isValid, String errors) {
        this.IS_VALID = isValid;
        this.ERRORS = errors;
    }

    @Override
    public String toString() {
        return "PasswordResult{"
                + IS_VALID
                + ERRORS
                + '}';
    }
}
