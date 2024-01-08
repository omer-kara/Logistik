package stepdef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WindowType;
import pages.RegistrierungPage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.ReuseableMethods.*;
import static utilities.ReuseableMethods.SifreOlusturucu.generatePassword;


public class RegistrierungSeiteÖmer {
    RegistrierungPage registrierungPage = new RegistrierungPage();
    Faker faker =new Faker();
    String zonehanndle;
    String fakemailhanndle;
    String mail;
    String password;

    String pass;


    @Given("Kullanici login sayfasina gider")
    public void kullanici_login_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("LieferungUrl"));
    }

    @When("Kullanici Registrierung butona tiklar")
    public void kullanici_registrierung_butona_tiklar() throws InterruptedException {

        registrierungPage.registrierungButton.click();

    }
    @When("Kullanici Benutzer Name box a giris yapar")
    public void kullanici_benutzer_name_box_a_giris_yapar() {
        registrierungPage.benutzerName.sendKeys("admin9@zone-edv.de");

    }
    @When("Kullanici Telefonnummer box a giris yapar")
    public void kullanici_telefonnummer_box_a_giris_yapar() {
        //String numara = faker.phoneNumber().cellPhone();
        phoneNumberUret();

    /*    // Telefon numarası 0 ile başlamıyorsa veya +49 ile başlamıyorsa düzenle

        if (!numara.startsWith("0") && !numara.startsWith("+49")) {
            if (!numara.startsWith("+")) {
                // Eğer + ile başlamıyorsa, + ekleyerek düzenle
                numara = "+" + numara;
            } else {
                // Eğer + ile başlıyorsa, +49 ekleyerek düzenle
                numara = "+49" + numara.substring(1);
            }
        } else if (numara.startsWith("0")) {
            // Eğer 0 ile başlıyorsa, 0 ekleyerek düzenle
            numara = "0" + numara;
        }

     */



        registrierungPage.telefonnummer.sendKeys(phoneNumberUret());



    }
    @When("Kullanici Email Box a giris yapar")
    public void kullanici_email_box_a_giris_yapar() {

        zonehanndle=Driver.getDriver().getWindowHandle();
        //fakeemail
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        fakemailhanndle=Driver.getDriver().getWindowHandle();
        Driver.getDriver().get(ConfigReader.getProperty("fakemail"));
        click(registrierungPage.fakeemailcookies);
        mail=registrierungPage.fakemailadresi.getText(); //.fakemailadresi.getText();
        //zone
        Driver.getDriver().switchTo().window(zonehanndle);
        //Driver.getDriver().switchTo().frame(registrierungPage.iframe_emailbox);
        registrierungPage.email_box.sendKeys(mail);

//        String email = faker.internet().emailAddress().toString();
//        registrierungPage.registrierungEmail.sendKeys(email);

    }
    @When("Kullanici Password Box agiris yapar")
    public void kullanici_password_box_agiris_yapar() throws InterruptedException {



        pass = generatePassword(8);

        registrierungPage.registrierungPassword.sendKeys(pass);

        Thread.sleep(5000);

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
        registrierungPage.email_box.sendKeys(mail);

    }
    @When("Kullanici Login sayfasinda gecerli Password u doldurur")
    public void kullanici_login_sayfasinda_gecerli_password_u_doldurur() {
        registrierungPage.password_box.sendKeys(pass );


    }
    @When("Kullanici Anmelden butonuna tiklar")
    public void kullanici_anmelden_butonuna_tiklar() {
        click(registrierungPage.anmeldenButton);

    }
    @Then("Kullanici Logistik Projesine Hosgeldiniz gorur")
    public void kullanici_logistik_projesine_hosgeldiniz_gorur() {
        //Assert.assertTrue("Logistik Projesine Hosgeldiniz", );

    }


    @Given("Kullanici login assassinate gider")
    public void kullaniciLoginAssassinateGider() {
        Driver.getDriver().get(ConfigReader.getProperty("LieferungUrl"));
    }
}
