import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    private String pathChromeDriverPath= "C:\\Users\\cynth\\Documents\\WebDriver-Automatización\\chromedriver.exe";

    public WebDriver webDriver = getChromeWebDriver();

    private WebDriver getChromeWebDriver() {
        System.setProperty("webdriver.chrome.driver", pathChromeDriverPath);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        chromeOptions.merge(desiredCapabilities);
        return  new ChromeDriver(chromeOptions);
    }

    @BeforeTest
    public void beforeTest() {
        webDriver.get("https://demoqa.com");
        webDriver.manage().window().maximize();
    }
    @AfterTest
    public void afterTest() {
        webDriver.quit();
    }
}
