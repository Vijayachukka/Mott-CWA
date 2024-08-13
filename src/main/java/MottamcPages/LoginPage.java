package MottamcPages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage
{
    public static WebDriver driver;
    static final String  mottoUrl="https://www.mottmac.com/";

    public void OpenBrowser()
    {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-setuid-sandbox");
        options.addArguments("--disable-gpu");
        options.addArguments("--lang=az-AZ");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-popup-blocking");
       // options.addArguments("--headless=new");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("disable-extensions");
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().clearDriverCache().setup();
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        //System.out.println(driver.findElement(By.xpath("//div[@class='copyright j-show-footer']")).getText());


        //a[@aria-label='Digital']
        //div[@class='js-digital-sub-menu']//a[@data-title='Services']
        //h3[contains(text(),'Change')]
        //input[@id='firstname*52']
        //input[@id='surname*52']
        //input[@id='email*52']
        //input[@class='multiselect-input' and @placeholder='Service*']
        //*[@id="f68d"]
        //*[@id="f68d"]
        //*[@id="message_f68d"]
    }
    public void launchMottoWebsite()
    {
        OpenBrowser();
        driver.get(mottoUrl);
        WebElement homepage = driver.findElement(By.xpath("//div[@class='logo-div']"));
        waitTime().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='logo-div']")));

    }
    public void clickHomePage()
    {
        WebElement homepage = driver.findElement(By.xpath("//div[@class='logo-div']"));
        waitTime().until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='logo-div']")));
        homepage.click();
    }
    public void verifyTitleOfHomePage()
    {
        Assert.assertEquals("Title of the home page is: ","Global engineering, management and development consultants - Mott MacDonald",driver.getTitle());
    }
    public WebDriverWait waitTime()
    {
        Duration timeout= Duration.ofSeconds(100);
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        return wait;
    }
    public void selectLanguage()
    {
        WebElement language = driver.findElement(By.xpath("//a[text()='Global (English)']"));
        waitTime().until( ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Global (English)']")) );
        language.click();

    }
    public void closeBrowser()
    {
        driver.quit();
    }
}
