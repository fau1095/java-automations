package temp.product.cscart.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import temp.product.cscart.utils.BrowserManager;

public class TC_HealthCheck {
    String url = "";

    @Test
    public void t_01_cscart_search() {
        WebDriver driver = BrowserManager.getDriver("chrome");
        
        driver.get(url);
        driver.findElement(By.name("q")).sendKeys("computer");;
        driver.findElement(By.className("ty-search-magnifier")).click();

        
    }
}
