package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AsimPage {

    public AsimPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[@href='#appointment'][1]")
    public WebElement makeAnAppointment;

    @FindBy (xpath = "//input[@id='firstName']")
    public WebElement firstNameEmpty;

    @FindBy (xpath = "//input[@value='adem']")
    public WebElement firstNameFull;

    @FindBy (xpath = "//div[text()='Your FirstName is required.']")
    public WebElement firstNameWarning;

    @FindBy (xpath = "//input[@id='lastName']")
    public WebElement lastNameEmpty;

    @FindBy (xpath = "//input[@value='Bakırcı']")
    public WebElement lastNameFull;

    @FindBy (xpath = "//div[text()='Your LastName is required.']")
    public WebElement lastNameWarning;


}
