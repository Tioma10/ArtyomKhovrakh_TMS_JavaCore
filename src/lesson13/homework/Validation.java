package lesson13.homework;

public class Validation {
    private static String password;

    public static boolean getValidation(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (login.contains(" ") == true || login.length() >= 20) {
            throw new WrongLoginException("Incorrect login");
        }

        boolean hasDigits = false;
        for (int i = 0; i < password.length() && !hasDigits; i++) {
            if (Character.isDigit(password.charAt(i))) {
                hasDigits = true;
            }
        }

        if (password.length() >= 20 || hasDigits == false){
            throw new WrongLoginException("Incorrect password");
        }

        if (password == confirmPassword){
            return true;
        }

        return false;

    }


}
