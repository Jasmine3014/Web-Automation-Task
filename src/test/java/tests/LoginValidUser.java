package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginValidUser extends BaseTest {

    @Test
    public void validCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithValidCredentials();
        Assert.assertTrue(loginPage.isLoginSuccessful(),"Login is not successful in the product Page");
    }
}
