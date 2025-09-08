package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsCheckoutOverviewPage
{

    @FindBy(xpath = "//button[@data-test=\"finish\"]") private WebElement finish;

    public SwagLabsCheckoutOverviewPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void clickSwagLabsCheckoutOverviewPageFinish()
    {
        finish.click();
    }

}
