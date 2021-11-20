package qa.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import qa.ChromeDriver;
import qa.Hook;
import qa.pages.LoginPage;


public class LoginPageStepDefinitions {

    LoginPage loginPage = new LoginPage(ChromeDriver.getDriver());

    @Given("User is at the login page")
    public void user_is_at_the_login_page() {
        loginPage.goToHomePage()
                .closeFirstPopup();
    }

    @When("User enters username as {string} and password as {string}")
    public void user_enters_username_as_and_password_as(String string, String string2) {
        loginPage.waitOnLoginIcon()
                .loginSuccessfully();
    }



}


