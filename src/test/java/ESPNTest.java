import Steps.ElementSteps;
import Steps.LandingSteps;
import org.testng.annotations.Test;

public class ESPNTest extends BaseTest {
    ElementSteps elementSteps = new ElementSteps(webDriver);
    LandingSteps landingsSteps =new LandingSteps(webDriver);

    @Test
    public void openESPNPage ( ) {
        webDriver.get("https://www.espn.com.mx/futbol/torneos");


    }
}
