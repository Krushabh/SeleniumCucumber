package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver {
    public static String hamburger_menu="//input[@type='checkbox']";
    public static String SignIn="//li[normalize-space()='Sign In Portal']";
    public static String onlineProductsPage_link_LinkText = "Online Products";

    public static  void clickHamburgerMenu(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        driver.findElement(By.xpath(hamburger_menu)).click();
    }
    public static  void clickSignIn() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(SignIn)).click();

    }
    public static void click_OnlineProducts_link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.linkText(onlineProductsPage_link_LinkText)).click();
    }

}
