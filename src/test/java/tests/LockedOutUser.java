package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LockedOutUser extends BaseTest{

   @Test
    public void lockedUser() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.lockedOutUser();
       String expectedErrorMessage = "Sorry, this user has been locked out";
       Assert.assertTrue(loginPage.getErrorMessage().contains(expectedErrorMessage),
               "Error message does not contain the expected text");
    }
}
