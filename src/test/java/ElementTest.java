import Steps.ElementSteps;
import Steps.LandingSteps;
import org.testng.annotations.Test;

public class ElementTest extends BaseTest {

    ElementSteps elementSteps = new ElementSteps ( webDriver );
    LandingSteps landingSteps = new LandingSteps ( webDriver );

    @Test
    public void testElementTextBox(){
        landingSteps.clickOptions (0);
        elementSteps.clicElementTexBox (0);

    }

    @Test
    public void testDropDown ( ) {
        webDriver.get ( "https://demoqa.com/select-menu" );
        //Select by visibleText Aqua
        elementSteps.selectFavoriteColor ( "Aqua" );
        System.out.println ( "Selected option is: " + elementSteps.getSelectColor ( ) );
        //Select by Index 3=Yellow
        elementSteps.selectFavoriteIndex ( 3 );
        System.out.println ( "Selected option is: " + elementSteps.getSelectColor ( ) );
        //Select by Value 9 =Magenta
        elementSteps.selectFavoriteValue ( "9" );
        System.out.println ( "Selected option is: " + elementSteps.getSelectColor ( ) );
        //Print if Select object is multiple
        System.out.println ( "Is Select multiple? " + elementSteps.isSelectMultiple ( ) );
    }
}
