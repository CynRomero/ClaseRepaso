import Steps.ElementsSteps;
import Steps.LandingSteps;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingTest extends BaseTest{

    ElementsSteps elementSteps = new ElementsSteps(webDriver);
    LandingSteps landingsSteps =new LandingSteps(webDriver);

    @Test
    public void testMenuOptionElement() {
        landingsSteps.clickOptions(0);
        System.out.println(elementSteps.getText());
        Assert.assertEquals(elementSteps.getText(), "Text Box");
    }
}



















