package org.melek.selenium.test.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.SneakyThrows;
import org.melek.selenium.test.ChromeDriver;
import org.melek.selenium.test.pages.DownloadPage;


public class LoginPageStepDefinitions {

    DownloadPage downloadPage = new DownloadPage(ChromeDriver.getDriver());

    @SneakyThrows
    @When("search {string} on searh box")
    public void search_on_searh_box(String key) {
      downloadPage.searchDownloads(key);
      Thread.sleep(500000);
    }

    @Then("delete search")
    public void delete_search() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("get text as {string}")
    public void get_text_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}


