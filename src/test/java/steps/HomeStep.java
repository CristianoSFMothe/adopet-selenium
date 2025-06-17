package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeStep {
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 15);

    @Dado("que o usuário acessa a página inicial do site")
    public void que_o_usuário_acessa_a_página_inicial_do_site() {
        driver.get("https://adopet-tau.vercel.app/");
    }
    @Então("a página deverá conter o texto {string}")
    public void a_página_deverá_conter_o_texto(String string) {
        wait.until(ExpectedConditions.textToBePresentInElementLocated(
                By.cssSelector("section > h3"), "Boas-vindas!"));
    }
    @E("o texto {string}")
    public void o_texto(String string) {
        wait.until(ExpectedConditions.textToBePresentInElementLocated(
                By.cssSelector("section > p"),
                "Adotar pode mudar uma vida. Que tal buscar seu novo melhor amigo hoje? Vem com a gente!"));
    }
}
