public class PasswordResult {
    private final boolean isValid;
    private final String errors;

    public PasswordResult(boolean isValid, String errors) {
        this.isValid = isValid;
        this.errors = errors;
    }

    @Override
    public String toString() {
        return "PasswordResult{"
                + isValid
                + errors
                + '}';
    }
}
