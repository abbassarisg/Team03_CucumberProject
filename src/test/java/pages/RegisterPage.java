package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {

    public RegisterPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


     @FindBy (xpath = "//*[@id='account-menu']")
     public WebElement girisikon;

    @FindBy (xpath="//a[@href='/account/register']")
    public WebElement registergirisikon;

    @FindBy(id="ssn")
    public WebElement ssn;

    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement registerbuton;

    @FindBy (xpath = "//*[@id='firstName']")
    public WebElement firstname;

    @FindBy(xpath = "//div[contains(text(),'Registration Saved')]")
    public WebElement basarilikayit;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement invalidSSN;

    @FindBy(xpath = "//div[text()='Your FirstName is required.']")
    public WebElement firstnamereqired;

    @FindBy(xpath = "//div[text()='Your LastName is required.']")
    public WebElement lastnamereqired;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//*[text()='Your username is invalid.']")
    public WebElement usernameinvalidyazisi;

}
