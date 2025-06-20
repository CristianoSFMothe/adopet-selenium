package support;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTests;
import org.junit.Assert;

public class Utils extends RunCucumberTests {
    WebDriverWait wait;

    public void waitForVisibleText(By element, String expectedText, int timeoutInSeconds) {
        wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(element, expectedText));
    }

    public void validateText(By element, String expectedText) {
        String actualText = driver.findElement(element).getText();
        Assert.assertEquals("Texto exibido diferente do esperado!", expectedText, actualText);
    }

    public void waitForElementVisible(By locator, int timeInSeconds) {
        wait = new WebDriverWait(driver, timeInSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForElementClickable(By locator, int timeInSeconds) {
        wait = new WebDriverWait(driver, timeInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void validateCurrentUrl(String path) {
        String expectedUrl = "https://adopet-tau.vercel.app" + path;
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("URL incorreta!", expectedUrl, currentUrl);
    }

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 10000)");
        Thread.sleep(100);
    }

}
