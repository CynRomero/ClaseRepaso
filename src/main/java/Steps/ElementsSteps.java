package Steps;

import Pages.ElementsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementsSteps extends BaseSteps{

    ElementsPage elementsPage= new ElementsPage(webDriver);

    public ElementsSteps(WebDriver webDriver) {
        super(webDriver);
    }

//Validar que este la opción TexBos
    public String getText(){
       String text= elementsPage.getElementOption().getText();
       return  text;

    }
}
