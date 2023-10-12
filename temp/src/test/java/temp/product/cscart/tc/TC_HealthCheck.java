package temp.product.cscart.tc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import temp.product.cscart.po.PO_Search;
import temp.product.cscart.utils.BrowserManager;

public class TC_HealthCheck {
    String url = "https://demos.mv.cs-cart.com/bc506fb8185938ce";

    @Test
    public void t_01_cscart_search() {
        WebDriver driver = BrowserManager.getDriver("chrome",url);
        PO_Search obj = PageFactory.initElements(driver,PO_Search.class);
        obj.SearchAProduct("computer");

    }
}
