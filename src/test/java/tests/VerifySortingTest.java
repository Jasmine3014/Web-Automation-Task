package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.VerifySorting;

public class VerifySortingTest extends BaseTest {

    @Test
    public void sortingTest() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithValidCredentials();

        VerifySorting verifySorting = new VerifySorting(driver);
        verifySorting.selectSortOption("lohi");
        verifySorting.verifySortedOrder("lohi");
        verifySorting.selectSortOption("hilo");
        verifySorting.verifySortedOrder("hilo");
        verifySorting.selectSortOption("az");
        verifySorting.verifySortedOrder("az");
        verifySorting.selectSortOption("za");
        verifySorting.verifySortedOrder("za");
    }
}
