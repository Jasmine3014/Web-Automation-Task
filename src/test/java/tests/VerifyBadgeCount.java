package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddToCard;
import pages.LoginPage;

public class VerifyBadgeCount extends BaseTest{
    @Test
    public void verifyAddRemoveTwiceAndBadgeCount() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithValidCredentials();

        AddToCard addToCard = new AddToCard(driver);
        addToCard.addItemsForBackBackAndBikeLight();
        Assert.assertEquals(addToCard.getCartBadgeCount(), "2", "Cart badge should show 2 after adding");
        addToCard.removeItemsForBackBackAndBikeLight();
        Assert.assertEquals(addToCard.getCartBadgeCount(), "0", "Cart badge should show 0 after removing");
        addToCard.addItemsForBackBackAndBikeLight();
        Assert.assertEquals(addToCard.getCartBadgeCount(), "2", "Cart badge should show 2 after adding");
        addToCard.removeItemsForBackBackAndBikeLight();
        Assert.assertEquals(addToCard.getCartBadgeCount(), "0", "Cart badge should show 0 after removing");
    }
}
