package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static utility.DriverFactory.getDriver;

public class LoggedInPage {
    private static final Logger logger = LogManager.getLogger(LoggedInPage.class);

    public static String productcateogry_formalshoes = "//*[text()='Formal Shoes']";

    public static String productcateogry_sportsshoes = "//*[text()='Sports']";

    public static String productcateogry_sneakers = "//*[text()='Sneakers']";

    public static void visibility_productcategory_formalshoes() throws InterruptedException {
        logger.info("Navigating to Products Page  and check Formal Shoes");
        String actualproductcategory_fs = getDriver().findElement(By.xpath(productcateogry_formalshoes)).getText();
        assertEquals("Formal Shoes",actualproductcategory_fs);
    }

    public static void visibility_productcategory_sportsshoes() throws InterruptedException {
        logger.info("Navigating to Products Page  and check Sports Shoes");
        String actualproductcategory_ss = getDriver().findElement(By.xpath(productcateogry_sportsshoes)).getText();
        assertEquals("Sports",actualproductcategory_ss);
    }

    public static void visibility_productcategory_sneakershoes() throws InterruptedException {
        logger.info("Navigating to Products Page  and check Sneaker Shoes");
        String actualproductcategory_s = getDriver().findElement(By.xpath(productcateogry_sneakers)).getText();
        assertEquals("Sneakers",actualproductcategory_s);
    }
}
