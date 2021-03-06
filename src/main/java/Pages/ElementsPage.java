package Pages;

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
    private String getElementOptionXPath= "//span[contains(text(),'Text Box')]";

    private String dropDownColorsId="oldSelectMenu";
    // XPATH
    private String dropDownColorsXPath="//select[@id='oldSelectMenu']";

    //Localizador de labelFull Name
    private String fullNameCssLocator = ".col-md-3.col-sm-12>#userName-label";
    private String fullNameXpath = "//label[@id='userName-label']";
    private String fullNameTextBoxXpath="//input[@id='userName']";
    //Localizador  Email
    private String emailCssLocator = ".col-md-3.col-sm-12>#userEmail-label";
    private String emailXpath = "//label[@id='userEmail-label']";
    private String emailTextXpath= "//input[@id='userEmail']";
    private String emailDisplayed="//div[@id='output']";

    //Localizador Current Address
    private String currentAddressCssLocator = ".col-md-3.col-sm-12>#currentAddress-label";
    private String currentAddressXpath = "//label[@id='currentAddress-label']";
    private String currentAddressTexBoxXpath="//textarea[@id='currentAddress']";
    //Localizador Address
    private String permanentAddressCssLocator= ".col-md-3.col-sm-12>#permanentAddress-label";
    private String permanentAddressXpath= "//label[@id='permanentAddress-label']";
    private String permanentAddressTexBoxXpath="//textarea[@id='permanentAddress']";
    //Localizador boton Submit
    private String submitButton = "#submit";
    private String submitButtonXpath = "//button[@id='submit']";

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

    // Validar que est??n presentes los campos: Full Name, Email, Current Address, Permanent Address y el Submit button.

    public WebElement getFullName (){
        WebElement elementFullName = webDriver.findElement(By.cssSelector(fullNameCssLocator));
        return elementFullName;
    }
    public WebElement getEmail(){
        WebElement elementFullName = webDriver.findElement(By.cssSelector(emailCssLocator));
        return elementFullName;
    }
    public WebElement getCurrentAddress(){
        WebElement elementAddress = webDriver.findElement(By.cssSelector(currentAddressCssLocator));
        return elementAddress;
    }
    public WebElement getPermanentAddress(){
        WebElement elementAddress = webDriver.findElement(By.cssSelector(permanentAddressCssLocator));
        return elementAddress;
    }

       //TextBox Elements

    public WebElement getEmailInput(){
        WebElement fullNameText= webDriver.findElement (By.xpath (emailTextXpath));
        return fullNameText;
    }
    //Click Button
    public WebElement getSubmitButton(){
        WebElement elementSubmitButton = webDriver.findElement(By.xpath (submitButtonXpath));
        return elementSubmitButton;
    }

    public WebElement getEmailDisplayedFalse(){
        WebElement fullNameText= webDriver.findElement (By.xpath (emailDisplayed));
        return fullNameText;
    }

    public WebElement getFullNameInput(){
        WebElement fullNameText= webDriver.findElement (By.xpath (fullNameTextBoxXpath));
        return fullNameText;
    }
    public WebElement getCurrentAddressInput(){
        WebElement fullNameText= webDriver.findElement (By.xpath (currentAddressTexBoxXpath));
        return fullNameText;
    }

    public WebElement getPermanentAddressInput(){
        WebElement fullNameText= webDriver.findElement (By.xpath (permanentAddressTexBoxXpath));
        return fullNameText;
    }
}
