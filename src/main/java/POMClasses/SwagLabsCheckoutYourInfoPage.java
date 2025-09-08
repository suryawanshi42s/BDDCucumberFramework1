package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsCheckoutYourInfoPage {

    @FindBy(xpath = "//input[@placeholder=\"First Name\"]") private WebElement FN;
    @FindBy(xpath = "//input[@placeholder=\"Last Name\"]") private WebElement LN;
    @FindBy(xpath = "//input[@placeholder=\"Zip/Postal Code\"]") private WebElement pincode;
    @FindBy(xpath = "//input[@type=\"submit\"]") private WebElement continueBtn;

    public SwagLabsCheckoutYourInfoPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public  void inpSwagLabsCheckoutYourInfoPageFN(String firstname)
    {
        FN.sendKeys(firstname);
    }

    public  void inpSwagLabsCheckoutYourInfoPageLN(String lastname)
    {
        LN.sendKeys(lastname);
    }

    public  void inpSwagLabsCheckoutYourInfoPagePinCode(String pincodeValue)
    {
        pincode.sendKeys(pincodeValue);
    }

    public void clickSwagLabsCheckoutYourInfoPageContinueBtn()
    {
        continueBtn.click();
    }

}
