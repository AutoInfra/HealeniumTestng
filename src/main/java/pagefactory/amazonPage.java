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

//@FindBy(css = "#nav-link-accountList-nav-line-1")
//  @FindBy(xpath = "//span[@class='nav-line-2 nav-long-width']")
  @FindBy(xpath = "/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[1]/a[2]/span[2]")
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
