package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddToCard;
import pages.LoginPage;

public class VerifyMultipleBadgeCount extends BaseTest{

    @Test
    public void multipleBadgeCount() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithValidCredentials();

        AddToCard addToCard = new AddToCard(driver);
        addToCard.clickOnBackPackAddToCart();
        addToCard.clickOnBikeLightAddToCart();
        addToCard.clickOnBolTShirtBtnAddToCart();
        addToCard.clickOnJacketBtnAddToCart();
        Assert.assertEquals(addToCard.getCartBadgeCount(), "4", "Cart badge should show 4 after adding");
        addToCard.clickOnBikeLightRemoveBtn();
        Assert.assertEquals(addToCard.getCartBadgeCount(), "3", "Cart badge should show 3 after removing");
    }
}
