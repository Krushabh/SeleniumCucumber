package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static utility.DriverFactory.getDriver;

public class RegistrationPage  {
    private static final Logger logger = LogManager.getLogger(RegistrationPage.class);

    public static String userregistration_xpath = "/html/body/center/h1";

    public static void visibility_user_registration_page() throws InterruptedException {
        logger.info("Navigating to Registraion Page ");
        String actualproductcategory_fs = getDriver().findElement(By.xpath(userregistration_xpath)).getText();
        assertEquals("User Registration Page",actualproductcategory_fs);
    }
}
