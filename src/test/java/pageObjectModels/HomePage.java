package pageObjectModels;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    WebDriver driver = Browser.getBrowser("Chrome");

    //Using FindBy for locating elements
    @FindBy(how=How.CLASS_NAME, using="et_pb_s") WebElement SearchBox;
    @FindBy(how=How.CLASS_NAME, using="et_pb_searchsubmit") WebElement SearchButton;

        // This method to click on Search Button
    public void clickOnSearchButton(){
        SearchButton.click();
    }
    // This method types in the Search box
    public void typeInSearchBox(String SearchString){
        SearchBox.sendKeys(SearchString);
    }
    //to assert that Search box is not empty
    public void assertSearchBoxNotEmpty(){
        Assert.assertNotNull(SearchBox);
    }
}
