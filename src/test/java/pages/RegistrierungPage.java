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


}
