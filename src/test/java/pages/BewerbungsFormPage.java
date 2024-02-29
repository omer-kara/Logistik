package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BewerbungsFormPage {
    @FindBy(linkText = "/bewerbungsbogen")
    public WebElement bewerbungsformGiris;

    @FindBy(id="bewerbervorname")
    public WebElement vorname;

    @FindBy(id="bewerbernachname")
    public WebElement nachname;

    @FindBy(id="bewerberemail")
    public WebElement bewerberEmail;

    @FindBy(id="bewerbertelefon")
    public WebElement bewerberTelefon;

    @FindBy(id="bewerberstr")
    public WebElement bewerberStrHausNr;

    @FindBy(id="bewerberort")
    public WebElement bewerberOrt;

    @FindBy(id="bewerbergebdatum")
    public WebElement bewerberGeburtsDatum;

    @FindBy(id="männlich")
    public WebElement bewerberGeschlechtMännlich;

    @FindBy(id="weiblich")
    public WebElement bewerberGeschlechtWeiblich;

    @FindBy(id="fuhrerscheinklasse")
    public WebElement bewerberFührerscheinKlasse;

    @FindBy(id="eintrittsdatum")
    public WebElement bewerberEntrittsDatum;

    @FindBy(xpath = "//label[text()='Mo']")
    public WebElement bewerberArbeitstageMontag;

    @FindBy(xpath = "//label[text()='Di']")
    public WebElement bewerberArbeitstageDienstag;
    @FindBy(xpath = "//label[text()='Mi']")
    public WebElement bewerberArbeitstageMittwoch;
    @FindBy(xpath = "//label[text()='Do']")
    public WebElement bewerberArbeitstageDonnerstag;
    @FindBy(xpath = "//label[text()='Fr']")
    public WebElement bewerberArbeitstageFreitag;
    @FindBy(xpath = "//label[text()='Sa']")
    public WebElement bewerberArbeitstageSamstag;
    @FindBy(xpath = "//label[text()='So']")
    public WebElement bewerberArbeitstageSontag;

    @FindBy(id = "aushilfe")
    public WebElement beschaftigunsArtAushilfe;

    @FindBy(id = "teilzeit")
    public WebElement beschaftigunsArtTeilzeit;

    @FindBy(id = "vollzeit")
    public WebElement beschaftigunsArtVollzeit;

    @FindBy(id = "ja")
    public WebElement schwerBehindertJa;

    @FindBy(id = "nein")
    public WebElement schwerBehindertNein;

    @FindBy(name = "behinderungart")
    public WebElement behinderArtNotiz;

    @FindBy(id = "bewerbernotiz")
    public WebElement bewerberNotiz;

    @FindBy(className = ".btn.btn-primary")
    public WebElement sendenButton;

    @FindBy(className = ".text-primary")
    public WebElement cikisIkon;

}
