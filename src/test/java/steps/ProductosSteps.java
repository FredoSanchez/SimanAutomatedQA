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

    @When("^Busco (.*) en siman.com$")
    public void buscarProductoSiman(String producto){

        productosPage.buscarProducto(producto);

    }

    @And("^Inicio sesion en siman.com$")
    public void iniciarSesion(){
        productosPage.iniciarSesion();
    }

    @Then("^Inicio sesion correctamente$")
    public void sesionCorrecta(){

    }

    @And("^Selecciono producto 1$")
    public void seleccionarProducto(){

        productosPage.clickProducto();

    }

    @And("^Dar click a boton de Siman Pro$")
    public void simanPro(){
        productosPage.clickSimanPro();
    }


    @And("^Doy click al boton comprar$")
    public void botonComprar(){
        productosPage.clickBuyProduct();
    }

    @And("^Doy click al boton finalizar compra$")
    public void botonFinalizarCompra(){
        productosPage.clickBuyProduct();
    }

    @And("^Elijo metodo de pago meses sin intereses$")
    public void pagoMesesIntereses(){
        productosPage.clickMeseSinIntereses();
    }

    @And("^Elejir (.*)$")
    public void elejir(){
        System.out.println("6");
    }



    @And("^Selecciono garantia (.*)$")
    public void seleccionarGarantia(String opcion){
        productosPage.seleccionarGarantia(opcion);
    }

    @And("^Selecciono producto 2$")
    public void seleccionarProducto2(){
        productosPage.clickProducto2();
    }

    @And("^Elijo metodo de pago por cuotas$")
    public void pagoCuotas() {
        productosPage.clickPagoPorCuotas();
    }
}