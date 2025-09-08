package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SwagLabHomePage {

    @FindBy(xpath = "//div[@class='app_logo']") private WebElement logo;
    @FindBy(xpath = "//div[@class=\"inventory_item_name \"]") private List<WebElement> allProducts;
     @FindBy(xpath = "(//div[@class=\"inventory_item_price\"])[1]") private WebElement backPackProductPrice;
    @FindBy(xpath = "//div[@class=\"inventory_item_price\"]") private List<WebElement> allProductsPrice;

    @FindBy(xpath = "//button[@name=\"add-to-cart-sauce-labs-backpack\"]") private WebElement AddToCartBackpack;
    @FindBy(xpath = "//a[@class=\"shopping_cart_link\"]") private WebElement PageCart;


    public SwagLabHomePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }


    public String getSwagLabHomePageLogoText()
    {
        String actLogoText = logo.getText();
        return actLogoText;
    }

    public int getSwagLabHomePageProductCount()
    {
        int actProductCount = allProducts.size();
        return actProductCount;
    }
    public double getSwagLabHomePageBackPackProductPrice()
    {
        String price = backPackProductPrice.getText();                  //$29.99

        price= price.substring(1) ;                           //29.99
        double actPrice = Double.parseDouble(price);      //convert string into double
        return actPrice;
    }

    public double getSwagLabHomePageTotalProductPrice()
    {
        double actTotalPrice=0.0;

        for(WebElement s1:allProductsPrice)
        {
            String text= s1.getText();
            text=text.substring(1);
            double price = Double.parseDouble(text);
            actTotalPrice=actTotalPrice+price;
        }
        return actTotalPrice;
    }

    public void clickSwagLabHomePageAddToCartBackpack()
    {
        AddToCartBackpack.click();
    }
    public void clickSwagLabHomePageCart(){
        PageCart.click();
    }
}
