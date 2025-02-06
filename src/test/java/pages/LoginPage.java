package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.BaseTest;

public class LoginPage extends BaseTest {
    private WebDriver driver;
    private final By userName = By.id("user-name");
    private final By password = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By productPage = By.id("page_wrapper");
    private final By errorMessage = By.cssSelector(".error-message-container h3");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginWithValidCredentials() {
        driver.findElement(userName).sendKeys("standard_user");
        driver.findElement(password).sendKeys("secret_sauce");
        driver.findElement(loginButton).click();
    }

    public void loginWithInvalidCredentials() {
        driver.findElement(userName).sendKeys("wrong_user");
        driver.findElement(password).sendKeys("secret_sauce");
        driver.findElement(loginButton).click();
    }

    public void lockedOutUser() {
        driver.findElement(userName).sendKeys("locked_out_user");
        driver.findElement(password).sendKeys("secret_sauce");
        driver.findElement(loginButton).click();
    }

    public boolean isLoginSuccessful() {
        return driver.findElement(productPage).isDisplayed();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}
