package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver, int time) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, time);
    }

    public void visitHomePage(String url) {
        driver.get(url);
    }

    public void waitForVisibleText(By element, String expectedText) {
        wait.until(ExpectedConditions.textToBePresentInElementLocated(element, expectedText));
    }

    public void validateText(By element, String expectedText) {
        String actualText = driver.findElement(element).getText();
        Assert.assertEquals("Texto exibido diferente do esperado!", expectedText, actualText);
    }
}
