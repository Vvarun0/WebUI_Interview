package env;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional; // Needed for @Optional
import org.testng.annotations.Parameters; // Needed for @Parameters
import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {


    protected WebDriver driver;

    @BeforeMethod
    @Parameters("browser") // This parameter will be supplied by testng.xml
    public void setUp(@Optional("chrome") String browser) {
        System.out.println("Setting up WebDriver for browser: " + browser);
        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Invalid browser specified. Defaulting to Chrome.");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
        }
        driver.manage().window().maximize(); // Maximize the browser window
        System.out.println("WebDriver initialized successfully.");
    }


    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            System.out.println("Quitting WebDriver.");
            driver.quit();
            System.out.println("WebDriver quit successfully.");
        }
    }
}
