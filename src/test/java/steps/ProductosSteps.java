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

    @And("^Selecciono producto$")
    public void seleccionarProducto(){

        productosPage.clickProducto();

    }

   /* @And("^Selecciono producto$")
    public void seleccionarProducto(){

        productosPage.clickProducto();

    }

    @And("^Dar click a boton de Siman Pro$")
    public void botonSimanPro(){
        System.out.println("1");
    }

    /*@And("^Selecciono garantia (.*)$")
    public void seleccionarGarantia(){
        System.out.println("2");
    }

    @And("^Doy click al boton comprar$")
    public void botonComprar(){
        System.out.println("3");
    }

    @And("^Doy click al boton finalizar compra$")
    public void botonFinalizarCompra(){
        System.out.println("4");
    }

    @And("^Elijo metodo de pago meses sin intereses$")
    public void pagoMesesIntereses(){
        System.out.println("5");
    }

    /*@And("^Elejir (.*)$")
    public void elejir(){
        System.out.println("6");
    }*/

    /*@And("^Elijo (.*) de meses$")
    public void elijoMeses(){
        System.out.println("7");
    }

    @And("^Doy click al boton de comprar ahora$")
    public void botonComprarAhora(){
        System.out.println("8");
    }

    @Then("^Producto fue comprado exitosamente$")
    public void productoComprado(){
        System.out.println("9");
    }

    @And("^Elijo metodo de pago por cuotas$")
    public void pagoCuotas(){
        System.out.println("10");
    }*/

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