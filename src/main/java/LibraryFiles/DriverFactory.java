package LibraryFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverFactory {

public static WebDriver driver;

        public static void initializeBrowser(String browserName)
        {
            if (browserName.equalsIgnoreCase("Chrome"))
            {
                driver=new ChromeDriver();
            }
            else  if (browserName.equalsIgnoreCase("Firefox"))
            {
                driver=new FirefoxDriver();
            }
            else if (browserName.equalsIgnoreCase("Edge"))
            {
                driver=new EdgeDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
