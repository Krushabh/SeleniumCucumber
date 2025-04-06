package stepDefinition;

import io.cucumber.java.en.Given;
import io.qameta.allure.Allure;


import static pages.HomePage.*;


public class HomePage {

    @Given("User navigates to the Online products page")
    public void user_navigates_to_the_online_products_page() {
        Allure.getLifecycle().getCurrentTestCase();
        clickHamburgerMenu();
    }



    @Given("User navigates to the Login page")

    public void user_navigates_to_the_login_page() throws InterruptedException {
        Allure.feature("Given");
        Allure.addAttachment("HTML Snapshot","text/html", driver.getPageSource(), "html");
        clickHamburgerMenu();
        clickSignIn();
    }


}
