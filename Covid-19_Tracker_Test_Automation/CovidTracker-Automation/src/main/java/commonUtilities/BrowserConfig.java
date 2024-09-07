package commonUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserConfig {
	public static WebDriver driver;
	public static WebDriver selectBrowser() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "//Project.properties");
        prop.load(file);
        String browser = prop.getProperty("browser");
        
        switch(browser) {
        case "chrome":
        	driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
        case "edge":
        	driver = new EdgeDriver();
			driver.manage().window().maximize();
			break;
        case "firefox":
        	driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
        default:
			System.out.println(
					"browser: " + browser + " is invalid, launching FireFox browser as browser of choice..");
			break;
        }
        return driver;
	}
}
