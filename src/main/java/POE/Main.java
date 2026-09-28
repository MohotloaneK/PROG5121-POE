/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POE;

import java.util.Scanner;


/**
 *
 * @author Mohotloanek
 */
public class Main {
    
   

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("       USER REGISTRATION");
        System.out.println("==================================");

        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        System.out.print("Enter cellphone number (+27...): ");
        String cellPhoneNumber = input.nextLine();

        // Create Login object
        Login user = new Login(
                username,
                password,
                cellPhoneNumber,
                firstName,
                lastName
        );

        System.out.println("\n--- Registration Results ---");

        // Username validation
        if (user.checkUserName()) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println(
                    "Username is not correctly formatted; "
                    + "please ensure that your username contains "
                    + "an underscore and is no more than five "
                    + "characters in length."
            );
        }

        // Password validation
        if (user.checkPasswordComplexity()) {
            System.out.println("Password successfully captured.");
        } else {
            System.out.println(
                    "Password is not correctly formatted; "
                    + "please ensure that the password contains "
                    + "at least eight characters, a capital letter, "
                    + "a number, and a special character."
            );
        }

        // Cellphone validation
        if (user.checkCellPhoneNumber()) {
            System.out.println("Cell phone number successfully added.");
        } else {
            System.out.println(
                    "Cell phone number incorrectly formatted "
                    + "or does not contain international code."
            );
        }

        // Registration
        System.out.println("\n" + user.registerUser());

        // Proceed to Login only if registration is successful
        if (user.checkUserName()
                && user.checkPasswordComplexity()
                && user.checkCellPhoneNumber()) {

            System.out.println("\n==================================");
            System.out.println("              LOGIN");
            System.out.println("==================================");

            System.out.print("Enter username: ");
            String loginUsername = input.nextLine();

            System.out.print("Enter password: ");
            String loginPassword = input.nextLine();

            user.setLoginDetails(loginUsername, loginPassword);

            System.out.println();
            System.out.println(user.returnLoginStatus());
        }

        input.close();
    } 
    
}
