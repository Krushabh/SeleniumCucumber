package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import static utility.DriverFactory.getDriver;

public class HomePage {
    public static String hamburger_menu="//input[@type='checkbox']";
    public static String SignIn="//li[normalize-space()='Sign In Portal']";
    public static String onlineProductsPage_link_LinkText = "Online Products";
    private static final Logger logger = LogManager.getLogger(HomePage.class);

    public static  void clickHamburgerMenu(){

        logger.info("Navigating to home page and clicking hamburger menu...");
        getDriver().get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        getDriver().findElement(By.xpath(hamburger_menu)).click();
    }
    public static  void clickSignIn() throws InterruptedException {
        logger.info("Clciking  SignIn...");
        Thread.sleep(2000);
        getDriver().findElement(By.xpath(SignIn)).click();

    }
    public static void click_OnlineProducts_link() throws InterruptedException {
        logger.info("Clicking Online Products Page...");
        Thread.sleep(2000);
        getDriver().findElement(By.linkText(onlineProductsPage_link_LinkText)).click();
    }

}
