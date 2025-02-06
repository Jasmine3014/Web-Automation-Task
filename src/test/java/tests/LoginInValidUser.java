package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginInValidUser extends BaseTest {

    @Test
    public void loginWithInvalidCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithInvalidCredentials();
        String expectedErrorMessage = "Username and password do not match any user in this service";
        Assert.assertTrue(loginPage.getErrorMessage().contains(expectedErrorMessage),
                "Error message does not contain the expected text");
    }
}