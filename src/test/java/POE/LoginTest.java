/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POE;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mohotloanek
 */
public class LoginTest {
    
   
    // Test 1: Username correctly formatted
    @Test
    public void testUsernameCorrectlyFormatted() {

        Login user = new Login(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Kyle",
                "Smith"
        );

        assertTrue(user.checkUserName());
    }

    // Test 2: Username incorrectly formatted
    @Test
    public void testUsernameIncorrectlyFormatted() {

        Login user = new Login(
                "kyle!!!!!!!",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Kyle",
                "Smith"
        );

        assertFalse(user.checkUserName());
    }

    // Test 3: Password meets complexity requirements
    @Test
    public void testPasswordMeetsComplexityRequirements() {

        Login user = new Login(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Kyle",
                "Smith"
        );

        assertTrue(user.checkPasswordComplexity());
    }

    // Test 4: Password does not meet complexity requirements
    @Test
    public void testPasswordDoesNotMeetComplexityRequirements() {

        Login user = new Login(
                "kyl_1",
                "password",
                "+27838968976",
                "Kyle",
                "Smith"
        );

        assertFalse(user.checkPasswordComplexity());
    }

    // Test 5: Cellphone correctly formatted
    @Test
    public void testCellPhoneCorrectlyFormatted() {

        Login user = new Login(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Kyle",
                "Smith"
        );

        assertTrue(user.checkCellPhoneNumber());
    }

    // Test 6: Cellphone incorrectly formatted
    @Test
    public void testCellPhoneIncorrectlyFormatted() {

        Login user = new Login(
                "kyl_1",
                "Ch&&sec@ke99!",
                "08966553",
                "Kyle",
                "Smith"
        );

        assertFalse(user.checkCellPhoneNumber());
    }

    // Test 7: Login successful
    @Test
    public void testLoginSuccessful() {

        Login user = new Login(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Kyle",
                "Smith"
        );

        user.setLoginDetails(
                "kyl_1",
                "Ch&&sec@ke99!"
        );

        assertTrue(user.loginUser());
    }

    // Test 8: Login failed
    @Test
    public void testLoginFailed() {

        Login user = new Login(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Kyle",
                "Smith"
        );

        user.setLoginDetails(
                "kyl_1",
                "WrongPassword"
        );

        assertFalse(user.loginUser());
    }
    
    
    // Test 9: Incorrect username message
@Test
public void testIncorrectUsernameMessage() {

    Login user = new Login(
            "kyle!!!!!!!",
            "Ch&&sec@ke99!",
            "+27838968976",
            "Kyle",
            "Smith"
    );

    String expected =
            "Username is not correctly formatted; please ensure that "
            + "your username contains an underscore and is no more "
            + "than five characters in length.";

    assertEquals(expected, user.registerUser());
}


// Test 10: Incorrect password message
@Test
public void testIncorrectPasswordMessage() {

    Login user = new Login(
            "kyl_1",
            "password",
            "+27838968976",
            "Kyle",
            "Smith"
    );

    String expected =
            "Password is not correctly formatted; please ensure that "
            + "the password contains at least eight characters, "
            + "a capital letter, a number, and a special character.";

    assertEquals(expected, user.registerUser());
}


// Test 11: Successful Login message
@Test
public void testSuccessfulLoginMessage() {

    Login user = new Login(
            "kyl_1",
            "Ch&&sec@ke99!",
            "+27838968976",
            "Kyle",
            "Smith"
    );

    user.setLoginDetails(
            "kyl_1",
            "Ch&&sec@ke99!"
    );

    String expected =
            "Welcome Kyle, Smith it is great to see you again.";

    assertEquals(expected, user.returnLoginStatus());
}


// Test 12: Failed Login message
@Test
public void testFailedLoginMessage() {

    Login user = new Login(
            "kyl_1",
            "Ch&&sec@ke99!",
            "+27838968976",
            "Kyle",
            "Smith"
    );

    user.setLoginDetails(
            "kyl_1",
            "WrongPassword"
    );

    String expected =
            "Username or password incorrect, please try again.";

    assertEquals(expected, user.returnLoginStatus());
}
    
}
