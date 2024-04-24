package stepdef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.Select;
import pages.AusgabenPage;
import utilities.ReuseableMethods;

public class AusgabenSeite_StepDef {

    Faker faker = new Faker();
    AusgabenPage ausgabenPage= new AusgabenPage();
    @Given("Kullanici sol pencereden Ausgaben tiklar")
    public void kullanici_sol_pencereden_ausgaben_tiklar() {

        ausgabenPage.adminPanleIkon.click();
        ausgabenPage.AusgabenIkon.click();
        ausgabenPage.datum2.click();
        ReuseableMethods.scrollToElement(ausgabenPage.eingeben);
        ReuseableMethods.bekle(2);

    }
    @Given("Kullanici bir Datum1 secer")
    public void kullanici_bir_datum1_secer() {
        ausgabenPage.datum1.sendKeys(ReuseableMethods.guncelTarihiGetir());
        ReuseableMethods.bekle(2);


    }
    @Given("Kullanici bir Datum2 secer")
    public void kullanici_bir_datum2_secer() {

        ausgabenPage.datum2.sendKeys(ReuseableMethods.birgunileriTarihiGetir());
        ReuseableMethods.bekle(2);
    }
    @Given("Kullanici Zahlungsart auswahlen secer")
    public void kullanici_zahlungsart_auswahlen_secer() {

        Select select = new Select(ausgabenPage.zahlungart);
        select.selectByIndex(1);
        select.selectByIndex(2);
        select.selectByIndex(3);
        ReuseableMethods.bekle(2);

    }
    @Given("Kullanici Bennunnung secer")
    public void kullanici_bennunnung_secer() {

        Select select = new Select(ausgabenPage.benennung);
        select.selectByIndex(1);
        select.selectByIndex(2);
        select.selectByIndex(3);
        select.selectByIndex(4);
        ReuseableMethods.bekle(2);

    }
    @Given("Kullanici Ausgabenart auswahlen secer")
    public void kullanici_ausgabenart_auswahlen_secer() {

        Select select = new Select(ausgabenPage.ausgabenart);
        select.selectByIndex(1);
        select.selectByIndex(2);
        select.selectByIndex(3);
        select.selectByIndex(4);
        ReuseableMethods.bekle(2);

    }
    @Given("Kullanici Verwendungsweck eingeben secer")
    public void kullanici_verwendungsweck_eingeben_secer() {

        ausgabenPage.verwendungszweck.sendKeys("Test");
        ReuseableMethods.bekle(2);
    }
    @Given("Kullanici Fahrzeug secer")
    public void kullanici_fahrzeug_secer() {
        Select select = new Select(ausgabenPage.fahrzeug);
        select.selectByIndex(1);
        select.selectByIndex(2);
        select.selectByIndex(3);
        select.selectByIndex(4);
        ReuseableMethods.bekle(2);
    }
    @Given("Kullanici Telefone secer")
    public void kullanici_telefone_secer() {
        ausgabenPage.telefone.clear();
        ausgabenPage.telefone.sendKeys( ReuseableMethods.phoneNumberUret());
        ReuseableMethods.bekle(2);
    }
    @Given("Kullanici Volumen secer")
    public void kullanici_volumen_secer() {

        ausgabenPage.volumen.clear();
        ausgabenPage.volumen.sendKeys(ReuseableMethods.stringSayiUret(0,100));
        ReuseableMethods.bekle(2);

    }
    @Given("Kullanici Uhrzeit secer")
    public void kullanici_uhrzeit_secer() {

        ausgabenPage.uhrzeit.sendKeys(ReuseableMethods.guncelSaatiGetir().toString());
        ReuseableMethods.bekle(2);
    }
    @Given("Kullanici Belegbetragnetto yazar")
    public void kullanici_belegbetragnetto_yazar() {

        ausgabenPage.belegbetragnetto.sendKeys(ReuseableMethods.stringSayiUret(100,2000));
        ReuseableMethods.bekle(2);

    }
    @Given("Kullanici Eingeben a tiklar")
    public void kullanici_eingeben_a_tiklar() {

        ausgabenPage.eingeben.click();
        ReuseableMethods.bekle(5);
    }

}
