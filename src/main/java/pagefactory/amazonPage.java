package pagefactory;

import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonPage extends BasePage {

//Constructor for Webdriver instance
    public amazonPage(SelfHealingDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
@FindBy(css = "span#nav-link-accountList-nav-line")
    WebElement signinbtn;

    public amazonPage open() {
        driver.get("https://www.amazon.in/");
        return this;
    }

    public amazonPage signinbtn() {
        signinbtn.click();
        return this;
    }

}
