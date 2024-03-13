package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CarWashPage;
import pages.TagesTourPage;
import utilities.ReuseableMethods;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class TagesTour_StepDef  {
    TagesTourPage tagesTourPage = new TagesTourPage();
    WebDriver driver = new ChromeDriver();


    @Given("Kullanici TagesTour ikonuna tiklar")
    public void kullanici_tages_tour_ikonuna_tiklar() {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement sellElementi = driver.findElement(By.xpath("(//a[@class='nav-link'])[2]"));
        jse.executeScript("arguments][0].click();",sellElementi);

//        tagesTourPage.tagesTourIkon.click();
//        ReuseableMethods.bekle(2);
//        ReuseableMethods.scrollToElement(tagesTourPage.tagesTourIkon);
//
//        ReuseableMethods.bekle(3);
    }
//    @Given  ("Kullanici DateiAuswählen butonuna tiklar")
//    public void kullanici_datei_auswählen_butonuna_tiklar() {
//        tagesTourPage.tagesTourdateiAuswählen.click();
//
//    }
//    @Given("Kullanici kayitli excel tablosunu yükler")
//    public void kullanici_kayitli_excel_tablosunu_yükler () throws IOException {
//        String dosyaYolu="src/test/java/resources/testkunden.xlsx";
//        tagesTourPage.tagesTourdateiAuswählen.sendKeys(dosyaYolu);
//
////
//// FileInputStream fis=new FileInputStream(dosyaYolu);
//// Workbook workbook= WorkbookFactory.create(fis);
//// Sheet sheet= workbook.getSheet("ag-grid");
//// Row row=sheet.getRow(0);
//// Cell cell= row.getCell(10);
//
//    }
//    @Given("Kullanici DateiEinlesen butona tiklar")
//    public void kullanici_datei_einlesen_butona_tiklar() {
//        tagesTourPage.tagesTourDateiEinlesen.click();
//    }
//    @Given("Kullanici Hochladen butona tiklar")
//    public void kullanici_hochladen_butona_tiklar () {
//        tagesTourPage.tagesTourHochladenButton.click();
//
//    }
//    @Given("Kullanici tablodan Ankunft altindaki ilk tik isaretine tiklar.")
//    public void kullanici_tablodan_ankunft_altindaki_ilk_tik_isaretine_tiklar() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Given("Kullanici acilan tabloda secim yapar1")
//    public void kullanici_acilan_tabloda_secim_yapar1() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Given("Kullanici Speichern buttona tiklar1")
//    public void kullanici_speichern_buttona_tiklar1() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("Kullanici Status altinda {string} yazisinin görüldügünü dogrular")
//    public void kullanici_status_altinda_yazisinin_görüldügünü_dogrular(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("Kullanici tablodan Ankunft altindaki ikinci tik isaretine tiklar.")
//    public void kullanici_tablodan_ankunft_altindaki_ikinci_tik_isaretine_tiklar() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("Kullanici acilan tabloda secim yapar2")
//    public void kullanici_acilan_tabloda_secim_yapar2() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("Kullanici Speichern buttona tiklar2")
//    public void kullanici_speichern_buttona_tiklar2() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("Kullanici {string} yazisinin görüldügünü dogrular")
//    public void kullanici_yazisinin_görüldügünü_dogrular(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("Kullanici tablodan Ankunft altindaki ilk ucuncu isaretine tiklar.")
//    public void kullanici_tablodan_ankunft_altindaki_ilk_ucuncu_isaretine_tiklar() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("Kullanici acilan tabloda secim yapar3")
//    public void kullanici_acilan_tabloda_secim_yapar3() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("Kullanici Speichern buttona tiklar3")
//    public void kullanici_speichern_buttona_tiklar3() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("Kullanici tablodan Ankunft altindaki ilk dördüncü isaretine tiklar.")
//    public void kullanici_tablodan_ankunft_altindaki_ilk_dördüncü_isaretine_tiklar() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("Kullanici acilan tabloda secim yapar4")
//    public void kullanici_acilan_tabloda_secim_yapar4() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("Kullanici Speichern buttona tiklar4")
//    public void kullanici_speichern_buttona_tiklar4() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("Kullanici tablodan Ankunft altindaki besinci tik isaretine tiklar.")
//    public void kullanici_tablodan_ankunft_altindaki_besinci_tik_isaretine_tiklar() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("Kullanici acilan tabloda secim yapar5")
//    public void kullanici_acilan_tabloda_secim_yapar5() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("Kullanici Speichern buttona tiklar5")
//    public void kullanici_speichern_buttona_tiklar5() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("Kullanici Zum Ziel den haritayi görmek icin navigasyon ikonuna tiklar")
//    public void kullanici_zum_ziel_den_haritayi_görmek_icin_navigasyon_ikonuna_tiklar() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("Kullanici haritada teslimat yerinin görüldügünü Straße bilgisi ile dogrular")
//    public void kullanici_haritada_teslimat_yerinin_görüldügünü_straße_bilgisi_ile_dogrular() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }




}
