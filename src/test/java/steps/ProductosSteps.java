package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ProductosPage;

public class ProductosSteps {

    ProductosPage productosPage = new ProductosPage();

    @Given("^Navego a siman.com$")
    public void navigateToSimanPage(){
        productosPage.maxWindow();
        productosPage.navigateToSiman();
    }

    @When("^Doy click al menu desplegable de categorias$")
    public void clickMenu(){
        productosPage.clickCategoriesMenu();
    }

    @Then("^Se despliega el menu$")
    public void validateResults(){
        Assert.assertEquals(true, productosPage.isMenuVisible());
    }

}