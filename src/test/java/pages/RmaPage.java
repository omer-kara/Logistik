package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReuseableMethods;

public class RmaPage extends BasePage{

    @FindBy(xpath = "(//span[@class='me-3'])[3]")
    public WebElement rmaIkon;

    @FindBy(id="neue")
    public WebElement rmaNeuRadioButton;

    @FindBy(id="ignorieren")
    public WebElement rmaInternRadioButton;

    @FindBy(id="gesendet")
    public WebElement rmaGesendetRadioButton;

    @FindBy(xpath="//*[@name='dbdatum']")
    public WebElement rmaDatumBox1;

    @FindBy(id="rmadatum")
    public WebElement rmaDatumBox2;

    @FindBy(id="rmauhrzeit")
    public WebElement rmaUhrzeit;

    @FindBy(id="fahrer")
    public WebElement rmaFahrerDD;

    @FindBy(id="tourId")
    public WebElement rmaTourDD;

    @FindBy(id="kundennummer")
    public WebElement rmaKundenNummer;

    @FindBy(id="rmakundenname")
    public WebElement rmaKundenName;

    @FindBy(id="rmakundenstr")
    public WebElement rmaKundenStr;

    @FindBy(id="rmaauswahl")
    public WebElement rmaAuswahl;

    @FindBy(id="rmanotiz")
    public WebElement rmaNotiz;

    @FindBy(id="rmanotiz2")
    public WebElement rmaNotiz2;

    @FindBy(xpath = "//*[text()='Abschließen']")
    public WebElement rmaAbschließenButton;

    @FindBy(xpath = "//*[text()='ZwischernSpeichern']")
    public WebElement rmaZwischernSpeichernBtn;

    @FindBy(xpath = "//*[text()='Laden']")
    public WebElement rmaLadenButton;







}
