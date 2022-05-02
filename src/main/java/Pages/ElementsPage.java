package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPage extends BasePage {

    public ElementsPage(WebDriver webDriver) {
        super(webDriver);
    }

    private String elementOptionCssLocator=".element-list.collapse.show > ul > #item-0 > span";

    public WebElement getElementOption (){

        WebElement elemetOption =webDriver.findElement(By.cssSelector(elementOptionCssLocator));
        return elemetOption;
    }

}
