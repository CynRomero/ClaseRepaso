package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LandingPage extends BasePage {

    //WebDriver webDriver;

    public LandingPage ( WebDriver webDriver ) {
        super ( webDriver );
    }

    private String menuOptionsCSSLocator = "div.card.mt-4.top-card";
    //XPATH
    private String menuOptionsXPathLocator = "//div[contains(@class, 'card') and contains(@class, 'mt-4') and contains (@class,'top-card')]";

    public List < WebElement > getMenuOptions ( ) {
        List < WebElement > menuOptions = webDriver.findElements ( By.cssSelector ( menuOptionsCSSLocator ) );
        return menuOptions;
    }
}
