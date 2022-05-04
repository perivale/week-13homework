package login.com.herokuapp.internet_the.driverfactory;


import io.github.bonigarcia.wdm.WebDriverManager;
import login.com.herokuapp.internet_the.propertyreader.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;


public class ManageDriver {
    public static WebDriver driver;
    String baseurl= PropertyReader.getInstance().getProperty("baseUrl");

    public  void selectBrowser(String browser){
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(baseurl);



    }
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    }