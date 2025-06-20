package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class RegisterPage extends Utils {
    WebDriver driver;


    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonRegister(By element) {
        waitForElementVisible(element, 10);
        waitForElementClickable(element, 10);
        driver.findElement(element).click();
    }

    public void fillInputName(By element, String name) {
        driver.findElement(element).sendKeys(name);
    }

    public void fillInputEmail(By element, String email) {
        driver.findElement(element).sendKeys(email);
    }

    public void fillInputPassword(By element, String password) {
        driver.findElement(element).sendKeys(password);
    }

    public void fillInputConfirmPassword(By element, String confirmPassword) {
        driver.findElement(element).sendKeys(confirmPassword);
    }

    public void clickButtonRegister() {
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }
}
