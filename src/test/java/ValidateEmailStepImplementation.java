import com.thoughtworks.gauge.Step;

public class ValidateEmailStepImplementation {

    @Step("Verify that <email> is a valid email address")
    public void validateEmailAddress(String email) {
        boolean isValid = isValidEmail(email);
        if (isValid) {
            System.out.println(email + " is a valid email address.");
        } 
    }

    @Step("Verify that <email> is not a valid email address")
    public void invalidEmailAddress(String email) {
        boolean isValid = isValidEmail(email);
        if (!isValid) {
            System.out.println(email + " is a valid email address.");
        } 
    }

    private boolean isValidEmail(String email) {

        return email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }
}
