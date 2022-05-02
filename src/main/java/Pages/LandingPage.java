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
    private String menuOptionsXPathLocator = "//div/div/div[2]/div/div/div";

    public List < WebElement > getMenuOptions ( ) {
        List < WebElement > menuOptions = webDriver.findElements ( By.cssSelector ( menuOptionsCSSLocator ) );
        return menuOptions;
    }
}
