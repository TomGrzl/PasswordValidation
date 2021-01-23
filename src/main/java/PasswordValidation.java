import java.util.ArrayList;
import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args) {

        runChosenMethod(getMethod());

    }


    //methods to get and check passwords
    public static String getInputString() {
        System.out.print("Please enter a password: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static ArrayList<String> getPasswordList(int numberOfPasswords) {
        ArrayList<String> passwordList = new ArrayList<>();

        for (int i = 0; i < numberOfPasswords; i++)
            passwordList.add(getInputString());

        return passwordList;
    }

    public static int getListLength() {
        System.out.print("Please enter the amount of passwords you want to add to the list: ");
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
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

    //aggregated checks
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
        return "Password is valid! Password has been set to" + password;
    }

    public static String isPasswordListValid(String password) {
        if (!checkLengthOfInputString(password)) {
            return "Password invalid!";
        }
        if (!checkStringForNumbers(password)) {
            return "Password invalid!";
        }
        if (!checkStringForLowerCase(password)) {
            return "Password invalid!";
        }
        if (!checkStringForUpperCase(password)) {
            return "Password invalid!";
        }
        return "Password is valid! Password has been set to" + password;
    }

    public static void checkListOfPasswords(ArrayList<String> passwords) {
        for (int i = 0; passwords.size() > i; i++) {
            System.out.println((i + 1) + ". Password: " + isPasswordListValid(passwords.get(i)));
        }
    }

    //methods to execute program
    public static String getMethod() {
        System.out.print("Please choose whether you like to create a single password(1) or a list of passwords(2):");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void runChosenMethod(String s) {
        if ((s.equals("1"))) {
            String passwordValid = isPasswordValid(getInputString());
            System.out.println(passwordValid);
        } else if ((s.equals("2"))) {
            checkListOfPasswords(getPasswordList(getListLength()));
        }
    }
}





