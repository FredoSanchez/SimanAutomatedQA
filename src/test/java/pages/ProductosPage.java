package pages;

import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

public class ProductosPage extends BasePage{

    //String menuDropdownClass = "vtex-menu-2-x-menuItem";
    String menuDropdown = "//div[contains(text(), 'Categorías')]",
            userInput = "//input[@id='email']",
            continueButton = "//body/div[@id='render-admin.login-legacy.home']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]",
            passwordInput = "//body/div[@id='render-admin.login-legacy.home']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/label[1]/div[1]",
            loginButton = "//button[@id='chooseprovider_signinbtn']",
            menuOptions = "/html/body/div[2]/div/div[1]/div/div[3]/div/div[1]/div/div/div/div/div[2]/div/div/li/div[2]/div/section/nav";

    public ProductosPage() {
        super(driver);
    }

    public void navigateToSiman() {
        navigateTo("https://simanqa.myvtex.com/");


        //login steps
        write(userInput, "freddy_sanchez@grupoconsiti.com");
        clickElement(continueButton);
        try {
            sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //write(passwordInput, "QAConsiti2022#");
        //clickElement(loginButton);


    }

    public void clickCategoriesMenu() {
        clickElement(menuDropdown);
    }

    public boolean isMenuVisible() {
        return elementIsDisplayed(menuOptions);
    }

}
