package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CarWashPage {
    //public CarWashPage(){ PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath = "(//*[@class='list-group-item rounded-2 bg-dark border-0'])[4]")
    public WebElement carWashGiris;

    @FindBy (id="dbdatum")
    public WebElement datumCarWash;

    @FindBy (id="txtTour")
    public WebElement fahrerCarwash;

    @FindBy (id="txtTour")
    public WebElement kennzeichnenCarwash;

    @FindBy (id="Innenreinigung")
    public WebElement innenReinigungCarwash;

    @FindBy (id="Ofenreinigung")
    public WebElement ofenReinigungCarwash;

    @FindBy (id="Aussenreinigung")
    public WebElement außenReinigungCarwash;

    @FindBy (id="flexRadioDefault1")
    public WebElement barZahlungCarwash;
    @FindBy (id="flexRadioDefault2")
    public WebElement kartenZahlungCarwash;

    @FindBy (id="flexRadioDefault3")
    public WebElement keineZahlungCarwash;

    @FindBy (id="txtBetrag")
    public WebElement betragCarWash;

    @FindBy (id="pflegenotiz")
    public WebElement notizCarwash;

    @FindBy (className = "btn btn-primary btn-sm d-block")
    public WebElement submitCarwash;
}
