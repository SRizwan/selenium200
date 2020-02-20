package Help;

import common.WebAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SimpleHelpPage extends WebAPI {


    @FindBy(xpath = "//a[@id='lnk_help']")
    WebElement help;

    @FindBy(xpath = "//a[@id='lnk_findananswer']")
    WebElement faq;





    public void alert()
    {Alert alert = driver.switchTo().alert();
 System.out.println(alert.getText());
 try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
 alert.dismiss();
}



















    public void navigateToHelp(){
        help.click();
    }





}
