import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;
    protected String url;

    @BeforeClass
    public void setup (){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Stefan\\Downloads\\Selenium\\chromedriver.exe");
        this.driver = new ChromeDriver();
    }

   /* @AfterClass
    public void close(){
        this.driver.quit();
    }*/
}
