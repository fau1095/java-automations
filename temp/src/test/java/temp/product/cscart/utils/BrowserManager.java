package temp.product.cscart.utils;


import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

public class BrowserManager {
    
    public static WebDriver getDriver(String type) {
        WebDriver driver=null;
        if(type.equalsIgnoreCase("chrome")){
             driver = new ChromeDriver();  
        }else if (type.equalsIgnoreCase("safari")){
             driver = new SafariDriver();
             
        }else{
            Assert.assertTrue(false, "No Browser Type Sent");
        }
        
        driver.manage().timeouts();
        driver.manage().window().maximize();
        return driver; 
        
    }
}
