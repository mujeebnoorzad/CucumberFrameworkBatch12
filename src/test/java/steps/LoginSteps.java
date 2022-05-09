package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import utils.CommonMethods;


public class LoginSteps extends CommonMethods {

    @Then("admin user is successfully logged in")
    public void admin_user_is_successfully_logged_in() {
        Assert.assertTrue(dash.welcomeMessage.isDisplayed());
        // tearDown();
    }

    @When("user enters valid ess username and password")
    public void user_enters_valid_ess_username_and_password() {
        //  LoginPage login = new LoginPage();
        //  WebElement usernamefield = driver.findElement(By.id("txtUsername"));
//        usernamefield.sendKeys(ConfigReader.getPropertyValue("username"));
        sendText(login.usernameBox, "tts12345");
        //WebElement passwordField = driver.findElement(By.name("txtPassword"));
        sendText(login.passwordBox, "Hum@nhrm123");
    }

    @Then("ess user is successfully logged in")
    public void ess_user_is_successfully_logged_in() {
        Assert.assertTrue(dash.welcomeMessage.isDisplayed());
        //leaving it for validation
        //  tearDown();
    }

    @When("user enters invalid username and password")
    public void user_enters_invalid_username_and_password() {
        //  LoginPage login = new LoginPage();
        //    WebElement usernamefield = driver.findElement(By.id("txtUsername"));
//        usernamefield.sendKeys(ConfigReader.getPropertyValue("username"));
        sendText(login.usernameBox, "tts12345");
        //  WebElement passwordField = driver.findElement(By.name("txtPassword"));
        sendText(login.passwordBox, "Hum@nhrm");
    }

    @Then("user see error message on the screen")
    public void user_see_error_message_on_the_screen() {
        //homework - verify error message for this
        //   tearDown();
    }
    @When("user enters valid username")
    public void user_enters_valid_username() {
        sendText(login.usernameBox, "Admin");
    }

    @When("user enters invalid password")
    public void user_enters_invalid_password() {
     sendText(login.passwordBox, "784512");
    }
    @Then("user see Invalid message")
    public void user_see_invalid_message() {Assert.assertTrue(login.invalidMessage.isDisplayed());

    }
    @When("user leave username empty")
    public void user_leave_username_empty() {sendText(login.usernameBox,"");
    }

    @When("user enters valid password")
    public void user_enters_valid_password() {sendText(login.passwordBox, "Hum@nhrm123");
    }
    @Then("user see username cannot be empty error message displayed")
    public void user_see_username_cannot_be_empty_error_message_displayed() {Assert.assertTrue(login.userNameCannotBeEmpty.isDisplayed());
    }

    @When("user enters valid ess username")
    public void user_enters_valid_ess_username() {sendText(login.usernameBox, "Admin");
    }

    @When("user enters leave password empty")
    public void user_enters_leave_password_empty() {sendText(login.passwordBox, "");
    }
    @Then("user see password cannot by empty error message")
    public void user_see_password_cannot_by_empty_error_message() {Assert.assertTrue(login.passwordCannotBeEmpty.isDisplayed());
    }

}
