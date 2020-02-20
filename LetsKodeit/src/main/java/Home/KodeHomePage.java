package Home;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KodeHomePage {

    @FindBy(xpath = "//div[@id='navbar']")
    WebElement iFrame;

    @FindBy(xpath = "//input[@id='search-courses']")
    WebElement iFrameSearchBar;

    @FindBy(name = "iframe-name")
    WebElement iFrameName;

    @FindBy(xpath = "//a[@id='header-sign-up-btn']")
    WebElement signUp;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/fieldset[1]/input[3]")
    public  static WebElement alert;

    public static void clickAlert(){
        alert.click();
    }




    public void useSearchbar(String info){
        iFrameSearchBar.sendKeys(info, Keys.ENTER);
    }






}
