package step_defs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MoneyPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MoneyGaming extends MoneyPage {

    @When("User goes to Moneygaming home page")
    public void user_goes_to_moneygaming_home_page() {
        Driver.get().get(ConfigurationReader.get("money_url"));
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @When("User clicks on Join Now button")
    public void user_clicks_on_join_now_button() {
        join.click();

    }
    @When("User selects a title value from dropdown")
    public void user_selects_a_title_value_from_dropdown() {
        Select select=new Select(title);
        select.selectByValue("Mr");

    }
    @When("User enters first_name and last_name")
    public void user_enters_first_name_and_last_name() {
        firstName.sendKeys(ConfigurationReader.get("first_name"));
        lastName.sendKeys(ConfigurationReader.get("last_name"));

    }
    @When("User clicks on confirm button")
    public void user_clicks_on_confirm_button() {
        checkBox.click();
        joinNow.click();
        BrowserUtils.sleep(5);


    }
    @Then("User checks the validation message {string}")
    public void user_checks_the_validation_message(String string) {

        WebDriverWait wait=new WebDriverWait(Driver.get(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(errorMessage));
        Assert.assertEquals("NOT matching",string,errorMessage.getText());

    }
}
