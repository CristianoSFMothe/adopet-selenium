package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import pages.RegisterPage;
import runner.RunCucumberTests;

public class RegisterStep extends RunCucumberTests {

    RegisterPage registerPage = new RegisterPage(driver);

    private By btnRegister = By.cssSelector("[href='/cadastro']");
    private By elementExpected = By.cssSelector("section > p");
    private String txtRegisterAccount = "Ainda não tem cadastro?";
    private By inputName = By.cssSelector("#name");
    private By inputEmail = By.cssSelector("#email");
    private By inputPassword = By.id("pass-create");
    private By inputConfirmPassword = By.id("pass-confirm");
    private String txtLoginAccount = "Já tem conta? Faça seu login:";

    @E("clicar no link {string}")
    public void clicar_no_link(String string) {
       registerPage.clickButtonRegister(btnRegister);

    }

    @E("deverá ser redirecionando para página de cadastro")
    public void deverá_ser_redirecionando_para_página_de_cadasto() {
        registerPage.waitForVisibleText(elementExpected, txtRegisterAccount, 15);
        registerPage.validateCurrentUrl("/cadastro");
    }

    @Quando("preencher o formulário com dados validos")
    public void preencher_o_formulário_com_dados_validos() throws InterruptedException {
        registerPage.fillInputName(inputName, "Cristiano Ferreira");
        registerPage.fillInputEmail(inputEmail, "cristiano@qa.com");
        registerPage.scrollDown();
        registerPage.fillInputPassword(inputPassword, "Abc@123");
        registerPage.fillInputConfirmPassword(inputConfirmPassword, "Abc@123");
        registerPage.clickButtonRegister();
    }

    @Entao("deverá ser redirecionado para a página de login")
    public void deverá_ser_redirecionado_para_a_página_de_login() {
        registerPage.waitForVisibleText(elementExpected, txtLoginAccount, 15);
        registerPage.validateText(elementExpected, txtLoginAccount);
        registerPage.validateCurrentUrl("/login");
    }

}
