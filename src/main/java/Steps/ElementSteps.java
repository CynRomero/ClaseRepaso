package Steps;

import Pages.ElementsPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementSteps extends BaseSteps {

    ElementsPage elementsPage = new ElementsPage (webDriver);

    public ElementSteps (WebDriver webDriver) {
        super (webDriver);
    }

    //Validar que este la opción TexBox
    public String getText () {
        String text = elementsPage.getElementOption ().getText ();
        return text;
    }
    //Sábado 30 de abril

    public void selectFavoriteColor (String color) {
        Select dropDownColors = elementsPage.getDropDownColors ();
        dropDownColors.selectByVisibleText (color);
    }

    public void selectFavoriteIndex (int index) {
        Select dropDownColors = elementsPage.getDropDownColors ();
        dropDownColors.selectByIndex (index);
    }

    public void selectFavoriteValue (String value) {
        Select dropDownColors = elementsPage.getDropDownColors ();
        dropDownColors.selectByValue (value);
    }

    public boolean isSelectMultiple () {
        Select dropDownColors = elementsPage.getDropDownColors ();
        return dropDownColors.isMultiple ();
    }

    public String getSelectColor () {
        Select dropDowncolors = elementsPage.getDropDownColors ();
        WebElement selectedOption = dropDowncolors.getFirstSelectedOption ();
        return selectedOption.getText ();
    }


    //Dar clic en  el elemento Text Box
    public void clicElementTexBox (int option) {
        elementsPage.getMenuoptionsElements ().get (option).click ();
    }

    //Tarea 2:  Validar que estén presentes los campos: Full Name, Email, Current Address y el Submit button.

    public String getTextFullName () {
        String fullName = elementsPage.getFullName ().getText ();
        return fullName;
    }

    public String getTextEmail () {
        String email = elementsPage.getEmail ().getText ();
        return email;
    }

    public String getTextCurrentAddress () {
        String currentAddress = elementsPage.getCurrentAddress ().getText ();
        return currentAddress;
    }

    public String getTextPermanentAddress () {
        String permanentAddress = elementsPage.getPermanentAddress ().getText ();
        return permanentAddress;
    }

    public String getSubmitButton () {
        String submitButton = elementsPage.getSubmitButton ().getText ();
        return submitButton;
    }
//Input Text Box Elements

    public void sendFullNameTextBox (String name) {
        WebElement fullNameTextName = elementsPage.getFullNameInput ();
        fullNameTextName.sendKeys (name);
    }

    public void sendEmailTextBox (String email) {
        WebElement fullNameTextName = elementsPage.getEmailInput ();
        fullNameTextName.sendKeys (email);

    }
    public void sendCurrentAddressTextBox (String current) {
        WebElement fullNameTextName = elementsPage.getCurrentAddressInput ();
        fullNameTextName.sendKeys (current);
    }
    public void sendPermanentAddressTextBox (String permanent) {
        WebElement fullNameTextName = elementsPage.getPermanentAddressInput ();
        fullNameTextName.sendKeys (permanent);
    }
    public void clickSubmitButton () {
        WebElement clickSubmitButton = elementsPage.getSubmitButton ();
        clickSubmitButton.click ();
    }

    public Boolean emailDisplayed () {
        WebElement emailDisplayed = elementsPage.getEmailDisplayedFalse ();
        return emailDisplayed.isDisplayed ();

    }

}
