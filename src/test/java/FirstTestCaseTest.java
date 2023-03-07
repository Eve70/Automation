import org.junit.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTestCaseTest {
        static WebDriver driver;

    @BeforeClass
        public static void setDriver() {
            System.setProperty("webdriver.chrome.driver", "C://Users//Evi//Desktop//Selenium//chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://ultimateqa.com/");
        }

        @Test
        public void verifyTitle () throws InterruptedException {
            //Find SearchBox and iniciate a search with word "java"
            WebElement SearchBox = driver.findElement(By.className("et_pb_s"));
            SearchBox.sendKeys("Java");
            Thread.sleep(3000);
            Assert.assertNotNull(SearchBox);
            driver.findElement(By.className("et_pb_s")).submit();
            Thread.sleep(3000);
            // Verify Search result title
            WebElement Title = driver.findElement(By.linkText("Java SDET Bootcamp"));
            String ActualTitle = Title.getText();
            String ExpectedTitle = "Java SDET Bootcamp";
            Assert.assertEquals(ActualTitle, ExpectedTitle);
            // Verify that img is link
            WebElement IMG_Link = driver.findElement(By.xpath("//*[@id=\"post-217279\"]/a/img"));
            IMG_Link.click();
            Thread.sleep(3000);
        }

        @AfterClass
        public static void closeDriver () {
            driver.quit();
            System.out.println("All tests passed");
        }
    }