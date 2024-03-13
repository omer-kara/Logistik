package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // test çalıştırıcı notasyonu
@CucumberOptions( // Seneryoların nerede ve nasıl çalışacağı, hangi raporun kullanılmasıyla alakalı seçenekleri ayarlar
        plugin = {"html:src/test/resources/reports/html-reports/Reports.html",
                "json:src/test/resources/reports/json-reports/cucumber.json",
                "junit:src/test/resources/reports/xml-reports/cucumber.xml",
                "rerun:TestOutput/failed_scenario.txt",
               "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        //Rerun fail olan scenarioları belirtilen yoldaki txt dosya içinde gösterir
        //plugin parametresi ile plugin ifadesi kullanılırsa konsolda scenariolar ile bilgi gösterir
        features = "src/test/resources/features",
        //features = "src/test/resources/reports/Reports.html",
        glue ={"stepdef","hooks"},





        tags = "@tagesTour",



        dryRun = false , //Seneryonun adımlarını kontrol eder ve çalıştığını görürüz
        //dryRun=true Test adımlarını sadece kontrol eder.
        // dryRun default olarak false'dır.

        monochrome = true//pretty ifadesinden sonra monochrome=true kullanırsak scenario adımlarını tek renk olarak siyah gösterir
        // monochrome = false kullanırsak scenario adımlarını renkli gösterir
        //default = false

)
public class Runner {

}