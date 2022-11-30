package pl.decathlon.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(id = "didomi-notice-agree-button")
    private WebElement acceptAll;

    @FindBy(css = ".menu-button")
    private WebElement menuButton;

    @FindBy(css = ".close")
    private WebElement closeButton;


    @FindBy(css = "button.svelte-13mgb6t:nth-child(1)")
    private WebElement navbarElement1;


    @FindBy(css = "button.svelte-13mgb6t:nth-child(2)")
    private WebElement navbarElement2;


    @FindBy(css = "button.svelte-13mgb6t:nth-child(3)")
    private WebElement navbarElement3;

    @FindBy(css = "button.svelte-13mgb6t:nth-child(4)")
    private WebElement navbarElement4;

    @FindBy(css = "button.svelte-13mgb6t:nth-child(5)")
    private WebElement navbarElement5;

    @FindBy(css = "button.svelte-13mgb6t:nth-child(6)")
    private WebElement navbarElement6;

    @FindBy(css = "button.svelte-13mgb6t:nth-child(7)")
    private WebElement navbarElement7;

    @FindBy(css = "button.svelte-13mgb6t:nth-child(8)")
    private WebElement navbarElement8;


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    private static final Logger logger = LogManager.getLogger();


    public void acceptAll() {
        acceptAll.click();
    }

    public void openLeftMenu() {
        menuButton.click();
    }

    public void closeLeftMenu() {
        closeButton.click();
    }

    public void navBar(Actions actions) {
        actions.moveToElement(navbarElement1).perform();
        actions.moveToElement(navbarElement2).perform();
        actions.moveToElement(navbarElement3).perform();
        actions.moveToElement(navbarElement4).perform();
        actions.moveToElement(navbarElement5).perform();
        actions.moveToElement(navbarElement6).perform();
        actions.moveToElement(navbarElement7).perform();
        actions.moveToElement(navbarElement8).perform();


    }
}
