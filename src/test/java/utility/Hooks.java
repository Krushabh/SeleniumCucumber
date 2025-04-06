package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import static utility.DriverFactory.*;

public class Hooks {

    private static final Logger logger = Logger.getLogger(Hooks.class.getName());

    @Before
    public void setup(Scenario scenario) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        setDriver(driver);
        getDriver().manage().window().maximize();
        logger.info("Browser launched and maximized for scenario: " + scenario.getName());
    }

    @After
    public void teardown(Scenario scenario) {
        try {
            if (getDriver() != null) {
                // Capture screenshot
                TakesScreenshot ts = (TakesScreenshot) getDriver();
                byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);

                String status = scenario.isFailed() ? "Failed" : "Passed";
                scenario.attach(screenshot, "image/png", "Screenshot - " + status + " - " + scenario.getName());
                System.out.println("Screenshot attached to Allure for scenario: " + scenario.getName());

                // Save screenshot locally
                String baseName = scenario.getName().replaceAll("[^a-zA-Z0-9]", "_");
                if (baseName.length() > 50) baseName = baseName.substring(0, 50);

                String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
                String fileName = "screenshots/" + baseName + "_" + status + "_" + timestamp + ".png";

                File screenshotFile = new File(fileName);
                screenshotFile.getParentFile().mkdirs();
                Files.write(Paths.get(fileName), screenshot);

                logger.info("Screenshot saved: " + fileName);

                // Allure attachment (optional)
                io.qameta.allure.Allure.addAttachment("Final Screenshot", new ByteArrayInputStream(screenshot));
            }
        } catch (IOException | WebDriverException e) {
            logger.severe("Screenshot capture failed: " + e.getMessage());
        } finally {
            quitDriver();
            logger.info("WebDriver closed after scenario: " + scenario.getName());
        }
    }
}
