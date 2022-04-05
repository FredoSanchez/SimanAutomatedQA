package pages;

import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

    public class ProductosPage extends BasePage{

        //String menuDropdownClass = "vtex-menu-2-x-menuItem";
        String menuDropdown = "//body/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/li[1]/div[1]/span[1]/div[1]",
                userInput = "//input[@id='email']",
                continueButton = "//body/div[@id='render-admin.login-legacy.home']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]",
                passwordInput = "//body/div[@id='render-admin.login-legacy.home']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/label[1]/div[1]/input[1]",
                loginButton = "//body/div[@id='render-admin.login-legacy.home']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/button[1]",
                menuOptions = "/html/body/div[2]/div/div[1]/div/div[3]/div/div[1]/div/div/div/div/div[2]/div/div/li/div[2]/div/section/nav",
                itemBuscar ="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]/input[1]",
                iteLupa ="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]/span[1]/div[1]/button[1]",
                seleccionarProducto = "//body/div[2]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/section[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/a[1]",
                SPDropdown = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[5]/div[3]/div[2]/div[2]/div[1]/div[1]",
                SPOpcion1 ="//li[contains(text(),'1año - $200')]",
                SPOpcion2 = "//li[contains(text(),'2años - $225')]",
                SPOpcion3 = "//li[contains(text(),'3años - $250')]",
                SPOpcion4 = "//li[contains(text(),'4 años - $275')]",
                SPOpcion5 = "//li[contains(text(),'Violeta6Meses - $2.02')]",
                forroProducto = "//body/div[2]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/section[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/a[1]";






        boolean islogged = false;

        public ProductosPage() {
            super(driver);
        }

        public void navigateToSiman() {
            navigateTo("https://simanqa.myvtex.com/");

            if(!islogged){
                //login steps
                write(userInput, "alejandro_aragon@grupoconsiti.com");
                clickElement(continueButton);
                try {
                    sleep(30000);
                    clickElement(loginButton);
                } catch (InterruptedException e) {
                    e.getMessage();
                }
                    islogged = true;
                //write(passwordInput, "QAConsiti2022#");
            }



        }

        public void clickCategoriesMenu() {
            clickElement(menuDropdown);
        }

        public boolean isMenuVisible() {
            return elementIsDisplayed(menuOptions);
        }

        public void buscarProducto(){
            clickElement(itemBuscar);
            write(itemBuscar, "464544100006");
            clickElement(iteLupa);

        }

        public void clickProducto(){
            clickElement(forroProducto);
        }

    }

