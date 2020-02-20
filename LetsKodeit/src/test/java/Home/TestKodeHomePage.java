package Home;


import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestKodeHomePage extends WebAPI {

    static KodeHomePage hp;

    public static void getInitelements(){
       hp =PageFactory.initElements(driver,KodeHomePage.class);

    }

    @Test(priority = 1)
    public void testiFrame() {
        getInitelements();
        iframeHandle(hp.iFrameName);
        hp.useSearchbar("python");
        goBackToHomeWindow();
    }

    @Test(priority = 2)
    public  void testAlert(){
        getInitelements();

        hp.clickAlert();
        okAlert();
    }

    @Test(priority = 3)
    public void testAlert2(){
        getInitelements();
        hp.clickAlert();
        cancelAlert();
    }











}
