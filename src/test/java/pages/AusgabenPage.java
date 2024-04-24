package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AusgabenPage extends BasePage {

    @FindBy(id = "IdAdminMenuTogglling")
    public WebElement adminPanleIkon;

    @FindBy(xpath = "(//*[@class='list-group-item rounded-2 bg-dark border-0'])[8]")
    public WebElement AusgabenIkon;

    @FindBy(id = "dbdatum")
    public WebElement datum1;

    @FindBy(id = "belegdatum")
    public WebElement datum2;

    @FindBy(id = "belegzahlungsart")
    public WebElement zahlungart;

    @FindBy(id = "belegtext")
    public WebElement benennung;

    @FindBy(id = "belegart")
    public WebElement ausgabenart;

    @FindBy(id = "verwendungszweck")
    public WebElement verwendungszweck;

    @FindBy(id = "fahrzeugId")
    public WebElement fahrzeug;

    @FindBy(id = "telefoneId")
    public WebElement telefone;

    @FindBy(id = "ausgabenvolumen")
    public WebElement volumen;

    @FindBy(id = "ausgabenzeit")
    public WebElement uhrzeit;

    @FindBy(id = "belegbetrag")
    public WebElement belegbetragnetto;

    @FindBy ( xpath = "//*[@class='btn bg-primary fw-semibold text-white']")
    public WebElement eingeben;









}
