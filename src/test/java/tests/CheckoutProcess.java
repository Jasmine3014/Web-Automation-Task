package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddToCard;
import pages.CheckoutInfo;
import pages.LoginPage;

public class CheckoutProcess extends BaseTest {

    @Test
    public void checkout() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithValidCredentials();

        AddToCard addToCard = new AddToCard(driver);
        addToCard.clickOnBackPackAddToCart();
        addToCard.clickOnAddToCartBtn();
        addToCard.clickOnCheckoutBtn();

        CheckoutInfo checkoutInfo = new CheckoutInfo(driver);
        checkoutInfo.checkoutInformation();
        checkoutInfo.clickOnContinue();
        Assert.assertTrue(addToCard.isBackPackHeadingPresesnt(), "Sauce Labs Backpack is not present Here");
        checkoutInfo.clickOnFinish();
        Assert.assertTrue(checkoutInfo.successMsgDisplayed(),"Sucess Message is not Displayed");
    }
}
