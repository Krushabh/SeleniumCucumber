package stepDefinition;

import io.cucumber.java.en.Given;
import io.qameta.allure.Allure;


import static pages.HomePage.*;
import static utility.DriverFactory.getDriver;


public class HomePage {

    @Given("User navigates to the Online products page")
    public void user_navigates_to_the_online_products_page() throws InterruptedException {
        Allure.getLifecycle().getCurrentTestCase();
        clickHamburgerMenu();
        click_OnlineProducts_link();
    }



    @Given("User navigates to the Login page")

    public void user_navigates_to_the_login_page() throws InterruptedException {
        Allure.feature("Given");
        Allure.addAttachment("HTML Snapshot","text/html", getDriver().getPageSource(), "html");
        clickHamburgerMenu();
        clickSignIn();
    }


}
