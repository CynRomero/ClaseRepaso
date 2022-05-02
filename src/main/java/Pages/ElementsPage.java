package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementsPage extends BasePage {

    public ElementsPage(WebDriver webDriver) {
        super(webDriver);
    }

    private String elementOptionCssLocator=".element-list.collapse.show > ul > #item-0 > span";
    private String dropDownColorsId="oldSelectMenu";

    public WebElement getElementOption (){

        WebElement elemetOption =webDriver.findElement(By.cssSelector(elementOptionCssLocator));
        return elemetOption;
    }
//DropDown regresa un objeto Select

    public Select getDropDownColors(){
        WebElement colorsDropDown= webDriver.findElement(By.id(dropDownColorsId));
        Select colorsDropDownSelect= new Select(colorsDropDown);
        return  colorsDropDownSelect;

    }
}
