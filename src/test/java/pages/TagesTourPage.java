package
        pages
        ;

import
        org.openqa.selenium.WebElement
        ;

import
        org.openqa.selenium.support.FindBy
        ;

import
        org.openqa.selenium.support.PageFactory
        ;

import
        utilities.Driver
        ;

public class TagesTourPage {

    public    TagesTourPage () {PageFactory.initElements (Driver.getDriver(), this);    }

    @FindBy            (xpath =                    "(//span[@class='me-3'])[1]"            )
    public    WebElement tagesTourGirisIcon            ;

    @FindBy(xpath = "(//a[@class='nav-link'])[2]")
    public WebElement tagesTourIkon;

    @FindBy            (xpath =                    "//button[@class='btn btn-primary']"            )
    public    WebElement tagesTourDateiEinlesen            ;

    @FindBy            (xpath =                    "(//button[@class='btn btn-success"            )
    public    WebElement tagesTourHochladenButton            ;

    @FindBy            (className =                    "btn btn-primary position-absolute fixed-bottom"            )
    public    WebElement tagesTourSpeichern            ;

    @FindBy            (xpath =                    "//*[text()='Lieferung erfolgreich, keine Besonderheiten']"            )
    public    WebElement tagesTourErfolgreichYazisi            ;

    @FindBy            (xpath =                    "//*[text()='Lieferung erfolgreich, Menü vor Wohnungstür abgestellt']"            )
    public    WebElement tagesTourWohnungsTürAbgestellt            ;

    @FindBy            (xpath =                    "//*[text()='Lieferung nicht erfolgreich, Annahme verweigert']"            )
    public    WebElement tagesTourAnnahmeVerweigert            ;

    @FindBy            (xpath =                    "//*[text()='Lieferung nicht erfolgreich, TG nicht persönlich angetroffen']"            )
    public    WebElement tagesTourTGNichtPersönlich            ;

    @FindBy            (xpath =                    "//*[text()='TG gesundheitlich beeinträchtigt, Notfall']"            )
    public    WebElement tagesTourTGGesundheitlich            ;

}