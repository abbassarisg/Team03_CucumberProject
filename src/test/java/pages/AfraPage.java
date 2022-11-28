package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AfraPage {
    public AfraPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@data-prefix='fas']")
    public WebElement kisiIconu;

    @FindBy (xpath = "//*[.='Sign in']")
    public WebElement kayitOl;

    @FindBy (xpath = "//*[@name='username']")
    public WebElement userName;

    @FindBy (xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy (xpath = "(//span[.='Sign in'])[3]")
    public WebElement signInButton;

    @FindBy (xpath = "//span[.='MY PAGES']")
    public WebElement myPagesButtonu;

    @FindBy (xpath = "//span[.='My Appointments']")
    public WebElement myAppointmentsButtonu;

    @FindBy (xpath = "//span[text()='from']")
    public WebElement from;

    @FindBy (xpath = "//span[text()='to']")
    public WebElement to;

    //@FindBy (xpath = "//th//span")
   // public List<WebElement> randevuBilgileri;

    @FindBy (id = "fromDate")
    public WebElement dateBoxFrom;

    @FindBy (id = "toDate")
    public WebElement dateBoxTo;

   @FindBy (xpath= "//th[1]//span")
   public WebElement idYazisi;

    @FindBy (xpath= "//th[2]//span")
    public WebElement startDate;

    @FindBy (xpath= "//th[3]//span")
    public WebElement endDate;

    @FindBy (xpath= "//th[4]//span")
    public WebElement status;

    @FindBy (xpath= "//thead")
    public WebElement head;

    @FindBy (xpath= "//span[text()='No Appointments found']")
    public WebElement noappointment;

    @FindBy (className= "Toastify__toast-body")
    public WebElement maxOnBes;



}
