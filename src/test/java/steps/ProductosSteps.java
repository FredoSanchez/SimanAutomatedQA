package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.ProductosPage;

public class ProductosSteps {

    ProductosPage productosPage = new ProductosPage();

    @Given("^Navego a siman.com$")
    public void navigateToSimanPage(){
        productosPage.maxWindow();
        productosPage.navigateToSiman();
    }



    @When("^Busco producto en siman.com$")
    public void buscarProductoSiman(){

        productosPage.buscarProducto();

    }


    @And("^Selecciono producto$")
    public void seleccionarProducto(){

        productosPage.clickProducto();

    }


    @And("^Dar click a boton de Siman Pro$")
    public void botonSimanPro(){

    }

    @And("^Selecciono garantia (.*)$")
    public void seleccionarGarantia(){

    }

    @And("^Doy click al boton comprar$")
    public void botonComprar(){

    }

    @And("^Doy click al boton finalizar compra$")
    public void botonFinalizarCompra(){

    }

    @And("^Elijo metodo de pago meses sin intereses$")
    public void pagoMesesIntereses(){

    }

    @And("^Elejir (.*)$")
    public void elejir(){

    }

    @And("^Elijo (.*) de meses$")
    public void elijoMeses(){

    }

    @And("^Doy click al boton de comprar ahora$")
    public void botonComprarAhora(){

    }

    @Then("^Producto fue comprado exitosamente$")
    public void productoComprado(){

    }

    @And("^Elijo metodo de pago por cuotas$")
    public void pagoCuotas(){

    }




}