package healenium;


import com.epam.healenium.SelfHealingDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

//@Testcontainers
public class BaseTest {
    static protected SelfHealingDriver driver;

    @BeforeTest
    static public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        //options.setHeadless(true);
        //declare delegate
        WebDriver seleniumWebdriver = new ChromeDriver(options);

        driver = SelfHealingDriver.create(seleniumWebdriver);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1200, 800));
    }

    @AfterTest
    static public void afterAll() {
        if (driver != null) {
            driver.quit();
        }
    }
}
