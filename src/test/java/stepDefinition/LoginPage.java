package stepDefinition;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.BrowserDriver;
import static pages.LoginPage.*;


public class LoginPage extends BrowserDriver {

    @When("User successfully enters the log in details")
    public void user_successfully_enters_the_log_in_details() throws InterruptedException {
    sendkeys_username();
    sendkeys_password();
    click_login_btn();
    }
    @When("User clicks on new Registration button")
    public void userClicksOnNewRegistrationButton() {

        click_NewRegister_btn();
    }



}
