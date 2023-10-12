package temp.product.cscart.utils;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class BrowserManager {
    
    public static WebDriver getDriver(String type, String url) {
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
        driver.get(url);
        Reporter.log("Navigated to Browser:"+type+"URL: " +url, true);
        return driver; 
        
    }
}
