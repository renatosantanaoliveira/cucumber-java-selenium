package Map;

import Support.TestRule;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleElementMap {

    public  GoogleElementMap(){
        PageFactory.initElements(TestRule.getDriver(), this);
    }

    @FindBy(name = "q")
    protected WebElement texto_busca;
    @FindBy(name = "q")
    protected WebElement campo_busca;
    @FindBy(xpath = "//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")
    protected WebElement btnBusca;
    @FindBy(css = "#hplogo")
    protected WebElement logo_google;
}
