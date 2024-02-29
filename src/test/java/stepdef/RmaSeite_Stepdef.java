package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.RmaPage;
import utilities.ReuseableMethods;

public class RmaSeite_Stepdef {

    RmaPage rmaPage = new RmaPage();

    @When("Kullanici Rma ikona tiklar")
    public void kullanici_rma_ikona_tiklar() {
        rmaPage.rmaIkon.click();
        ReuseableMethods.bekle(1);
        ReuseableMethods.scrollToElement(rmaPage.rmaNeuRadioButton);
        ReuseableMethods.bekle(1);
        //ReuseableMethods.scrollToElement(rmaPage.rmaUhrzeit);
        rmaPage.rmaUhrzeit.click();
        ReuseableMethods.bekle(1);
    }



    @When("Kullanici gesendet radio butonunu secer")
    public void kullanici_gesendet_radio_butonunu_secer() {
        rmaPage.rmaGesendetRadioButton.click();
        ReuseableMethods.bekle(1);



    }

    @When("Kullanici Intern radio butonunu secer")
    public void kullanici_intern_radio_butonunu_secer() {
        rmaPage.rmaInternRadioButton.click();
        ReuseableMethods.bekle(1);
    }

    @When("Kullanici neue radio butonunu secer")
    public void kullanici_neue_radio_butonunu_secer() {
        rmaPage.rmaNeuRadioButton.click();
        ReuseableMethods.bekle(1);
    }

    @When("Kullanici guncel tarihi secer")
    public void kullanici_guncel_tarihi_secer() {
        ReuseableMethods.guncelTarihiGetir();
        ReuseableMethods.bekle(1);
    }

    @When("Kullanici rma tarihini secer")
    public void kullanici_rma_tarihini_secer() {
        ReuseableMethods.eskiTarihiGetir();
        ReuseableMethods.bekle(1);
    }

    @And("Kullanici rmaUhrzeit secer")
    public void kullaniciRmaUhrzeitSecer() {
        ReuseableMethods.guncelSaatiGetir();
        ReuseableMethods.bekle(1);
    }

    @When("Kullanici dropDown menuden bir Fahrer secer")
    public void kullanici_drop_down_menuden_bir_fahrer_secer() {

        Select select = new Select(rmaPage.rmaFahrerDD);
        select.selectByIndex(1);
        ReuseableMethods.bekle(1);

    }

    @When("Kullanici dropDown menuden bir Tour secer")
    public void kullanici_drop_down_menuden_bir_tour_secer() {
        Select select = new Select(rmaPage.rmaTourDD);
        select.selectByIndex(1);
        ReuseableMethods.bekle(1);
    }

    @When("Kullanici dropDown menuden bir Kundennummer secer")
    public void kullanici_drop_down_menuden_bir_kundennummer_secer() {
        Select select = new Select(rmaPage.rmaKundenNummer);
        select.selectByVisibleText("66666");
        ReuseableMethods.bekle(1);
    }

    @When("Kullanici dropDown menuden bir Kundenname secer")
    public void kullanici_drop_down_menuden_bir_kundenname_secer() {
        Select select = new Select(rmaPage.rmaKundenName);
        select.selectByVisibleText("Cenk");
        ReuseableMethods.bekle(1);
    }

    @When("Kullanici dropDown menuden bir Kundenstraße secer")
    public void kullanici_drop_down_menuden_bir_kundenstraße_secer() {

        Select select = new Select(rmaPage.rmaKundenStr);
        select.selectByVisibleText("Vohwinkeler Str. 145D");
        ReuseableMethods.bekle(1);

    }

    @When("Kullanici dropDown menuden bir RMA secer")
    public void kullanici_drop_down_menuden_bir_rma_secer() {

        Select select = new Select(rmaPage.rmaAuswahl);
        select.selectByIndex(1);
        ReuseableMethods.bekle(1);


    }

    @When("Kullanici dropDown menuden bir RMANotiz secer")
    public void kullanici_drop_down_menuden_bir_rma_notiz_secer() {
        Select select = new Select(rmaPage.rmaNotiz);
        select.selectByIndex(1);
        ReuseableMethods.bekle(1);
    }

    @When("Kullanici Rmanotiz2 alanina bir not yazar")
    public void kullanici_rmanotiz2_alanina_bir_not_yazar() {
        rmaPage.rmaNotiz2.sendKeys("Yemek soguk");
        ReuseableMethods.bekle(1);
    }

    @When("Kullanici Zwischernspeichern butona tiklar")
    public void kullanici_zwischernspeichern_butona_tiklar() {
        rmaPage.rmaZwischernSpeichernBtn.click();
        ReuseableMethods.bekle(1);
    }

    @When("Kullanici Abschließen butona tiklar")
    public void kullanici_abschließen_butona_tiklar() {
        rmaPage.rmaAbschließenButton.click();
        ReuseableMethods.bekle(1);
    }

    @When("Kullanici Laden butona tiklar")
    public void kullanici_laden_butona_tiklar() {
        rmaPage.rmaLadenButton.click();
    }



}
