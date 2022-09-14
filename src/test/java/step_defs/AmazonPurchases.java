package step_defs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AmazonPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.List;

public class AmazonPurchases extends AmazonPage {

    String firstPrice;
    String totalPrice;
    @When("User goes to Amazon homepage")
    public void user_goes_to_amazon_homepage() {
        Driver.get().get(ConfigurationReader.get("amazon_url"));
        Driver.get().manage().window().maximize();

    }
    @When("User searches for {string}")
    public void user_searches_for(String string) {
        search.sendKeys(ConfigurationReader.get("search"));
        search.sendKeys(Keys.ENTER);

    }
    @When("User adds the first item to Cart with quantity {int}")
    public void user_adds_the_first_item_to_cart_with_quantity(Integer int1) {
        hat.click();
        addToCart.click();
        cart.click();
        firstPrice=hatPrice.getText();
        System.out.println("firstPrice = " + firstPrice);
        quantity.click();
        BrowserUtils.sleep(1);
        Driver.get().findElement(By.linkText(String.valueOf(int1))).click();
        BrowserUtils.sleep(1);
        totalPrice=total.getText();

        System.out.println("totalPrice = " + totalPrice);
    }
    @When("User opens Cart and assert total price and quantity correct")
    public void user_opens_cart_and_assert_total_price_and_quantity_correct() {
        cart.click();
        Assert.assertTrue(itemCheck.getText().contains("2"));


    }
    @When("User reduces the quantity")
    public void user_reduces_the_quantity() {
        quantity.click();
        BrowserUtils.sleep(1);
        Driver.get().findElement(By.linkText("1")).click();
        BrowserUtils.sleep(1);

    }
    @Then("USer asserts the total price and quantity has been correctly changed")
    public void u_ser_asserts_the_total_price_and_quantity_has_been_correctly_changed() {
        Assert.assertTrue(itemCheck.getText().contains("1"));
    }
}
