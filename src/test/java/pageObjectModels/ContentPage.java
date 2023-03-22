package pageObjectModels;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContentPage {
    WebDriver driver = Browser.getBrowser("Chrome");

    //Using FindBy for locating elements
    @FindBy(how= How.CLASS_NAME, using="entry-title")
    WebElement Title2;


    // This method to click on Image
    public void assertEqualTitles(){
        String ActualTitle2 = Title2.getText();
        String ExpectedTitle2 = "Java SDET Bootcamp";
        Assert.assertEquals(ActualTitle2, ExpectedTitle2);
    }
}
