package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.*;

import java.util.concurrent.TimeUnit;
public abstract class TestBase {

    protected WebDriver driver;
    protected SomePage1 somePage1;
    protected SomePage2 somePage2;
    protected SomePage3 somePage3;
    protected SomePage4 somePage4;
    protected SomePage5 somePage5;

    @BeforeEach
    public void setup(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-notifications");
        options.addArguments("−−incognito");
        options.addArguments("--disable-extensions");
        options.addArguments("--headless");
        options.addArguments("--window-size=1920, 1080");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.navigate().to("https://demo.seleniumeasy.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        somePage1 = new SomePage1(driver);
        somePage2 = new SomePage2(driver);
        somePage3 = new SomePage3(driver);
        somePage4 = new SomePage4(driver);
        somePage5 = new SomePage5(driver);
    }

    @AfterEach
    public void dispose(){
        driver.manage().deleteAllCookies();
        driver.quit();
    }

}
