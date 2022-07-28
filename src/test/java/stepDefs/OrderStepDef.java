package stepDefs;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.SearchResultPage;

public class OrderStepDef extends TestBase {
    HomePage homePage;
    SearchResultPage resultPage;

    @Given("user is on the Home Page")
    public void homePage()
    {
        initialize();
        homePage = new HomePage();
        Assert.assertEquals(homePage.getHomePageTitle(),"My Store");
        System.out.println(homePage.getHomePageTitle() + " User is on the Home Page");
    }
    @When("user search an {string}")
    public void searchAnItem(String strItem)
    {
        homePage.searchProduct(strItem);
        System.out.println("user search an item");
    }
    @Then("should display search results")
    public void displaySearchResults()
    {
        resultPage = new SearchResultPage();
        Assert.assertEquals(resultPage.getPageTitle(),"getPageTitle");
        System.out.println(resultPage.getPageTitle() +" should display search results");
        Assert.assertEquals(resultPage.dispalySearchResults(),"T-Shirts");
    }

    @Given("Item should display the search results")
    public void displaySearchResult()
    {
        Assert.assertEquals(resultPage.dispalySearchResults(),"T-Shirts");
        System.out.println("Item should display the search results");

    }
    @When("user add item to the cart")
    public void addItemToCart()
    {
        resultPage.addItemtoCart();
        System.out.println("user add item to the cart");
    }
    @Then("Item must be available in the cart")
    public void itemAvailableIncart()
    {

        System.out.println("Item must be available in the cart");
    }
}
