package pl.decathlon.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class ShoppingPage {

    private static final Logger logger = LogManager.getLogger();

    @FindBy(id = "didomi-notice-agree-button")
    private WebElement acceptAll;


    @FindBy(css = "button.svelte-13mgb6t:nth-child(2)")
    private WebElement navbarElement2;

    @FindBy(linkText = "Spódniczki damskie")
    private WebElement spodniczkiDamskie;

    @FindBy(tagName = "body")
    private WebElement body;

    @FindBy(xpath = "/html/body/div[2]/main/div[2]/div/section/nav[2]/button[3]")
    private WebElement secondPage;

    @FindBy(css = "div.dpb-holder:nth-child(26) > div:nth-child(4) > a:nth-child(1)")
    private WebElement choiceOfSkirt;

    @FindBy(css = "button.sizes__size:nth-child(4)")
    private WebElement choiceOfSize;

    @FindBy(css = "#fitAnalytics-pdp-add-to-cart")
    private WebElement addToCart;

    @FindBy(css = ".cta--alt")
    private WebElement backToShopping;

    @FindBy(css = "button.svelte-13mgb6t:nth-child(3)")
    private WebElement navbarElement3;

    @FindBy(linkText = "Kamizelki męskie")
    private WebElement kamizelkiMeskie;

    @FindBy(css = "div.dpb-holder:nth-child(12) > div:nth-child(4) > a:nth-child(1)")
    private WebElement choseOfVest;


    @FindBy(css = "button.svelte-13mgb6t:nth-child(4)")
    private WebElement navbarElement4;


    @FindBy(linkText = "Deskorolki")
    private WebElement skateboards;

    @FindBy(css = "div.dpb-holder:nth-child(6) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")
    private WebElement choseOfSkateboard;

    @FindBy(css = "button.svelte-10vhdb8:nth-child(2))")
    private WebElement choseOfColorWhite;


//        self.driver.find_element(By.CSS_SELECTOR, 'button.sizes__size:nth-child(5)').click()
//        self.driver.find_element(By.ID, 'fitAnalytics-pdp-add-to-cart').click()
//        self.driver.find_element(By.CSS_SELECTOR,
//            'body > aside > div > div > div.cta-section.svelte-1bm63xk > button').click()

    public ShoppingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void acceptAll() {
        acceptAll.click();
    }

    public void womanShopping(Actions actions) {
        actions.moveToElement(navbarElement2).perform();
        spodniczkiDamskie.click();
//        body.sendKeys(Keys.SPACE);
//        body.sendKeys(Keys.SPACE);
//        body.sendKeys(Keys.SPACE);
//        body.sendKeys(Keys.SPACE);
//        body.sendKeys(Keys.SPACE);
//        body.sendKeys(Keys.SPACE);
//        secondPage.click();
        choiceOfSkirt.click();
        choiceOfSize.click();
        addToCart.click();
        backToShopping.click();
    }

    public void manShopping(Actions actions) {
        actions.moveToElement(navbarElement3).perform();
        kamizelkiMeskie.click();
        choseOfVest.click();
        choiceOfSize.click();
        addToCart.click();
        backToShopping.click();
    }

    public void childShopping(WebDriver driver, Actions actions) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        actions.moveToElement(navbarElement4).perform();
        skateboards.click();

        secondPage.click();
        choseOfSkateboard.click();
        addToCart.click();
        backToShopping.click();

    }
}