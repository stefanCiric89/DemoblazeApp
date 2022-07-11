import com.beust.ah.A;
import com.company.CartPage;
import com.company.MainPage;
import com.company.ProductPage;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;


    public class VerifyAddProductToCart extends BaseTest{

        @Test
        public void AddProductToCart() throws InterruptedException {

            MainPage mainPage= new MainPage(driver);
            mainPage.openPage();
            //Thread.sleep(1000);
            //mainPage.clickOnItemNokiaLumia1520();
            mainPage.clickOnItemByName("Nexus 6");


           ProductPage productPage = new ProductPage(driver);
           Assert.assertEquals(productPage.isProductPageDisplayed(),true,"Error");
           Thread.sleep(1000);
           productPage.clickOnCartBtn();
           Thread.sleep(1000);
           Alert alert = driver.switchTo().alert();
           alert.accept();

            CartPage cartPage = new CartPage(driver);
            cartPage.openPage();
            Assert.assertEquals(cartPage.isYourCartDisplayed(),true,"Error");
            Thread.sleep(1000);
            cartPage.clickRemoveItemBtn();



        }
    }

