package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions action;

    static {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void scrollDouwn(){
        //JavascriptExecutor js = (JavascriptExecutor)driver;
        //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        //js.executeScript("arguments[0].scrollIntoView();", Element);

        find("/html/body").sendKeys(Keys.SPACE);


    }



    public static void navigateTo(String url){
        driver.get(url);
    }

    public void goToLinkText(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public static void cleanBrowser() {
        driver.quit();
    }


    private WebElement find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator){
        find(locator).click();
    }

    private WebElement findByID(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
    }

    public void clickElementByID(String locator){
        findByID(locator).click();
    }

    public void writeByID(String locator, String text) {
        findByID(locator).clear();
        findByID(locator).sendKeys(text);
    }

    public void writeByClass(String locator, String text) {
        findByClass(locator).clear();
        findByClass(locator).sendKeys(text);
        findByClass(locator).sendKeys(Keys.ENTER);

    }

    private WebElement findByClass(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locator)));
    }

    public void clickElementByClass(String locator){
        findByClass(locator).click();
    }

    public void write(String locator, String textToWrite){
        find(locator).clear();
        find(locator).sendKeys(textToWrite);
    }

    public void selectFromDropdownByValue(String locator, String valueToSelect){
        Select dropdown = new Select(find(locator));
        dropdown.selectByValue(valueToSelect);
    }

    public void selectFromDropdownByIndex(String locator, int indexToSelect){
        Select dropdown = new Select(find(locator));
        dropdown.selectByIndex(indexToSelect);
    }

    public void selectFromDropdownByText(String locator, String text){
        Select dropdown = new Select(find(locator));
        dropdown.selectByVisibleText(text);
    }

    public void hoverOverElement(String locator){
        action.moveToElement(find(locator));
    }

    public void doubleClickElement(String locator){
        action.doubleClick(find(locator));
    }

    public void rightClickElement(String locator){
        action.contextClick(find(locator));
    }

    public String getValueFromTable(String locator, int row, int column){
        String cellINeed = locator+"/table/tbody/tr["+row+"]/td["+column+"]";
        return find(cellINeed).getText();
    }

    public void setValueOnTable(String locator, int row, int column, String stringToSend){
        ////table[@id='table1']
        String cellToFill = locator+"/table/tbody/tr["+row+"]/td["+column+"]";
        find(cellToFill).sendKeys(stringToSend);
    }

    public void switchToiFrame(int iFrameIndex){

        //Para no tener problemas con el id o el name de donde está situado el fram
        //Se utiliza el index de posición del frame
        driver.switchTo().frame(iFrameIndex);
    }

    public void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }

    public void dismissAlert(){
        //Hay otras funciones para alert
        try{
            driver.switchTo().alert().dismiss();
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
        }

    }

    public String getTextFromElement(String locator){
        return find(locator).getText();
    }

    public boolean elementIsDisplayed(String locator){
        return find(locator).isDisplayed();
    }

    public boolean elementIsEnabled(String locator){
        return find(locator).isEnabled();
    }

    public boolean elementIsSelected(String locator){
        return find(locator).isSelected();
    }

    public List<WebElement> getAllElementsFromList(String locator){
        return driver.findElements(By.className(locator));
    }

    public void selectNthElement(String locator, int index){
        List<WebElement> results = driver.findElements(By.xpath(locator));
        results.get(index).click();
    }

    public void maxWindow() { driver.manage().window().maximize(); }

    public void darClick(String searchButton){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", findByClass(searchButton));
    }
}
