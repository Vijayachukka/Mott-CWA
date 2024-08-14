package MottamcPages.DigitalWindow;

import MottamcPages.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class digitalServicesFunctions extends LoginPage
{
    public void navigateToSection(String sectionName)
    {
        waitTime().until( ExpectedConditions.elementToBeClickable(By.xpath("//a[@aria-label='"+sectionName+"']")) );
        driver.findElement(By.xpath("//a[@aria-label='"+sectionName+"']")).click();
    }
    public void navigateToSubServices(String subSection)
    {
        waitTime().until( ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='js-digital-sub-menu']//a[@data-title='"+subSection+"']")) );
        driver.findElement(By.xpath("//div[@class='js-digital-sub-menu']//a[@data-title='"+subSection+"']")).click();

    }
    public void scrollToChangeSection(String section)
    {
        JavascriptExecutor executor = ((JavascriptExecutor) driver);
        WebElement changeSection = driver.findElement(By.xpath("//h3[contains(text(),'Operating model')]"));
        executor.executeScript("arguments[0].scrollIntoView(true);",changeSection);
    }
    public void clickOnChangeSection(String section)
    {
        WebElement changeSection = driver.findElement(By.xpath("//h3[contains(text(),'"+section+"')]"));
        waitTime().until( ExpectedConditions.elementToBeClickable(changeSection));
        changeSection.click();
        waitTime().until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Find out more']")));
    }
    public void inputFirstName(String name)
    {
        WebElement firstName= driver.findElement(By.id("firstname*52"));
        waitTime().until( ExpectedConditions.elementToBeClickable(firstName));
        firstName.sendKeys(name);
    }
    public void inputSurname(String name)
    {
        WebElement surName= driver.findElement(By.id("surname*52"));
        waitTime().until( ExpectedConditions.elementToBeClickable(surName));
        surName.sendKeys(name);
    }
    public void inputEmail(String email)
    {
        WebElement emailTextBox= driver.findElement(By.id("email*52"));
        waitTime().until( ExpectedConditions.elementToBeClickable(emailTextBox));
        emailTextBox.sendKeys(email);
    }
    public void selectServices(String value)
    {
        WebElement servicesDropDown= driver.findElement(By.xpath("//input[@class='multiselect-input' and @placeholder='Service*']"));
        waitTime().until( ExpectedConditions.elementToBeClickable(servicesDropDown));
        servicesDropDown.click();

        waitTime().until( ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='multiselect-list active']")));
        WebElement valuesCheckbox= driver.findElement(By.xpath("//div[@class='multiselect-list active']//span[text()='"+value+"']"));
        valuesCheckbox.click();
        servicesDropDown.click();
    }
    public void clickSendButton()
    {
        WebElement sendbtn= driver.findElement(By.xpath("//div[@class='moata-overflow-hidden']/main//button"));
        waitTime().until( ExpectedConditions.elementToBeClickable(sendbtn));
        try
        {
            sendbtn.click();
        }
        catch (Exception e)
        {
            sendbtn.click();
        }

    }
    public void verifySubmitMessage() throws InterruptedException {
        waitTime().until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-message' and text()='Thank you.']")));
        WebElement msg= driver.findElement(By.xpath("//div[@class='confirmation-message' and text()='Thank you.']"));
        //wait(100);
        Assert.assertTrue(msg.isDisplayed());
    }

}
