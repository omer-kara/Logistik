package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrierungPage {
    public RegistrierungPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "(//*[@class='link-secondary text-decoration-none'])[1]")
    public WebElement registrierungButton;

    @FindBy (id="name")
    public WebElement benutzerName;

    @FindBy (id="telefonnummer")
    public WebElement telefonnummer;

    @FindBy (id="registerEmail")
    public  WebElement registrierungEmail;

    @FindBy (id="password")
    public WebElement registrierungPassword;

    @FindBy (id="acceptAgb")
    public WebElement registrierungAgb;

    @FindBy (id="acceptDatenschutz")
    public WebElement datenschutzBox;

    @FindBy (xpath = "//*[@class='btn btn-primary btn-lg']")
    public WebElement sendenButton;

    @FindBy(xpath = "//span[@id='email']")
    public WebElement fakemailadresi;
    @FindBy(xpath = "(//div/button/p)[1]")
    public WebElement fakeemailcookies;

    @FindBy (xpath = "//iframe[@id='c24-uli-iframe'] ")
    public WebElement iframe_emailbox;

    @FindBy (xpath = "(//*[@type='email'])[1]")
    public WebElement email_box;

    @FindBy (id="password")
    public WebElement password_box;

    @FindBy (xpath = "//*[text()='ANMELDEN']")
    public WebElement anmeldenButton;



}
