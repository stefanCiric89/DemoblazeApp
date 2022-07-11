package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
        this.url = super.url + "prod.html?idp_=2";
    }

    private WebElement cartBtn() {
        return driver.findElement(By.xpath("//div[@class='col-sm-12 col-md-6 col-lg-6']"));
    }
    public void clickOnCartBtn(){
        this.cartBtn().click();
    }


    public Boolean isProductPageDisplayed(){

        Boolean toReturn = true;

        List<WebElement> listProductContent = driver.findElements(By.xpath("//div[@class='product-content product-wrap clearfix product-deatil']"));

        if (listProductContent.size() == 1){
            toReturn = true;
        } else {
            toReturn = false;
        }
        return toReturn;
    }
}
