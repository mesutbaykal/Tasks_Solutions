package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public abstract class AmazonPage {

    public AmazonPage() {
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement search;

    @FindBy(xpath = "//img[@class=\"s-image\"]")
    public WebElement hat;

    @FindBy(id = "a-autoid-0-announce")
    public WebElement quantity;

    @FindBy(linkText = "2")
    public WebElement selectQuantity;

    @FindBy(css = "#add-to-cart-button")
    public WebElement addToCart;

    @FindBy(id = "nav-cart-count-container")
    public WebElement cart;

    @FindBy(xpath = "//p[@class=\"a-spacing-mini\"]/span")
    public WebElement hatPrice;

    @FindBy(css = "#sc-subtotal-amount-activecart>span")
    public WebElement total;

    @FindBy(css = ".a-popover-inner")
    public WebElement selectQuantity2;

    @FindBy(id="sc-subtotal-label-activecart")
    public WebElement itemCheck;






}
