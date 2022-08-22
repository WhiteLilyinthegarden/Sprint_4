import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pageObject.HomePageScooter;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected WebDriver driver;

    @Before
    public void runBrowserAndURL() {
        WebDriverManager.chromedriver().setup();

        //закоментила после проверки, что тесты прошли успешно, так, как в Хроме выходит баг
        //WebDriverManager.firefoxdriver().setup();
        //driver = new FirefoxDriver();

        driver = new ChromeDriver();
        driver.get(HomePageScooter.URL);
        driver.manage().deleteAllCookies();
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
