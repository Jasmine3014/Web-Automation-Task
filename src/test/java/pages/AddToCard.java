package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.BaseTest;

public class AddToCard extends BaseTest {
    private final By backPackBtn =By.id("add-to-cart-sauce-labs-backpack");
    private final By bikeLightBtn =By.id("add-to-cart-sauce-labs-bike-light");
    private final By jacketBtn =By.id("add-to-cart-sauce-labs-fleece-jacket");
    private final By boltTShirtBtn =By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private final By addToCartBtn = By.id("shopping_cart_container");
    private final By removeBackPackCartBtn = By.id("remove-sauce-labs-backpack");
    private final By removeBikeLightCartBtn = By.id("remove-sauce-labs-bike-light");
    private final By backPackHeading = By.xpath("//div[contains(text(), 'Sauce Labs Backpack')]");
    private final By bikeLightHeading = By.xpath("//div[contains(text(), 'Sauce Labs Bike Light')]");
    private final By cartBadge = By.xpath("//span[@data-test='shopping-cart-badge']");
    private final By checkOutBtn = By.id("checkout");

    public AddToCard(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnBackPackAddToCart() {
        driver.findElement(backPackBtn).click();
    }

    public void clickOnBikeLightAddToCart() {
        driver.findElement(bikeLightBtn).click();
    }

    public void clickOnBolTShirtBtnAddToCart() {
        driver.findElement(boltTShirtBtn).click();
    }

    public void clickOnJacketBtnAddToCart() {
        driver.findElement(jacketBtn).click();
    }

    public void clickOnAddToCartBtn() {
        driver.findElement(addToCartBtn).click();
    }

    public boolean isBackPackHeadingPresesnt() {
       return driver.findElement(backPackHeading).isDisplayed();
    }

    public boolean isBikeLightHeadingPresesnt() {
        return driver.findElement(bikeLightHeading).isDisplayed();
    }

    public void clickOnBackPackRemoveBtn() {
        driver.findElement(removeBackPackCartBtn).click();
    }

    public void clickOnBikeLightRemoveBtn() {
        driver.findElement(removeBikeLightCartBtn).click();
    }

    public void addItemsForBackBackAndBikeLight() {
        clickOnBackPackAddToCart();
        clickOnBikeLightAddToCart();
    }

    public void removeItemsForBackBackAndBikeLight() {
        clickOnBackPackRemoveBtn();
        clickOnBikeLightRemoveBtn();
    }

    public void clickOnCheckoutBtn() {
        driver.findElement(checkOutBtn).click();
    }

    public String getCartBadgeCount() {
        try {
            return driver.findElement(cartBadge).getText();
        } catch (Exception e) {
            return "0";
        }
    }
}
