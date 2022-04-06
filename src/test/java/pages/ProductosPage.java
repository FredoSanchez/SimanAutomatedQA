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
            bancoPromerica = "//input[@id='bank1']",
            bancoCuscatlan = "//input[@id='bank2']",
            bancoBAC = "//input[@id='bank3']",
            bancoDavivienda = "//input[@id='bank4']",
            getMesesInteresesDropdown = "//select[@id='myselectInstallments']",
            forroProducto = "//body/div[2]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/section[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/a[1]";

    String producto2 = "//*[@id='gallery-layout-container']/div/section/a", // *[@id="gallery-layout-container"]/div/section/a
            pagoPorCuotas = "//*[@id='payment-group-SerfinsaPaymentGroup']", // *[@id="payment-group-SerfinsaPaymentGroup"]
            botonPRO = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[5]/div[2]/button[1]",
            btnBuy = "vtex-button",
            selectMothWithOut = "//*[@id=\"payment-group-custom203PaymentGroupPaymentGroup\"]";

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
            sleep(30000);
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
    }

    public void elijoBanco(String banco) {
        switch (banco) {
            case "Promerica":
                clickElementByClass(bancoPromerica);
                break;

            case "Cuscatlan":
                clickElementByClass(bancoCuscatlan);
                break;

            case "BAC":
                clickElement(bancoBAC);
                break;

            case "Davivienda":
                clickElement(bancoDavivienda);
                break;
        }
    }

    public void clickBuyProduct() {
        clickElementByClass(btnBuy);
        clickElementByID("cart-to-orderform");

        writePersonalInfo();
    }

    private void writePersonalInfo() {
        String name = "Carlos   ",
                input_name = "client-first-name", // Id
                last_name = "Peñate",
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

        // Select city and state
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

}