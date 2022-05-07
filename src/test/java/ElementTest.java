import Steps.ElementSteps;
import Steps.LandingSteps;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ElementTest extends BaseTest {

    ElementSteps elementSteps = new ElementSteps (webDriver);
    LandingSteps landingSteps = new LandingSteps (webDriver);

    @Test
    public void testElementTextBox () {
        landingSteps.clickOptions (0);
        elementSteps.clicElementTexBox (0);
        System.out.println ("The element name of Full Name is : " + elementSteps.getTextFullName ());
        Assert.assertEquals (elementSteps.getTextFullName (), "Full Name");
        System.out.println ("The element name of email is : " + elementSteps.getTextEmail ());
        Assert.assertEquals (elementSteps.getTextEmail (), "Email");
        System.out.println ("The element name of current address is : " + elementSteps.getTextCurrentAddress ());
        Assert.assertEquals (elementSteps.getTextCurrentAddress (), "Current Address");
        System.out.println ("The element name of permanent address is : " + elementSteps.getTextPermanentAddress ());
        Assert.assertEquals (elementSteps.getTextPermanentAddress (), "Permanent Address");
        System.out.println ("The element name of button is : " + elementSteps.getSubmitButton ());
        Assert.assertEquals (elementSteps.getSubmitButton (), "Submit");
    }

    @Test
    public void testDropDown () {
        webDriver.get ("https://demoqa.com/select-menu");
        //Select by visibleText Aqua
        elementSteps.selectFavoriteColor ("Aqua");
        System.out.println ("Selected option is: " + elementSteps.getSelectColor ());
        //Select by Index 3=Yellow
        elementSteps.selectFavoriteIndex (3);
        System.out.println ("Selected option is: " + elementSteps.getSelectColor ());
        //Select by Value 9 =Magenta
        elementSteps.selectFavoriteValue ("9");
        System.out.println ("Selected option is: " + elementSteps.getSelectColor ());
        //Print if Select object is multiple
        System.out.println ("Is Select multiple? " + elementSteps.isSelectMultiple ());
    }
//Exercice 3
    @Test
    public void testEmailTextBox () {
        webDriver.get ("https://demoqa.com/text-box");
        elementSteps.sendEmailTextBox ("Cynthia");
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,500)");
        elementSteps.clickSubmitButton ();
        Assert.assertFalse (elementSteps.emailDisplayed ());
        System.out.println ("Email Text Box is failed");
    }

    //Exercice 4

    @Test
    public void testInformationForm () {
        webDriver.get ("https://demoqa.com/text-box");
        elementSteps.sendFullNameTextBox ("Jane Doe");
        elementSteps.sendEmailTextBox ("janedoe@mai.com");
        elementSteps.sendCurrentAddressTextBox ("Test Av 2020, Los Angeles");
        elementSteps.sendPermanentAddressTextBox ("Test Av 2020, San Diego");
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,500)");
        elementSteps.clickSubmitButton ();
        Assert.assertTrue (elementSteps.emailDisplayed ());
        System.out.println ("The data is correct");
    }
}
