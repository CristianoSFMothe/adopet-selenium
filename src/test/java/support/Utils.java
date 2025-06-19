package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTests;
import org.junit.Assert;

public class Utils extends RunCucumberTests {

    public void waitForVisibleText(By element, String expectedText, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(element, expectedText));
    }

    public void validateText(By element, String expectedText) {
        String actualText = driver.findElement(element).getText();
        Assert.assertEquals("Texto exibido diferente do esperado!", expectedText, actualText);
    }
}
