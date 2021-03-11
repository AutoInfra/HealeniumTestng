package healenium;

import org.testng.annotations.Test;
import pagefactory.amazonPage;

public class amazontest extends  BaseTest{

    @Test
    public void amazonSignin()
    {
        amazonPage ap = new amazonPage(driver);
        ap.open();
        ap.signinbtn();
    }
}
