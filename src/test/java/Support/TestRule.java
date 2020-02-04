package Support;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestRule {
    private static WebDriver driver;
    private static String url = "https://www.google.com.br/";

    @Before
    public static WebDriver browser(){
        System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver");

        //iniciando o driver
        driver = new FirefoxDriver();
        driver.manage().window().maximize();

        //sistema aguarda 10 segundos até que o browser seja aberto
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(url);

        return driver;
    }

    public static  WebDriver getDriver(){
        return driver;
    }

    @After
    public void tearDown(){
        driver.manage().deleteAllCookies();;
        driver.quit();
        driver =  null;
    }
}
