package pages;

import base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends TestBase {
    @FindBy(xpath ="//input[@id='search_query_top']" )
    WebElement searchBox;
    //WebDriverWait waits=new WebDriverWait(driver, Duration.ofSeconds(10));

    @FindBy(xpath = "//span[contains(text(),'T-shirts')]")
    WebElement searchElementFound;

    public HomePage()
    {
        PageFactory.initElements(driver,this);
    }
    public void searchProduct(String strProd){

        searchBox.sendKeys(strProd);
        searchBox.submit();
    }
    public String getHomePageTitle()
    {
        //waits.until(ExpectedConditions.visibilityOf(searchElementFound));
        return driver.getTitle();
    }

}
