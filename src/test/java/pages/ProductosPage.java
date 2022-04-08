package pages;

import static java.lang.Thread.sleep;

public class ProductosPage extends BasePage {

    // String menuDropdownClass = "vtex-menu-2-x-menuItem";
    String menuDropdown = "//body/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/li[1]/div[1]/span[1]/div[1]",
            userInput = "//input[@id='email']",
            continueButton = "//body/div[@id='render-admin.login-legacy.home']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]",
            loginButton = "//body/div[@id='render-admin.login-legacy.home']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/button[1]",
            menuOptions = "/html/body/div[2]/div/div[1]/div/div[3]/div/div[1]/div/div/div/div/div[2]/div/div/li/div[2]/div/section/nav",
            itemBuscar = "vtex-styleguide-9-x-input",
            // iteLupa =
            // "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]/span[1]/div[1]/button[1]",
            seleccionarProducto = "//body/div[2]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/section[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/a[1]",
            SPDropdown = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[5]/div[3]/div[2]/div[2]/div[1]/div[1]",
            SPOpcion1 = "//li[contains(text(),'1año - $200')]",
            SPOpcion2 = "//li[contains(text(),'2años - $225')]",
            SPOpcion3 = "//li[contains(text(),'3años - $250')]",
            SPOpcion4 = "//li[contains(text(),'4 años - $275')]",
            SPOpcion5 = "//li[contains(text(),'Violeta6Meses - $2.02')]",
            btnMesesIntereses = "//a[@id='payment-group-custom203PaymentGroupPaymentGroup']",
            bancoPromerica = "/html[1]/body[1]/div[4]/div[3]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[4]/form[1]/div[1]/div[4]/div[1]/fieldset[1]/div[2]/input[1]",
            bancoCuscatlan = "/html[1]/body[1]/div[4]/div[3]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[4]/form[1]/div[1]/div[4]/div[1]/fieldset[1]/div[2]/input[2]",
            bancoBAC = "/html[1]/body[1]/div[4]/div[3]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[4]/form[1]/div[1]/div[4]/div[1]/fieldset[1]/div[2]/input[3]",
            bancoDavivienda = "/html[1]/body[1]/div[4]/div[3]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[4]/form[1]/div[1]/div[4]/div[1]/fieldset[1]/div[2]/input[4]",
            getMesesInteresesDropdown = "//select[@id='myselectInstallments']",
            forroProducto = "//body/div[2]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/section[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/a[1]";

    String producto2 = "//*[@id='gallery-layout-container']/div/section/a", // *[@id="gallery-layout-container"]/div/section/a
            pagoPorCuotas = "//a[@id='payment-group-SerfinsaPaymentGroup']",
            botonPRO = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[5]/div[2]/button[1]",
            btnBuy = "body.bg-base:nth-child(2) div.render-container.render-route-store-product:nth-child(2) div.render-provider div.vtex-store__template.bg-base div.flex.flex-column.min-vh-100.w-100 div.vtex-product-context-provider div.flex.flex-column.min-vh-100.w-100 div.flex.flex-grow-1.w-100.flex-column div.vtex-flex-layout-0-x-flexRow.vtex-flex-layout-0-x-flexRow--pag-default section.vtex-store-components-3-x-container.ph3.ph5-m.ph2-xl.mw9.center div.flex.mt0.mb0.pt0.pb0.justify-start.vtex-flex-layout-0-x-flexRowContent.vtex-flex-layout-0-x-flexRowContent--pag-default.items-stretch.w-100 div.pr0.items-stretch.vtex-flex-layout-0-x-stretchChildrenWidth.flex div.vtex-flex-layout-0-x-flexCol.vtex-flex-layout-0-x-flexCol--pag-default.ml0.mr0.pl0.pr0.flex.flex-column.h-100.w-100 div.vtex-flex-layout-0-x-flexColChild.vtex-flex-layout-0-x-flexColChild--pag-default.pb0:nth-child(3) div.vtex-flex-layout-0-x-flexRow div.flex.mt4.mb7.pt0.pb7.justify-start.vtex-flex-layout-0-x-flexRowContent.items-stretch.w-100 div.pr0.items-stretch.vtex-flex-layout-0-x-stretchChildrenWidth.flex div.vtex-flex-layout-0-x-flexCol.vtex-flex-layout-0-x-flexCol--pdp-right-col.ml0.mr0.pl0.pr0.flex.flex-column.h-100.w-100 div.vtex-flex-layout-0-x-flexColChild.vtex-flex-layout-0-x-flexColChild--pdp-right-col.pb0:nth-child(8) div.vtex-flex-layout-0-x-flexRow.vtex-flex-layout-0-x-flexRow--navigation-comprar.vtex-flex-layout-0-x-flexRow--pdp-estructuraM div.flex.mt0.mb0.pt0.pb0.justify-start.vtex-flex-layout-0-x-flexRowContent.vtex-flex-layout-0-x-flexRowContent--navigation-comprar.vtex-flex-layout-0-x-flexRowContent--pdp-estructuraM.items-stretch.w-100 div.pr0.items-stretch.vtex-flex-layout-0-x-stretchChildrenWidth.flex div.vtex-flex-layout-0-x-flexRow.vtex-flex-layout-0-x-flexRow--row-two-buttons div.flex.mt4.mb4.pt0.pb0.justify-start.vtex-flex-layout-0-x-flexRowContent.vtex-flex-layout-0-x-flexRowContent--row-two-buttons.items-stretch.w-100 div.pr0.items-stretch.vtex-flex-layout-0-x-stretchChildrenWidth.flex div.vtex-flex-layout-0-x-flexCol.vtex-flex-layout-0-x-flexCol--buy-button-two.vtex-flex-layout-0-x-flexCol--pdp-estructuraM.ml0.mr0.pl0.pr0.flex.flex-column.h-100.w-100 div.vtex-flex-layout-0-x-flexColChild.vtex-flex-layout-0-x-flexColChild--buy-button-two.vtex-flex-layout-0-x-flexColChild--pdp-estructuraM.pb0 > button.vtex-button.bw1.ba.fw5.v-mid.relative.pa0.lh-solid.br2.min-h-regular.t-action.bg-action-primary.b--action-primary.c-on-action-primary.hover-bg-action-primary.hover-b--action-primary.hover-c-on-action-primary.pointer.w-100",
            selectMothWithOut = "//*[@id=\"payment-group-custom203PaymentGroupPaymentGroup\"]",
            mensajeExito = "//h4[contains(text(),'Gracias por la compra')]",
            btnComprarAhora = "/html/body/div[4]/div[3]/div[2]/div[2]/div/div[3]/p/button[3]";

    boolean islogged = false;

    public ProductosPage() {
        super(driver);
    }

    public void navigateToSiman() {
        navigateTo("https://simanqa.myvtex.com/");

        /*
         * try {
         * //login steps
         * write(userInput, "alejandro_aragon@grupoconsiti.com");
         * clickElement(continueButton);
         * try {
         * sleep(30000);
         * clickElement(loginButton);
         * } catch (InterruptedException e) {
         * e.getMessage();
         * }
         * islogged = true;
         * //write(passwordInput, "QAConsiti2022#");
         * }catch (NoSuchElementException e) {
         * System.out.println("The WebElement Search Field couldn't be found");
         * e.printStackTrace();
         * }
         */

    }

    public void iniciarSesion() {
        write(userInput, "alejandro_aragon@grupoconsiti.com");
        clickElement(continueButton);
        try {
            sleep(60000);
            clickElement(loginButton);
        } catch (InterruptedException e) {
            e.getMessage();
        }

    }

    public void clickCategoriesMenu() {
        clickElement(menuDropdown);
    }

    public boolean isMenuVisible() {
        return elementIsDisplayed(menuOptions);
    }

    public void buscarProducto(String producto) {
        try {
            Thread.sleep(3000);
            clickElementByClass(itemBuscar);

            // clickElement("/html/body/div[2]/div/div[1]/div/div[2]/div[2]/div/svg/path[2]");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        writeByClass(itemBuscar, producto);
        // clickElement(iteLupa);

    }

    public void clickProducto() {
        clickElement(forroProducto);
    }

    public void clickProducto2() {
        clickElement(producto2);
    }

    public void clickSimanPro() {

        clickElement(botonPRO);
    }

    public void clickPagoPorCuotas() {
        clickElement(pagoPorCuotas);
    }

    public void seleccionarGarantia(String opcion) {

        scrollDouwnMin();
        scrollDouwnMin();
        scrollDouwnMin();
        scrollDouwnMin();

        clickElement(SPDropdown);

        switch (opcion) {
            case "opcion 1":
                clickElement(SPOpcion1);
                break;
            case "opcion 2":
                clickElement(SPOpcion2);
                break;
            case "opcion 3":
                clickElement(SPOpcion3);
                break;
            case "opcion 4":
                clickElement(SPOpcion4);
                break;
            case "opcion 5":
                clickElement(SPOpcion5);
                break;
            default:

        }

        scrollDouwn();

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public void elijoBanco(String banco) {
        switch (banco) {
            case "Promerica":
                clickElement(bancoPromerica);
                break;

            case "Cuscatlan":
                clickElement(bancoCuscatlan);
                break;

            case "BAC":
                clickElement(bancoBAC);
                break;

            case "Davivienda":
                clickElement(bancoDavivienda);
                break;
        }
    }

    public void clickFinalizarCompra(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElementByID("cart-to-orderform");
    }

    public void procederPagar(){

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

      //  clickElementByID("client-pre-email");
        writeByID("client-pre-email", "alejandro_aragon@grupoconsiti.com");
        clickElementByID("btn-client-pre-email");

        try{
            Thread.sleep(60000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
       // writePersonalInfo();

    }

    public void clickBuyProduct() {
        for(int i = 0; i <= 10 ; i++){
            scrollDouwnMin();
        }

        clickElementByCSS(btnBuy);
    }

    private void writePersonalInfo() {
        String name = "Carlos   ",
                input_name = "client-first-name", // Id
                last_name = "Mecate",
                input_last_name = "client-last-name", // Id
                phone = "12345678",
                input_phone = "client-phone", // ID
                btnGoToTheShipping = "go-to-shipping", // ID
                state = "//*[@id=\"ship-state\"]",
                city = "//*[@id=\"ship-city\"]",
                btnPay = "btn-go-to-payment",
                enterStreet = "ship-street";

        // Set data
        writeByID(input_name, name);
        writeByID(input_last_name, last_name);
        writeByID(input_phone, phone);

        // Redirect to select city and state
        clickElementByID(btnGoToTheShipping);

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        // Select city and state
        selectFromDropdownByText(state, "San Salvador");
        selectFromDropdownByText(city, "San Salvador");
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        selectFromDropdownByText(state, "San Salvador");
        selectFromDropdownByText(city, "San Salvador");
        writeByID(enterStreet, "San Salvador");

        clickElementByClass(btnPay);
    }

    public void clickMeseSinIntereses() {
        clickElement(selectMothWithOut);
    }

    public void elejirMesesIntereses(String opcion) {

        if (opcion == "1") {

            selectFromDropdownByValue(getMesesInteresesDropdown, "3");

        } else {
            selectFromDropdownByValue(getMesesInteresesDropdown, "6");
        }
    }

    public void comprarAhora(){
        clickElement(btnComprarAhora);
        try{
            Thread.sleep(15000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public String compraExitosa() { return getTextFromElement(mensajeExito); }

}