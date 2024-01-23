package stepdef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CarWashPage;
import pages.RegistrierungPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CarWashSeite {

    CarWashPage carWashPage=new CarWashPage();
    RegistrierungPage registrierungPage = new RegistrierungPage();

    WebDriver driver = new ChromeDriver();



//    @Given("Kullanici login sayfasina gider")
//    public void kullanici_login_sayfasina_gider() {
//        Driver.getDriver().get(ConfigReader.getProperty("LieferungUrl"));
//
//    }
//    @When("Kullanici admin olarak gecerli bir Email girer")
//    public void kullanici_admin_olarak_gecerli_bir_email_girer() {
//        registrierungPage.email_box.sendKeys("admin@zone-edv.de");
//
//
//    }
//    @When("Kullanici admin olarak gecerli bir sifre girer")
//    public void kullanici_admin_olarak_gecerli_bir_sifre_girer() {
//        registrierungPage.password_box.sendKeys("1");
//
//    }

    @And("Kullanici Login sayfasinda gecerli admin Email i doldurur")
    public void kullaniciLoginSayfasindaGecerliAdminEmailIDoldurur() {
    registrierungPage.email_box.sendKeys("admin@zone-edv.de");

}

    @And("Kullanici Login sayfasinda gecerli admin Password u doldurur")
    public void kullaniciLoginSayfasindaGecerliAdminPasswordUDoldurur() {
        registrierungPage.password_box.sendKeys("1");
    }

    @Given("Kullanici sol pencereden Car_Washi tiklar")
    public void kullanici_sol_pencereden_car_washi_tiklar() throws InterruptedException {
        Thread.sleep(3000);
        carWashPage.carWashGiris.click();
    }


    @When("Kullanici bir Datum secer")
    public void kullanici_bir_datum_secer() {


        carWashPage.datumCarWash.sendKeys("15.01.2024");

    }
    @When("Kullanici Bir Fahrer secer")
    public void kullanici_bir_fahrer_secer() {

        carWashPage.fahrerCarwash.sendKeys("leyla");

    }
    @When("Kullanici Kennzeichnen secer")
    public void kullanici_kennzeichnen_secer() {

        carWashPage.kennzeichnenCarwash.click();

    }
    @When("Reinigung checkbox tan Innenreinigung u secer")
    public void reinigung_checkbox_tan_innenreinigung_u_secer() {
        carWashPage.innenReinigungCarwash.click();

    }
    @When("Reinigung checkbox tan Ofenreinigung u secer")
    public void reinigung_checkbox_tan_ofenreinigung_u_secer() {
        carWashPage.ofenReinigungCarwash.click();


    }
    @When("Reinigung checkbox tan Außenreinigung u secer")
    public void reinigung_checkbox_tan_außenreinigung_u_secer() {
        carWashPage.außenReinigungCarwash.click();

    }
    @When("Kullanici Zahlungsart radiobuttondan keine Zahlung secer")
    public void kullanici_zahlungsart_radiobuttondan_keine_zahlung_secer() {
        carWashPage.keineZahlungCarwash.click();

    }
    @When("Kullanici Zahlungsart radiobuttondan Kartenzahlung secer")
    public void kullanici_zahlungsart_radiobuttondan_kartenzahlung_secer() {
        carWashPage.kartenZahlungCarwash.click();

    }
    @When("Kullanici Zahlungsart radiobuttondan Barzahlung secer")
    public void kullanici_zahlungsart_radiobuttondan_barzahlung_secer() {
        carWashPage.barZahlungCarwash.click();

    }
    @When("Kullanici bir Betrag secer")
    public void kullanici_bir_betrag_secer() {
        carWashPage.betragCarWash.sendKeys("50");

    }
    @When("Kullanici Notiz yazar")
    public void kullanici_notiz_yazar() {
        carWashPage.notizCarwash.sendKeys("test111");

    }
    @When("Speichern button atiklar")
    public void speichern_button_atiklar() {
        carWashPage.submitCarwash.click();

    }


}
