import com.company.MainPage;
import com.company.ProductPage;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;


    public class VerifyAddProductToCart extends BaseTest{

        @Test
        public void AddProductToCart(){

            MainPage mainPage= new MainPage(driver);
            mainPage.openPage();
            mainPage.clickOnItemNokiaLumia1520();


           ProductPage productPage = new ProductPage(driver);
            Assert.assertEquals(productPage.isProductPageDisplayed(),true,"fail");
            //productPage.clickOnCartBtn();

        }
    }

