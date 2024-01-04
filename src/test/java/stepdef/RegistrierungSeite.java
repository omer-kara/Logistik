package stepdef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.Keys;
import pages.RegistrierungPage;
import utilities.ConfigReader;
import utilities.Driver;


import static utilities.ReuseableMethods.click;


public class RegistrierungSeite {
    RegistrierungPage registrierungPage = new RegistrierungPage();
    Faker faker =new Faker();


    @Given("Kullanici login sayfasina gider")
    public void kullanici_login_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("LieferungUrl"));
    }

    @When("Kullanici Registrierung butona tiklar")
    public void kullanici_registrierung_butona_tiklar() throws InterruptedException {
        Thread.sleep(3000);
        registrierungPage.registrierungButton.click();
        Thread.sleep(3000);
    }
    @When("Kullanici Benutzer Name box a giris yapar")
    public void kullanici_benutzer_name_box_a_giris_yapar() {
        registrierungPage.benutzerName.sendKeys("admin9@zone-edv.de");

    }
    @When("Kullanici Telefonnummer box a giris yapar")
    public void kullanici_telefonnummer_box_a_giris_yapar() {
        String telefonNumarasi = faker.phoneNumber().toString();
        registrierungPage.telefonnummer.sendKeys(telefonNumarasi);



    }
    @When("Kullanici Email Box a giris yapar")
    public void kullanici_email_box_a_giris_yapar() {
        String email = faker.internet().emailAddress().toString();
        registrierungPage.registrierungEmail.sendKeys(email);

    }
    @When("Kullanici Password Box agiris yapar")
    public void kullanici_password_box_agiris_yapar() {
        String password = faker.internet().password().toString();
        registrierungPage.registrierungPassword.sendKeys(password);

    }
    @When("Kullanici AGB checkbox a tiklar")
    public void kullanici_agb_checkbox_a_tiklar() {
        click(registrierungPage.registrierungAgb);

    }
    @When("Kullanici Datenschutzbestimmungen checkbox a tiklar")
    public void kullanici_datenschutzbestimmungen_checkbox_a_tiklar() {
        click(registrierungPage.datenschutzBox);

    }
    @When("Kullanici Senden button a tiklar")
    public void kullanici_senden_button_a_tiklar() {
        click(registrierungPage.sendenButton);

    }
    @When("Kullanici Login sayfasinda gecerli Email i doldurur")
    public void kullanici_login_sayfasinda_gecerli_email_i_doldurur() {

    }
    @When("Kullanici Login sayfasinda gecerli Password u doldurur")
    public void kullanici_login_sayfasinda_gecerli_password_u_doldurur() {

    }
    @When("Kullanici Anmelden butonuna tiklar")
    public void kullanici_anmelden_butonuna_tiklar() {

    }
    @Then("Kullanici Logistik Projesine Hosgeldiniz gorur")
    public void kullanici_logistik_projesine_hosgeldiniz_gorur() {

    }


    @Given("Kullanici login assassinate gider")
    public void kullaniciLoginAssassinateGider() {
        Driver.getDriver().get(ConfigReader.getProperty("LieferungUrl"));
    }
}
