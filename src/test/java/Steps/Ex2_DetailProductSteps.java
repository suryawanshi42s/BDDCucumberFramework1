package Steps;

import LibraryFiles.DriverFactory;
import POMClasses.SwagLabHomePage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class Ex2_DetailProductSteps {
    SwagLabHomePage home=new SwagLabHomePage(DriverFactory.driver);

    @Then("user can see {int} products on home page")
    public void user_can_see_products_on_home_page(Integer expProductCount) {

        int actProductCount=home.getSwagLabHomePageProductCount();
        Assert.assertEquals(expProductCount,actProductCount,"Failed-Product count mismatch");

    }

    @Then("price of the SauceLabBackPack product should {double}")
    public void price_of_the_sauce_lab_back_pack_product_should(Double expProductPrice) {
        Double actProductPrice=home.getSwagLabHomePageBackPackProductPrice();
        Assert.assertEquals(expProductPrice,actProductPrice,"Failed-Act & Exp product price mismatch");

    }
    @Then("total price of the products should {double}")
    public void total_price_of_the_products_should(Double expTotalProductPrice) {
        double actTotalProductPrice=home.getSwagLabHomePageTotalProductPrice();
        Assert.assertEquals(expTotalProductPrice,actTotalProductPrice,"Failed-Act & Exp total product price mismatch");

    }
}
