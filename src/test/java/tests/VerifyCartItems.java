package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddToCard;
import pages.LoginPage;

public class VerifyCartItems extends BaseTest{

    @Test
    public void cartItems() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithValidCredentials();

        AddToCard addToCard = new AddToCard(driver);
        addToCard.clickOnBackPackAddToCart();
        addToCard.clickOnBikeLightAddToCart();
        addToCard.clickOnAddToCartBtn();
        Assert.assertTrue(addToCard.isBackPackHeadingPresesnt(), "Sauce Labs Backpack is not present Here");
        Assert.assertTrue(addToCard.isBikeLightHeadingPresesnt(), "Sauce Labs Bike Light is not present Here");
    }
}
