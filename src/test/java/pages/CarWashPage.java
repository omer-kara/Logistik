package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class CarWashPage extends BasePage {



    @FindBy (xpath = "(//a[@class='nav-link'])[4]")

    public WebElement carWashGiris;

    @FindBy (id="dbdatum")
    public WebElement datumCarWash;

    @FindBy (xpath="(//*[@name='fahrer'])")
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

    @FindBy (id="pflegebetrag")
    public WebElement betragCarWash;

    @FindBy (id="pflegenotiz")
    public WebElement notizCarwash;

    @FindBy (xpath = "//*[text()='Submit']")
    public WebElement submitCarwash;

    public void carWashGiris(){
        carWashGiris.click();

    }
}


