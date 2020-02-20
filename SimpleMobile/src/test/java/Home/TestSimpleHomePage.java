package Home;

import Deals.SimpleDealsPage;
import Help.SimpleHelpPage;
import common.WebAPI;
import org.apache.xmlbeans.impl.xb.xsdschema.BlockSet;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

public class TestSimpleHomePage extends WebAPI {

    @Test
    public void testSearchInfo()
    { SimpleHomePage hp= PageFactory.initElements(driver,SimpleHomePage.class);
    hp.searchInfo("package");
    Assert.assertEquals("package","package");

  }

   @Test
    public void testSearchMultipleItems() {
       SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

       List<String> items = new ArrayList<>();
       items.add("apple");
       items.add("samsung");
       items.add("package");
       for (String item : items) {
           hp.searchInfo(item);
           hp.clrarItem();
       }


   }

   @Test
   public void testScrollSimpleHelp() throws InterruptedException {
      SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
      hp.simpleHelp();
      Thread.sleep(5000);
      JavascriptExecutor js=(JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,1000)");
   }

   @Test
   public void testScrollIntoViewSimpleHelp() throws InterruptedException {
      SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
      hp.simpleHelp();
      Thread.sleep(5000);
      JavascriptExecutor js=(JavascriptExecutor) driver;
      js.executeScript("arguments[0].scrollIntoView(true)", hp.brands);
   }

   @Test
   public void testScrollTillTheEndSimpleHelp() throws InterruptedException {
      SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
     hp.simpleHelp();
     JavascriptExecutor js=(JavascriptExecutor) driver;
      js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
      Thread.sleep(5000);
   }

   @Test
    public void testDropDownMenulgByTextSimpleHelp() throws InterruptedException {
     SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
    hp.simpleHelp();
    Select sel= new Select(hp.brands);
    sel.selectByVisibleText("lg");
   }

    @Test
    public void testDropDownMenuByTextalactelSimpleHelp() throws InterruptedException {
     SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
    hp.simpleHelp();
    Select sel= new Select(hp.brands);
    sel.selectByVisibleText("alcatel");
   }@Test
    public void testDropDownMenuByTextappleSimpleHelp() throws InterruptedException {
     SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
    hp.simpleHelp();
    Select sel= new Select(hp.brands);
    sel.selectByVisibleText("apple");
   }@Test
    public void testDropDownMenuByTextbluSimpleHelp() throws InterruptedException {
     SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
    hp.simpleHelp();
    Select sel= new Select(hp.brands);
    sel.selectByVisibleText("blu");
   }@Test
    public void testDropDownMenuByTexthuaweiSimpleHelp() throws InterruptedException {
     SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
    hp.simpleHelp();
    Select sel= new Select(hp.brands);
    sel.selectByVisibleText("huawei");
   }@Test
    public void testDropDownlgMenuByTextSimpleHelp() throws InterruptedException {
     SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
    hp.simpleHelp();
    Select sel= new Select(hp.brands);
    sel.selectByVisibleText("lg");
   }

    @Test
    public void testDropDownMenuByTextmotorolaSimpleHelp() throws InterruptedException {
     SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
    hp.simpleHelp();
    Select sel= new Select(hp.brands);
    sel.selectByVisibleText("motorola");
   }@Test
    public void testDropDownMenuByTextsamsungSimpleHelp() throws InterruptedException {
     SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
    hp.simpleHelp();
    Select sel= new Select(hp.brands);
    sel.selectByVisibleText("samsung");
   }


   @Test
    public void testDropDownMenuByTextZeSimpleHelp() throws InterruptedException {
     SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
    hp.simpleHelp();
    Select sel= new Select(hp.brands);
    sel.selectByVisibleText("zte");
   }


    @Test
    public void testDropDownMenuByTextaccessSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("access");
    } @Test
    public void testDropDownMenuByTextallstarSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("allStar");
    } @Test
    public void testDropDownMenuByTextbladeSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("Blade");
    } @Test
    public void testDropDownMenuByTextcitrineSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("citrine");
    } @Test
    public void testDropDownMenuByTextCymbalSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("cymbal");
    } @Test
    public void testDropDownMenuByTextDestinySimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("destiny");
    } @Test
    public void testDropDownMenuByTextGalaxySimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("galaxy");
    } @Test
    public void testDropDownMenuByTextFiestaSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("fiesta");
    } @Test
    public void testDropDownMenuByTextGalaxysSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("galaxy s");
    } @Test
    public void testDropDownMenuByTextGraceSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("grace");
    } @Test
    public void testDropDownMenuByTextIphoneSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("iphone");
    } @Test
    public void testDropDownMenuByTextJasperSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("jasper");
    } @Test
    public void testDropDownMenuByTextJourneySimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("journey");
    } @Test
    public void testDropDownMenuByTextLuckySimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("lucky");
    } @Test
    public void testDropDownMenuByTextZteSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("rebel");
    } @Test
    public void testDropDownMenuByTextLxSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("lx");
    } @Test
    public void testDropDownMenuByTextMagnaSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("magna");
    } @Test
    public void testDropDownMenuByTextMajestySimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("majesty");
    } @Test
    public void testDropDownMenuByTextOptimusSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("optimus");
    }

    @Test
    public void testDropDownMenuByTextParagonSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("paragon");
    }

    @Test
    public void testDropDownMenuByTexPixiSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("pixi");
    } @Test
    public void testDropDownMenuByTextPowerSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("power");
    } @Test
    public void testDropDownMenuByTextPremierSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("premier");
    } @Test
    public void testDropDownMenuByTextProntoSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("pronto");
    } @Test
    public void testDropDownMenuByTextPixiSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("pixi");
    } @Test
    public void testDropDownMenuByTextRebelSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("rebel");
    } @Test
    public void testDropDownMenuByTextScendSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("scend");
    } @Test
    public void testDropDownMenuByTextSensaSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("sensa");
    } @Test
    public void testDropDownMenuByTextSiriusSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("Sirius");
    } @Test
    public void testDropDownMenuByTextSoloSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("Solo");
    }

    @Test
    public void testDropDownMenuByTextStyloSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("stylo");
    } @Test
    public void testDropDownMenuBySunsetPixiSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("sunset");
    } @Test
    public void testDropDownMenuByTclPixiSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("TCL");
    } @Test
    public void testDropDownMenuByTextTreasureSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("treasure");
    } @Test
    public void testDropDownMenuByTextUnicoSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("unico");
    } @Test
    public void testDropDownMenuByTextViewSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("view");
    } @Test
    public void testDropDownMenuByTextzfiveSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("zfive");
    } @Test
    public void testDropDownMenuByTextzipSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("zip");
    } @Test
    public void testDropDownMenuByTextZmaxSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
        hp.simpleHelp();
        Select sel= new Select(hp.models);
        sel.selectByVisibleText("zmax");
    }























    @Test
    public void testMouseHoverOnReUpSimpleHelp() throws InterruptedException {
     SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
    hp.simpleHelp();
    Actions action = new Actions(driver);
    action.moveToElement(hp.reUP).build().perform();
    System.out.println("Mouse hover is working");
   }

    @Test
    public void testArrow() throws InterruptedException {
        SimpleHomePage hp=PageFactory.initElements(driver,SimpleHomePage.class);
        hp.arrow.click();
        hp.arrow.click();
        hp.arrow.click();
    }
    @Test
   public void testLanguageChange() throws InterruptedException {
       SimpleHomePage hp=PageFactory.initElements(driver,SimpleHomePage.class);
       hp.language.click();
       hp.language.click();
    }



    @Test
   public void testMouseHoverOnShopSimpleHelp() throws InterruptedException {
     SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

    Actions action = new Actions(driver);
   action.moveToElement(hp.shop).build().perform();
    System.out.println("Mouse hover is working");
  }

    @Test
    public void testMouseHoverOnActivateSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.activate).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void testMouseHoverOnHelpSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.help).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void testMouseHoverOnDealsSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.deals).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void testMouseHoverOnWhySimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.why).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void testMouseHoverOnShopNowSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.shopNow).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void testMouseHoverBringPhoneSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.bringPhone).build().perform();
        System.out.println("Mouse hover is working");
    }



    @Test
    public void testMouseHoverLearnMoreSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.learnMore).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
   public void testMouseHoverSmbSimpleHelp() throws InterruptedException {
    SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

    Actions action = new Actions(driver);
    action.moveToElement(hp.Smb).build().perform();
    System.out.println("Mouse hover is working");
}

    @Test
    public void testMouseHoverCvrgSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.coverage).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void testMouseHoverfndStoreSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.findStore).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void testMouseHoverSimpleworksSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.simpleWorks).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void testMouseHoveractivePhoneSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.activePhone).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void testMousereUPlanPhoneSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.reUPPlan).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void testMouseeUPPlanPhoneSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.reUPPlan).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void testMousereUpPlanPhoneSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.reUPPlan).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void testMouseAutoupPhoneSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.autoReup).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void testMouseTrackOrderPhoneSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.trackOrder).build().perform();
        System.out.println("Mouse hover is working");
    }


    @Test
    public void testMousegetSupportPhoneSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.getSupport).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void testreferFrndSupportPhoneSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.refrFriend).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void testreferFrindSupportPhoneSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.refrFriend).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void testShopAllSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.shopAllPhones).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void testbuySimSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.buySim).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void testAllPhonesSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.allPlans).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void testpaymentPlansSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.paymentPlan).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void AppsPlansSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.apps).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void RetailSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.retail).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void StudntsSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.students).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void StudentsSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.students).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void FacebookSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.facebook).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void TwitterSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.twitter).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void TestHoverYoutubeSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.youtube).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void TestHoverAboutSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.aboutUs).build().perform();
        System.out.println("Mouse hover is working");
    } @Test
    public void TestHoverSiteMapSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.siteMap).build().perform();
        System.out.println("Mouse hover is working");
    } @Test
    public void TestHoverTermsSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.terms).build().perform();
        System.out.println("Mouse hover is working");
    } @Test
    public void TestHoverUnlockingSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.unlocking).build().perform();
        System.out.println("Mouse hover is working");
    } @Test
    public void TestHoverSimpleBlogSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.simpleBlog).build().perform();
        System.out.println("Mouse hover is working");
    } @Test
    public void TestHoverReturnSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.Return).build().perform();
        System.out.println("Mouse hover is working");
    } @Test
    public void TestHoverAccessibilitySimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.accesibility).build().perform();
        System.out.println("Mouse hover is working");
    } @Test
    public void TestHoverDealerSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.dealer).build().perform();
        System.out.println("Mouse hover is working");
    } @Test
    public void TestHoverPrivacyPolicySimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.privacyPolicy).build().perform();
        System.out.println("Mouse hover is working");
    } @Test
    public void TestHoverMobileIdentitySimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.mobileIdentity).build().perform();
        System.out.println("Mouse hover is working");
    } @Test
    public void TestHoverAflProgramSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.aflProgram).build().perform();
        System.out.println("Mouse hover is working");
    } @Test
    public void TestHoverHearingAidSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.hearingAid).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void TestHoverUseSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.use).build().perform();
        System.out.println("Mouse hover is working");
    }

    @Test
    public void TestHoverCaliSimpleHelp() throws InterruptedException {
        SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

        Actions action = new Actions(driver);
        action.moveToElement(hp.cali).build().perform();
        System.out.println("Mouse hover is working");
    }




















}
