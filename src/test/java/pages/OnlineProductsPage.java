package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

import static utility.DriverFactory.getDriver;

public class OnlineProductsPage {
    private static final Logger logger = LoggerFactory.getLogger(OnlineProductsPage.class);

    public static String formalshoes_dropdown_xpath = "//i[@class='fa fa-angle-double-down formalshoedropdown']";
    public static String formalshoes_webtable_tr = "/html/body/div[2]/table/tbody/tr[1]/td[1]";

    public static void click_formalshoesdropdpown() {
        try {
            logger.info("Waiting for Formal Shoes dropdown to be present and clickable");
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

            // Ensure the element is present
            WebElement dropdown = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(formalshoes_dropdown_xpath)));

            // Scroll to the element to make sure it's visible
            ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", dropdown);

            // Wait until it is clickable
            wait.until(ExpectedConditions.elementToBeClickable(dropdown));

            // Try clicking with JavaScript
            ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", dropdown);

            logger.info("Clicked Formal Shoes dropdown successfully using JavaScript click");

        } catch (Exception e) {
            logger.error("Failed to click on Formal Shoes dropdown", e);
            throw e;
        }
    }

    public static String getText_formalshoes_firstvalue() {
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
            WebElement cell = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(formalshoes_webtable_tr)));
            String text = cell.getText();
            logger.info("Fetched text from first row: {}", text);
            return text;
        } catch (Exception e) {
            logger.error("Failed to get text from the formal shoes table row", e);
            throw e;
        }
    }
}
