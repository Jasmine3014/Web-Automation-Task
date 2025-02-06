package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogoutPage {
    private WebDriver driver;
    private final By hamburgerMenu = By.id("react-burger-menu-btn");
    private final By logoutBtn = By.id("logout_sidebar_link");
    private final By loginBox = By.className("login-box");

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnHamburgerMenu() {
        driver.findElement(hamburgerMenu).click();
    }

    public void clickOnLogoutBtn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(logoutBtn));
        logoutButton.click();
    }
    public boolean isLoginPageDisplayed() {
        return driver.findElement(loginBox).isDisplayed();
    }
}
