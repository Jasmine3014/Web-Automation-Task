package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tests.BaseTest;

import java.util.List;

public class VerifySorting extends BaseTest {
    private final By sortDropdown = By.xpath("//select[@data-test='product-sort-container']");
    private final By productNames = By.xpath("//div[@class='inventory_item_name']");
    private final By productPrices = By.xpath("//div[@class='inventory_item_price']");

    public VerifySorting(WebDriver driver) {
        this.driver = driver;
    }

    public void selectSortOption(String option) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement optionElement = dropdown.findElement(By.xpath("//option[@value='" + option + "']"));
        optionElement.click();
    }

    public void verifySortedOrder(String option) {
        List<WebElement> productNamesList = driver.findElements(productNames);
        List<WebElement> productPricesList = driver.findElements(productPrices);

        boolean sorted = true;

        if (option.equals("az") || option.equals("za")) {
            for (int i = 0; i < productNamesList.size() - 1; i++) {
                String current = productNamesList.get(i).getText();
                String next = productNamesList.get(i + 1).getText();
                if ((option.equals("az") && current.compareTo(next) > 0) ||
                        (option.equals("za") && current.compareTo(next) < 0)) {
                    sorted = false;
                    break;
                }
            }
        } else if (option.equals("lohi") || option.equals("hilo")) {
            for (int i = 0; i < productPricesList.size() - 1; i++) {
                double current = Double.parseDouble(productPricesList.get(i).getText().replace("$", ""));
                double next = Double.parseDouble(productPricesList.get(i + 1).getText().replace("$", ""));
                if ((option.equals("lohi") && current > next) ||
                        (option.equals("hilo") && current < next)) {
                    sorted = false;
                    break;
                }
            }
        }
        assert sorted : "Assertion failed: Products are not sorted correctly. Sorting option: " + option;
    }
}
