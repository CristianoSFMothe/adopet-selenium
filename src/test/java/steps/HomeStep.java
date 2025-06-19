package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import org.openqa.selenium.By;
import pages.HomePage;
import runner.RunCucumberTests;

public class HomeStep extends RunCucumberTests {
    private String url = "https://adopet-tau.vercel.app/";
    private By elMsgWelcome = By.cssSelector("section > h3");
    private By elSecundaryText = By.cssSelector("section > p");

    int time = 15;
    HomePage homePage = new HomePage();

    @Dado("que o usuário acessa a página inicial do site")
    public void que_o_usuário_acessa_a_página_inicial_do_site() {
        homePage.visitHomePage(url);
    }

    @Então("a página deverá conter o texto {string}")
    public void a_página_deverá_conter_o_texto(String expectedMessage) {
        homePage.waitForVisibleText(elMsgWelcome, expectedMessage, time);
        homePage.validateText(elMsgWelcome, expectedMessage);
    }

    @E("o texto {string}")
    public void o_texto(String expectedText) {
        homePage.waitForVisibleText(elSecundaryText, expectedText, time);
        homePage.validateText(elSecundaryText, expectedText);
    }
}
