package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;


public class HomePage extends Utils {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void visitHomePage(String url) {
        driver.get(url);
    }

    public void waitForVisibleText(By element, String expectedText, int timeoutInSeconds) {
        super.waitForVisibleText(element, expectedText, timeoutInSeconds);
    }

    public void validateText(By element, String expectedText) {
        super.validateText(element, expectedText);
    }
}
