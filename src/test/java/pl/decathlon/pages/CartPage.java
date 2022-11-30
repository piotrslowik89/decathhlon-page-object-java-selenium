package pl.decathlon.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    private static final Logger logger = LogManager.getLogger();


    @FindBy(css = ".cart-button")
    private WebElement goToCart;

    @FindBy(css = ".cta")
    private WebElement delivery;



    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void goToCart() {
        goToCart.click();


    }
    public void goToDelivery() {
        delivery.click();
}}
