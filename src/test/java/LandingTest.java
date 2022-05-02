import Steps.ElementSteps;
import Steps.LandingSteps;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingTest extends BaseTest{

    ElementSteps elementSteps = new ElementSteps(webDriver);
    LandingSteps landingsSteps =new LandingSteps(webDriver);

    @Test
    public void testMenuOptionElement() {
        landingsSteps.clickOptions(0);
        System.out.println(elementSteps.getText());
        Assert.assertEquals(elementSteps.getText(), "Text Box");
    }
}



















