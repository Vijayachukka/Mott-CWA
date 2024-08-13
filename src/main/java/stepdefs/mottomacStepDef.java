package stepdefs;

import MottamcPages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mottomacStepDef
{
    private LoginPage loginPage=new LoginPage();


    @Given("^Open the Mottomac website$")
    public void launchApplication()
    {
        loginPage.launchMottoWebsite();

    }
    @And("^Accept the cookies$")
    public void acceptTheCookies()
    {
        loginPage.selectLanguage();

    }
    @After
    public void closeBrowser()
    {
        loginPage.closeBrowser();
    }

    @When("^Click on the Mott Homepage$")
    public void clickOnTheMottHomepage()
    {
        loginPage.clickHomePage();
    }

    @Then("^HomePage is displayed$")
    public void homepageIsDisplayed()
    {
        loginPage.verifyTitleOfHomePage();
    }
}
