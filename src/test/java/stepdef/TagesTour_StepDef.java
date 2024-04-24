package stepdef;

import io.cucumber.java.en.Given;

import pages.TagesTourPage;
import utilities.ReuseableMethods;



public class TagesTour_StepDef {

    TagesTourPage tagesTourPage = new TagesTourPage();

    @Given("Kullanici TagesTour ikonuna tiklar")
    public void kullanici_tages_tour_ikonuna_tiklar() {

        tagesTourPage.tagesTourIkon.click();
        ReuseableMethods.bekle(5);

    }
//    @Given("Kullanici DateiAuswählen butonuna tiklar")

//    public void kullanici_datei_auswählen_butonuna_tiklar() {
//        tagesTourPage.tagesTourdateiAuswählen.click();
//
//    }
//    @Given("Kullanici kayitli excel tablosunu yükler")

//    public void kullanici_kayitli_excel_tablosunu_yükler() throws IOException {
//
//       String dosyaYolu="src/test/java/resources/testkunden.xlsx";
//       tagesTourPage.tagesTourdateiAuswählen.sendKeys(dosyaYolu);


//
//     FileInputStream fis=new FileInputStream(dosyaYolu);
//        Workbook workbook= WorkbookFactory.create(fis);
//        Sheet sheet= workbook.getSheet("ag-grid");
//        Row row=sheet.getRow(0);
//        Cell cell= row.getCell(10);


   // }

//    @Given("Kullanici DateiEinlesen butona tiklar")
//    public void kullanici_datei_einlesen_butona_tiklar() {
//        tagesTourPage.tagesTourDateiEinlesen.click();
//    }
//    @Given("Kullanici Hochladen butona tiklar")

//    public void kullanici_hochladen_butona_tiklar() {
//        tagesTourPage.tagesTourHochladenButton.click();

   // }
//    @Given("Kullanici tablodan Ankunft altindaki ilk tik isaretine tiklar.")
//    public void kullanici_tablodan_ankunft_altindaki_ilk_tik_isaretine_tiklar() {
//
//
//
//    }
//    @Given("Kullanici acilan tabloda secim yapar1")
//    public void kullanici_acilan_tabloda_secim_yapar1() {
//
//    }
//    @Given("Kullanici Speichern buttona tiklar1")
//    public void kullanici_speichern_buttona_tiklar1() {
//
//    }
//    @Then("Kullanici Status altinda {string} yazisinin görüldügünü dogrular")
//    public void kullanici_status_altinda_yazisinin_görüldügünü_dogrular(String string) {
//
//    }
//    @Then("Kullanici tablodan Ankunft altindaki ikinci tik isaretine tiklar.")
//    public void kullanici_tablodan_ankunft_altindaki_ikinci_tik_isaretine_tiklar() {
//
//    }
//    @Then("Kullanici acilan tabloda secim yapar2")
//    public void kullanici_acilan_tabloda_secim_yapar2() {
//
//    }
//    @Then("Kullanici Speichern buttona tiklar2")
//    public void kullanici_speichern_buttona_tiklar2() {
//
//    }
//    @Then("Kullanici {string} yazisinin görüldügünü dogrular")
//    public void kullanici_yazisinin_görüldügünü_dogrular(String string) {
//
//    }
//    @Then("Kullanici tablodan Ankunft altindaki ilk ucuncu isaretine tiklar.")
//    public void kullanici_tablodan_ankunft_altindaki_ilk_ucuncu_isaretine_tiklar() {
//
//    }
//    @Then("Kullanici acilan tabloda secim yapar3")
//    public void kullanici_acilan_tabloda_secim_yapar3() {
//
//    }
//    @Then("Kullanici Speichern buttona tiklar3")
//    public void kullanici_speichern_buttona_tiklar3() {
//
//    }
//    @Then("Kullanici tablodan Ankunft altindaki ilk dördüncü isaretine tiklar.")
//    public void kullanici_tablodan_ankunft_altindaki_ilk_dördüncü_isaretine_tiklar() {
//
//    }
//    @Then("Kullanici acilan tabloda secim yapar4")
//    public void kullanici_acilan_tabloda_secim_yapar4() {
//
//    }
//    @Then("Kullanici Speichern buttona tiklar4")
//    public void kullanici_speichern_buttona_tiklar4() {
//
//    }
//    @Then("Kullanici tablodan Ankunft altindaki besinci tik isaretine tiklar.")
//    public void kullanici_tablodan_ankunft_altindaki_besinci_tik_isaretine_tiklar() {
//
//    }
//    @Then("Kullanici acilan tabloda secim yapar5")
//    public void kullanici_acilan_tabloda_secim_yapar5() {
//
//    }
//    @Then("Kullanici Speichern buttona tiklar5")
//    public void kullanici_speichern_buttona_tiklar5() {
//
//    }
//    @Then("Kullanici Zum Ziel den haritayi görmek icin navigasyon ikonuna tiklar")
//    public void kullanici_zum_ziel_den_haritayi_görmek_icin_navigasyon_ikonuna_tiklar() {
//
//    }
//    @Then("Kullanici haritada teslimat yerinin görüldügünü Straße bilgisi ile dogrular")
//    public void kullanici_haritada_teslimat_yerinin_görüldügünü_straße_bilgisi_ile_dogrular() {
//

//    }




}
