package pageObjectModels;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpectedCondition {
    WebDriver driver = Browser.getBrowser("Chrome");

    //Using FindBy for locating elements
    @FindBy(how=How.CLASS_NAME, using="et_pb_s") WebElement SearchBox;
    @FindBy(how=How.CLASS_NAME, using="et_pb_searchsubmit") WebElement SearchButton;

    // This method to click on Search Button
    public void clickOnSearchButton(WebDriver driver, WebElement SearchButton, int timeout){
        new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(SearchButton));
        SearchButton.click();}
    // This method types in the Search box
    public WebElement typeInSearchBox(WebDriver driver, WebElement SearchBox, int timeout, String SearchString){
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(SearchBox));
        SearchBox.sendKeys(SearchString);
        return null;
    }
}
