package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.LogoutPage;

public class LogoutTest extends BaseTest{

    @Test
    public void logout() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithValidCredentials();

        LogoutPage logoutPage = new  LogoutPage(driver);
        logoutPage.clickOnHamburgerMenu();
        logoutPage.clickOnLogoutBtn();
        Assert.assertTrue(logoutPage.isLoginPageDisplayed(),"Didn't redirected to the login page");
    }
}
