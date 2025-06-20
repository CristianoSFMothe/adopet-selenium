package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTests;

public class RegisterStep extends RunCucumberTests {
        WebDriverWait wait = new WebDriverWait(driver, 15);

    @E("clicar no link {string}")
    public void clicar_no_link(String string) {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[href='/cadastro']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[href='/cadastro']")));

        driver.findElement(By.cssSelector("[href='/cadastro']")).click();


    }

    @E("deverá ser redirecionando para página de cadasto")
    public void deverá_ser_redirecionando_para_página_de_cadasto() {
        wait.until(ExpectedConditions.textToBePresentInElementLocated(
                By.cssSelector("section > p"),
                "Ainda não tem cadastro?"
        ));

        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://adopet-tau.vercel.app/cadastro", currentUrl);
    }

    @Quando("preencher o formulário com dados validos")
    public void preencher_o_formulário_com_dados_validos() throws InterruptedException {
        driver.findElement(By.cssSelector("#name")).sendKeys("Cristiano");

        driver.findElement(By.cssSelector("#email")).sendKeys("cristiano@qa.com");

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 10000)");
        Thread.sleep(100);

        driver.findElement(By.id("pass-create")).sendKeys("Abc@123");

        driver.findElement(By.id("pass-confirm")).sendKeys("Abc@123");

        driver.findElement(By.cssSelector("button[type='submit']")).click();


        Thread.sleep(2000);
    }

    @Entao("deverá ser redirecionado para a página de login")
    public void deverá_ser_redirecionado_para_a_página_de_login() {
        wait.until(ExpectedConditions.textToBePresentInElementLocated(
                By.cssSelector("section > p"),
                "Já tem conta? Faça seu login:"
        ));

        // Valida o texto visível na página
        String actualText = driver.findElement(By.cssSelector("p")).getText();
        Assert.assertEquals("Texto incorreto!", "Já tem conta? Faça seu login:", actualText);

// Valida a URL atual
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("URL incorreta!", "https://adopet-tau.vercel.app/login", currentUrl);
    }

}
