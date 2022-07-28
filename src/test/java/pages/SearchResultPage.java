package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends TestBase {

    @FindBy(xpath="//span[contains(text(),'T-Shirts')]")
    WebElement searchResults;

    @FindBy(xpath = "//img[contains(@title,'Faded Short Sleeve T-shirts')]")
    WebElement item;

    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addToCartBtn;

    @FindBy(xpath = "//a[contains(@title,'Proceed to checkout')]")
    WebElement proceedToCheckOut;

    public SearchResultPage(){
        PageFactory.initElements(driver,this);
    }


    public String dispalySearchResults()
    {
        String getSearchResult = searchResults.getText();
        return getSearchResult;
    }

    public void addItemtoCart()
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(item).perform();
        actions.moveToElement(item).click(addToCartBtn).perform();
        if (proceedToCheckOut.isDisplayed())
        {
            proceedToCheckOut.click();
        }
    }
    public String getPageTitle()
    {
        return driver.getTitle();
    }

}
