package stepdef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.CarWashPage;
import pages.RegistrierungPage;
import utilities.ReuseableMethods;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CarWashSeite {

    CarWashPage carWashPage=new CarWashPage();

    RegistrierungPage registrierungPage=new RegistrierungPage();




    Faker faker =new Faker();

//    @Given("Kullanici login sayfasina gider")
//    public void kullanici_login_sayfasina_gider() {
//
//
//
//
//    }

    @And("Kullanici Login sayfasinda gecerli Admin Email i doldurur")
    public void kullaniciLoginSayfasindaGecerliAdminEmailIDoldurur() {
       registrierungPage.email_box.sendKeys("admin@zone-edv.de");

    }

    @And("Kullanici Login sayfasinda gecerli Admin Password u doldurur")
    public void kullaniciLoginSayfasindaGecerliAdminPasswordUDoldurur() {
        registrierungPage.password_box.sendKeys("1");
    }


    @Given("Kullanici sol pencereden Car_Washi tiklar")
    public void kullanici_sol_pencereden_car_washi_tiklar() {
        carWashPage.carWashGiris.click();
        ReuseableMethods.bekle(2);
        ReuseableMethods.scrollToElement(carWashPage.notizCarwash);

        ReuseableMethods.bekle(3);

    }


    @When("Kullanici bir Datum secer")
    public void kullanici_bir_datum_secer() {

        carWashPage.datumCarWash.click();

        String currentDate = getCurrentDate();
        System.out.println("Current Date: " + currentDate);
        carWashPage.datumCarWash.sendKeys(currentDate);

    }
        public String getCurrentDate() {
            // Şu anki tarih ve saat bilgisini alma
            Date now = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            return dateFormat.format(now);

        }

    public String getCurrentDate1() {
        // Şu anki tarih ve saat bilgisini alma
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(now);

    }

    @When("Kullanici Bir Fahrer secer")
    public void kullanici_bir_fahrer_secer() {


        Select select=new Select(carWashPage.fahrerCarwash);
        select.selectByVisibleText("leyla");


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
        ReuseableMethods.bekle(2);

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
