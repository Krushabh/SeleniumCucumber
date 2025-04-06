package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import static utility.DriverFactory.getDriver;
public class LoginPage  {
    private static final Logger logger = LogManager.getLogger(LoginPage.class);

    public static String username_text_id = "usr";
    public static String password_text_id = "pwd";
    public static String login_btn_xpath ="//*[@id=\"second_form\"]/input";
    public static String newregister_btn_id ="NewRegistration";


    public static void sendkeys_username() throws InterruptedException {

        logger.info("Navigating to Login Page and Enter Username");
        getDriver().findElement(By.id(username_text_id)).sendKeys("Scott.gale@gmail.com");
    }

    public static void sendkeys_password() throws InterruptedException {
        logger.info("Navigating to Login Page and Enter Password");
        getDriver().findElement(By.id(password_text_id)).sendKeys("P@sword!");
    }

    public static void click_login_btn()
    {
        logger.info("Navigating to Login Page and click Login Button");

        getDriver().findElement(By.xpath(login_btn_xpath)).click();
    }

    public static void click_NewRegister_btn()
    {
        logger.info("Navigating to Login Page and Click Register Button");

        getDriver().findElement(By.id(newregister_btn_id)).click();
    }


}
