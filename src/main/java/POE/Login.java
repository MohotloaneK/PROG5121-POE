/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POE;

/**
 *
 * @author Mohotloanek
 */

public class Login {

    private String username;
    private String password;
    private String cellPhoneNumber;
    private String firstName;
    private String lastName;

    private String loginUsername;
    private String loginPassword;

    // Constructor
    public Login(String username, String password,
                 String cellPhoneNumber,
                 String firstName, String lastName) {

        this.username = username;
        this.password = password;
        this.cellPhoneNumber = cellPhoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Check username
    public boolean checkUserName() {

        return username != null
                && username.contains("_")
                && username.length() <= 5;
    }

    // Check password complexity
    public boolean checkPasswordComplexity() {

        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasCapital = false;
        boolean hasNumber = false;
        boolean hasSpecialCharacter = false;

        for (char character : password.toCharArray()) {

            if (Character.isUpperCase(character)) {
                hasCapital = true;
            }

            if (Character.isDigit(character)) {
                hasNumber = true;
            }

            if (!Character.isLetterOrDigit(character)) {
                hasSpecialCharacter = true;
            }
        }

        return hasCapital
                && hasNumber
                && hasSpecialCharacter;
    }

    // Check South African cellphone number
    public boolean checkCellPhoneNumber() {

        if (cellPhoneNumber == null) {
            return false;
        }

        /*
         * Regex reference:
         * Oracle Java Regular Expressions Tutorial
         * https://docs.oracle.com/javase/tutorial/essential/regex/
         */
        return cellPhoneNumber.matches("^\\+27\\d{9}$");
    }

    // Register user
    public String registerUser() {

        if (!checkUserName()) {

            return "Username is not correctly formatted; "
                    + "please ensure that your username contains "
                    + "an underscore and is no more than five "
                    + "characters in length.";
        }

        if (!checkPasswordComplexity()) {

            return "Password is not correctly formatted; "
                    + "please ensure that the password contains "
                    + "at least eight characters, a capital letter, "
                    + "a number, and a special character.";
        }

        if (!checkCellPhoneNumber()) {

            return "Cell phone number incorrectly formatted "
                    + "or does not contain international code; "
                    + "please correct the number and try again.";
        }

        return "User registered successfully.";
    }

    // Set Login information
    public void setLoginDetails(String loginUsername,
                                String loginPassword) {

        this.loginUsername = loginUsername;
        this.loginPassword = loginPassword;
    }

    // Verify Login
    public boolean loginUser() {

        return username.equals(loginUsername)
                && password.equals(loginPassword);
    }

    // Return Login result
    public String returnLoginStatus() {

        if (loginUser()) {

            return "Welcome " + firstName + ", "
                    + lastName
                    + " it is great to see you again.";
        }

        return "Username or password incorrect, please try again.";
    }
}


