package pl.decathlon.tests;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pl.decathlon.pages.CartPage;
import pl.decathlon.pages.HomePage;
import pl.decathlon.pages.ShoppingPage;
import pl.decathlon.utils.SeleniumHelper;


import java.io.IOException;

public class HomePageTest extends BaseTest {
    @Test
    public void HomePageTest() throws IOException {
        ExtentTest test = extentReports.createTest("Home Page Test");
        HomePage HomePage = new HomePage(driver);
        HomePage.acceptAll();
        HomePage.openLeftMenu();
        HomePage.closeLeftMenu();

        Actions actions = new Actions(driver);
        HomePage.navBar(actions);
    }

    @Test
    public void ShoppingPageTest() throws IOException {
        ExtentTest test = extentReports.createTest("Shopping Page Test");
        ShoppingPage shoppingPage = new ShoppingPage(driver);
        shoppingPage.acceptAll();

        Actions actions = new Actions(driver);

        shoppingPage.womanShopping(actions);
        shoppingPage.manShopping(actions);

        CartPage cartPage = new CartPage(driver);
        cartPage.goToCart();
        cartPage.goToDelivery();

//        shoppingPage.childShopping(driver,actions);

//        pisanie logów
//        test.log(Status.PASS, "Setting value done", SeleniumHelper.getScreenshot(driver));


    }


}