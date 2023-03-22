package pageObjectModels;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class FirstTestCaseTest {
    static WebDriver driver = Browser.getBrowser("Chrome");
    @BeforeClass
    public static void before() {
        driver.get("https://ultimateqa.com/");
        driver.manage().window().maximize();
    }
    @Test
        public void verifyTitle() throws InterruptedException {
            HomePage homepage = PageFactory.initElements(driver, HomePage.class);
            homepage.typeInSearchBox("Java");
            Thread.sleep(3000);
            homepage.assertSearchBoxNotEmpty();
            homepage.clickOnSearchButton();
            Thread.sleep(3000);
            // Verify Search result title
            WebElement Title = driver.findElement(By.linkText("Java SDET Bootcamp"));
            String ActualTitle = Title.getText();
            String ExpectedTitle = "Java SDET Bootcamp";
            Assert.assertEquals(ActualTitle, ExpectedTitle);
            // Verify that img is link
            ContentPage contentPage = PageFactory.initElements(driver, ContentPage.class);
            Thread.sleep(3000);
            contentPage.assertEqualTitles();
        }

        @AfterClass
        public static void closeDriver() {
            Browser.closeAllDriver();
            System.out.println("All tests passed");
        }
    }