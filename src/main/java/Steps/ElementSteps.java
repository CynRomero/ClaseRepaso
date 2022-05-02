package Steps;

import Pages.ElementsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementSteps extends BaseSteps {

    ElementsPage elementsPage = new ElementsPage ( webDriver );

    public ElementSteps ( WebDriver webDriver ) {
        super ( webDriver );
    }

    //Validar que este la opción TexBos
    public String getText ( ) {
        String text = elementsPage.getElementOption ().getText ();
        return text;
    }
    //Sábado 30 de abril

    public void selectFavoriteColor ( String color ) {
        Select dropDownColors = elementsPage.getDropDownColors ();
        dropDownColors.selectByVisibleText ( color );
    }

    public void selectFavoriteIndex ( int index ) {
        Select dropDownColors = elementsPage.getDropDownColors ();
        dropDownColors.selectByIndex ( index );
    }

    public void selectFavoriteValue ( String value ) {
        Select dropDownColors = elementsPage.getDropDownColors ();
        dropDownColors.selectByValue ( value );
    }

    public boolean isSelectMultiple ( ) {
        Select dropDownColors = elementsPage.getDropDownColors ();
        return dropDownColors.isMultiple ();
    }

    public String getSelectColor ( ) {
        Select dropDowncolors = elementsPage.getDropDownColors ();
        WebElement selectedOption = dropDowncolors.getFirstSelectedOption ();
        return selectedOption.getText ();
    }
    /*
//Terminr ejecricio de CARRO

    public List<String> getSelectedCarsList(){
        List<String>

    }*/

}
