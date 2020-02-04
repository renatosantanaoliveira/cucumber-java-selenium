package Steps;

import Page.GooglePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSteps {
    @Given("eu acesso a página do google")
    public void acessarPagina(){
        GooglePage googlePage = new GooglePage();
        googlePage.acessarPage();
    }

    @And("clico no campo de busca")
    public void campoBusca(){
        GooglePage googlePage = new GooglePage();
        googlePage.campoBusca();
    }

    @When("eu digito um texto")
    public void informarTexto(){
        GooglePage googlePage = new GooglePage();
        googlePage.texto();
    }

    @Then("clico em pesquisar")
    public void clicarPesquisar(){
        GooglePage googlePage = new GooglePage();
        googlePage.pesquisar();
    }
}
