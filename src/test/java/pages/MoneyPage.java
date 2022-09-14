package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public abstract class MoneyPage {

    public MoneyPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//div[@class=\"login_links\"]//a[2]")
    public WebElement join;

    @FindBy(xpath = "//select[@name=\"map(title)\"]")
    public WebElement title;

    @FindBy(xpath = "//input[@name=\"map(firstName)\"]")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name=\"map(lastName)\"]")
    public WebElement lastName;

    @FindBy(xpath = "//*[@class=\"required checkbox terms\"]")
    public WebElement checkBox;

    @FindBy(xpath = "//input[@value=\"Join Now!\"]")
    public WebElement joinNow;

    @FindBy(css = "label[for=\"dob\"]")
    public WebElement errorMessage;



}
