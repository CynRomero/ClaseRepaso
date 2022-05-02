package Pages;

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ElementsPage extends BasePage {

    public ElementsPage(WebDriver webDriver) {
        super(webDriver);
    }

    private String elementOptionCssLocator=".element-list.collapse.show > ul > #item-0 > span";
    // XPATH
    private String getElementOptionXPathLocator= "//li[@id='item-0']/span";

    private String dropDownColorsId="oldSelectMenu";
    // XPATH
    private String dropDownColorsXPathLocator="//select[@id='oldSelectMenu']";

    public WebElement getElementOption (){

        WebElement elemetOption =webDriver.findElement(By.cssSelector(elementOptionCssLocator));
        return elemetOption;
    }
    public List <WebElement> getMenuoptionsElements(){

        List<WebElement> menuOptionElements= webDriver.findElements (By.cssSelector (elementOptionCssLocator));
        return  menuOptionElements;
    }

//DropDown regresa un objeto Select

    public Select getDropDownColors(){
        WebElement colorsDropDown= webDriver.findElement(By.id(dropDownColorsId));
        Select colorsDropDownSelect= new Select(colorsDropDown);
        return  colorsDropDownSelect;

    }

    // Validar que estén presentes los campos: Full Name, Email, Current Address, Permanent Address y el Submit button.



}
