package stepdef;


import io.cucumber.java.en.When;
import pages.BewerbungsFormPage;
import utilities.ReuseableMethods;


public class BewerbungsForm_StepDef {

    BewerbungsFormPage bewerbungsFormPage=new BewerbungsFormPage();


    @When("Bewerbungsform a tiklar")
    public void bewerbungsform_a_tiklar() {
        ReuseableMethods.bekle(1);
        bewerbungsFormPage.bewerbungsformGiris.click();
        ReuseableMethods.bekle(1);


    }
    @When("Vorname alanina giris yapar")
    public void vorname_alanina_giris_yapar() {
        bewerbungsFormPage.vorname.sendKeys("TestVorname");
        ReuseableMethods.bekle(1);



    }
    @When("Nachname alanina giris yapar")
    public void nachname_alanina_giris_yapar() {

        bewerbungsFormPage.nachname.sendKeys("TestNachname");
        ReuseableMethods.bekle(1);


    }
    @When("Email alanina giris yapar")
    public void email_alanina_giris_yapar() {
        bewerbungsFormPage.bewerberEmail.sendKeys("testemail@zone-edv.de");
        ReuseableMethods.bekle(1);

    }
    @When("Telefon alanina giris yapar")
    public void telefon_alanina_giris_yapar() {

        bewerbungsFormPage.bewerberTelefon.sendKeys("+4912345678911");
        ReuseableMethods.bekle(1);

    }
    @When("Straße HausNr alanina giris yapar")
    public void straße_haus_nr_alanina_giris_yapar() {
        bewerbungsFormPage.bewerberStrHausNr.sendKeys("TestStraße 11");
        ReuseableMethods.bekle(1);

    }
    @When("PLZ alanina giris yapar")
    public void plz_alanina_giris_yapar() {
        bewerbungsFormPage..sendKeys("TestNachname");
        ReuseableMethods.bekle(1);

    }
    @When("Wohnort alanina giris yapar")
    public void wohnort_alanina_giris_yapar() {

    }
    @When("Geburtsdatum alanina giris yapar")
    public void geburtsdatum_alanina_giris_yapar() {

    }
    @When("Geschlecht määnlich  radio buttonu tiklar")
    public void geschlecht_määnlich_radio_buttonu_tiklar() {

    }
    @When("Geschlecht weiblich  radio buttonu tiklar")
    public void geschlecht_weiblich_radio_buttonu_tiklar() {

    }
    @When("Geschlecht diverse  radio buttonu tiklar")
    public void geschlecht_diverse_radio_buttonu_tiklar() {

    }
    @When("Führerscheinklasse dropdown dan bir option secer")
    public void führerscheinklasse_dropdown_dan_bir_option_secer() {

    }
    @When("Startwunsch alanina bir tarih girer")
    public void startwunsch_alanina_bir_tarih_girer() {

    }
    @When("Wochenarbeitstage alanindan Mo radiobutonunu secer")
    public void wochenarbeitstage_alanindan_mo_radiobutonunu_secer() {

    }
    @When("Wochenarbeitstage alanindan Di radiobutonunu secer")
    public void wochenarbeitstage_alanindan_di_radiobutonunu_secer() {

    }
    @When("Wochenarbeitstage alanindan Mi radiobutonunu secer")
    public void wochenarbeitstage_alanindan_mi_radiobutonunu_secer() {

    }
    @When("Wochenarbeitstage alanindan Do radiobutonunu secer")
    public void wochenarbeitstage_alanindan_do_radiobutonunu_secer() {

    }
    @When("Wochenarbeitstage alanindan Fr radiobutonunu secer")
    public void wochenarbeitstage_alanindan_fr_radiobutonunu_secer() {

    }
    @When("Wochenarbeitstage alanindan Sa radiobutonunu secer")
    public void wochenarbeitstage_alanindan_sa_radiobutonunu_secer() {

    }
    @When("Wochenarbeitstage alanindan So radiobutonunu secer")
    public void wochenarbeitstage_alanindan_so_radiobutonunu_secer() {

    }
    @When("Beschäftigunsart alanindan Aushilfe radio butonu tiklar")
    public void beschäftigunsart_alanindan_aushilfe_radio_butonu_tiklar() {

    }
    @When("Beschäftigunsart alanindan Teilzeit radio butonu tiklar")
    public void beschäftigunsart_alanindan_teilzeit_radio_butonu_tiklar() {

    }
    @When("Beschäftigunsart alanindan Vollzeit radio butonu tiklar")
    public void beschäftigunsart_alanindan_vollzeit_radio_butonu_tiklar() {

    }
    @When("Schwerbehinder alaninda Ja radiobutonu tiklar")
    public void schwerbehinder_alaninda_ja_radiobutonu_tiklar() {

    }
    @When("Schwerbehinder alanina bir not girer")
    public void schwerbehinder_alanina_bir_not_girer() {

    }
    @When("Schwerbehinder alaninda Nein radiobutonu tiklar")
    public void schwerbehinder_alaninda_nein_radiobutonu_tiklar() {

    }
    @When("Notizen alanina bir not girer")
    public void notizen_alanina_bir_not_girer() {

    }
    @When("Senden butonuna tiklanir")
    public void senden_butonuna_tiklanir() {

    }
}
