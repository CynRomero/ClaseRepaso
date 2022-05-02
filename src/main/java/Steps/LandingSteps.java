package Steps;

import Pages.LandingPage;
import org.openqa.selenium.WebDriver;

public class LandingSteps extends BaseSteps{

    LandingPage landingPage= new LandingPage(webDriver);


    public LandingSteps(WebDriver webDriver) {
        super(webDriver);
    }

    //Dar click en la opción de Elements

    public void clickOptions(int option){
        landingPage.getMenuOptions().get(option).click();

    }
}
