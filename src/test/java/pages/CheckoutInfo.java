package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.BaseTest;

public class CheckoutInfo extends BaseTest {
    private final By firstName = By.id("first-name");
    private final By lastName = By.id("last-name");
    private final By postalCode = By.id("postal-code");
    private final By continueBtn = By.id("continue");
    private final By finishBtn = By.id("finish");
    private final By successMsg = By.xpath("//h2[contains(text(), 'Thank you')]");

    public CheckoutInfo(WebDriver driver) {
        this.driver = driver;
    }

    public void checkoutInformation() {
        driver.findElement(firstName).sendKeys("John");
        driver.findElement(lastName).sendKeys("Doe");
        driver.findElement(postalCode).sendKeys("12345");
    }

    public void clickOnContinue() {
        driver.findElement(continueBtn).click();
    }

    public void clickOnFinish() {
        driver.findElement(finishBtn).click();
    }

    public boolean successMsgDisplayed() {
        return driver.findElement(successMsg).isDisplayed();
    }
}
