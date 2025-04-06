package stepDefinition;

import io.cucumber.java.en.Then;
import static pages.LoginPage.*;
import static pages.RegistrationPage.*;

public class RegistrationPage {

    @Then("User should be able to view the Registration page")
    public void userShouldBeAbleToViewTheRegistrationPage() throws InterruptedException {
    visibility_user_registration_page();
    }
}
