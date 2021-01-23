import java.util.ArrayList;
import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args) {

        /*ArrayList<String> passwords = new ArrayList<>();

        passwords.add("hallo");
        passwords.add("hallojzghjbhjb1");
        passwords.add("Hallokhhkjnl1");*/

        //checkListOfPasswords(passwords);

        String passwordValid = isPasswordValid(getInputString());
        System.out.println(passwordValid);

    }

    public static String getInputString() {
        System.out.print("Please enter a password: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static boolean checkLengthOfInputString(String password) {
        return password.length() >= 8;


    }

    public static boolean checkStringForNumbers(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkStringForUpperCase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkStringForLowerCase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static void printErrorMessage() {
        System.out.println("Password invalid! Make sure your password matches the following criteria!:");
        System.out.println("Password has to consist of at least 8 characters.");
        System.out.println("Password has to be written in upper and lower case.");
        System.out.println("Password has to contain at least one number.");
    }

    public static String isPasswordValid(String password) {
        if (!checkLengthOfInputString(password)) {
            printErrorMessage();
            return isPasswordValid(getInputString());
        }
        if (!checkStringForNumbers(password)) {
            printErrorMessage();
            return isPasswordValid(getInputString());
        }
        if (!checkStringForLowerCase(password)) {
            printErrorMessage();
            return isPasswordValid(getInputString());
        }
        if (!checkStringForUpperCase(password)) {
            printErrorMessage();
            return isPasswordValid(getInputString());
        }
        return "Password is valid!";
    }

    public static void checkListOfPasswords(ArrayList<String> passwords) {

        for (int i = 0; passwords.size() > i; i++) {
            System.out.println((i + 1) + ". Password: " + isPasswordValid(passwords.get(i)));

        }

    }

}



