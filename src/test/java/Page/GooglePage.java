package Page;

import Map.GoogleElementMap;
import Support.TestRule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GooglePage extends GoogleElementMap {
    private WebDriver driver;

    public  GooglePage(){
        PageFactory.initElements(TestRule.getDriver(), this);
    }

    public void acessarPage() {
        logo_google.isDisplayed();
    }

    public void campoBusca() {
        campo_busca.isDisplayed();
    }

    public void texto() {
        texto_busca.sendKeys("Pão de queijo");
    }

    public void pesquisar() {
        btnBusca.click();
    }
}
