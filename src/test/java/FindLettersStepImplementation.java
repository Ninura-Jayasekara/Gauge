import com.thoughtworks.gauge.Step;

public class FindLettersStepImplementation {

    private String inputString;

    @Step("Given the string <inputString>")
    public void setString(String inputString) {
        this.inputString = inputString;
        System.out.println("Input String: " + inputString);
    }

    @Step("Find capital letters")
    public void findCapitalLetters() {
        System.out.print("Capital Letters: ");
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (Character.isUpperCase(ch)) {
                System.out.print(ch + " ");
            }
        }
        System.out.println();
    }

    @Step("Find simple letters")
    public void findSimpleLetters() {
        System.out.print("Simple Letters: ");
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (Character.isLowerCase(ch)) {
                System.out.print(ch + " ");
            }
        }
        System.out.println();
    }
}
