package Deals;

import Deals.SimpleDealsPage;
import common.WebAPI;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSimpleDealsPage extends WebAPI {


    @Test
    public void testAddDealsToCart() throws InterruptedException {
        SimpleDealsPage dp= PageFactory.initElements(driver, SimpleDealsPage.class);
        dp.navigateToDeals();
        Thread.sleep(5000);
        dp.lg();
        dp.lgBtn();
        dp.addToCart();
        dp.zipCode();
        dp.cont();
}

   @Test
    public void launchLiveChat(){
        SimpleDealsPage dp=PageFactory.initElements(driver,SimpleDealsPage.class);
        dp.navigateToDeals();
        dp.launchChat();
    }


    @Test
    public void testMouseHoverOnA10SimpleHelp() throws InterruptedException {
        SimpleDealsPage dp=PageFactory.initElements(driver,SimpleDealsPage.class);
    dp.navigateToDeals();
    Actions action = new Actions(driver);
    action.moveToElement(dp.galaxy10e).build().perform();
    System.out.println("Mouse hover is working");
   }

    @Test
    public void testMouseHoverOnS20SimpleHelp() throws InterruptedException {
        SimpleDealsPage dp=PageFactory.initElements(driver,SimpleDealsPage.class);
        dp.navigateToDeals();
        Actions action = new Actions(driver);
        action.moveToElement(dp.galaxy20).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void testMouseHoverOnlgSTyloimpleHelp() throws InterruptedException {
        SimpleDealsPage dp=PageFactory.initElements(driver,SimpleDealsPage.class);
        dp.navigateToDeals();
        Actions action = new Actions(driver);
        action.moveToElement(dp.lgStylo).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void testMouseHovermotoE5SimpleHelp() throws InterruptedException {
        SimpleDealsPage dp=PageFactory.initElements(driver,SimpleDealsPage.class);
        dp.navigateToDeals();
        Actions action = new Actions(driver);
        action.moveToElement(dp.motoE5).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void testMouseHoverGalaxyJ2SimpleHelp() throws InterruptedException {
        SimpleDealsPage dp=PageFactory.initElements(driver,SimpleDealsPage.class);
        dp.navigateToDeals();
        Actions action = new Actions(driver);
        action.moveToElement(dp.galaxyJ2).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void testMouseHoverGalaxy2SimpleHelp() throws InterruptedException {
        SimpleDealsPage dp=PageFactory.initElements(driver,SimpleDealsPage.class);
        dp.navigateToDeals();
        Actions action = new Actions(driver);
        action.moveToElement(dp.galaxyJ2).build().perform();
        System.out.println("Mouse hover is working");
    }
    @Test
    public void testMouseHoverIphoneSESimpleHelp() throws InterruptedException {
        SimpleDealsPage dp=PageFactory.initElements(driver,SimpleDealsPage.class);
        dp.navigateToDeals();
        Actions action = new Actions(driver);
        action.moveToElement(dp.iPoneSE).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void testMouseHoverIphone6sSimpleHelp() throws InterruptedException {
        SimpleDealsPage dp=PageFactory.initElements(driver,SimpleDealsPage.class);
        dp.navigateToDeals();
        Actions action = new Actions(driver);
        action.moveToElement(dp.iPhone6s).build().perform();
        System.out.println("Mouse hover is working");
    }
    @Test
    public void testMouseHoverLgFiestaSimpleHelp() throws InterruptedException {
        SimpleDealsPage dp=PageFactory.initElements(driver,SimpleDealsPage.class);
        dp.navigateToDeals();
        Actions action = new Actions(driver);
        action.moveToElement(dp.lgFiesta).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void testMouseHoverTclLxSimpleHelp() throws InterruptedException {
        SimpleDealsPage dp=PageFactory.initElements(driver,SimpleDealsPage.class);
        dp.navigateToDeals();
        Actions action = new Actions(driver);
        action.moveToElement(dp.tclLx).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void testMouseHoveri7SimpleHelp() throws InterruptedException {
        SimpleDealsPage dp=PageFactory.initElements(driver,SimpleDealsPage.class);
        dp.navigateToDeals();
        Actions action = new Actions(driver);
        action.moveToElement(dp.iPhone7).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void testMouseHoverTclRavenSimpleHelp() throws InterruptedException {
        SimpleDealsPage dp=PageFactory.initElements(driver,SimpleDealsPage.class);
        dp.navigateToDeals();
        Actions action = new Actions(driver);
        action.moveToElement(dp.tclRaven).build().perform();
        System.out.println("Mouse hover is working");
    }












}
