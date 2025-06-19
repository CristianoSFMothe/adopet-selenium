package pages;

import org.openqa.selenium.By;
import utils.Utils;

public class HomePage extends Utils {

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
