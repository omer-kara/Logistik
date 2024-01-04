package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // test çalıştırıcı notasyonu
@CucumberOptions( // Seneryoların nerede ve nasıl çalışacağı, hangi raporun kullanılmasıyla alakalı seçenekleri ayarlar
        plugin = {"html:src/test/resources/reports/html-reports/Reports1.html",
                 "json:src/test/resources/reports/json-reports/cucumber1.json",
                 "junit:src/test/resources/reports/xml-reports/cucumber1.xml",
                 "rerun:TestOutput/failed_scenario.txt",
                 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        //Rerun fail olan scenarioları belirtilen yoldaki txt dosya içinde gösterir
        //plugin parametresi ile plugin ifadesi kullanılırsa konsolda scenariolar ile bilgi gösterir
        features = "@TestOutput/failed_scenario.txt",
        glue ={"stepdef","hooks"},
        dryRun = false , //Seneryonun adımlarını kontrol eder ve çalıştığını görürüz
        //dryRun=true Test adımlarını sadece kontrol eder.
        // dryRun default olarak false'dır.

        monochrome = true//pretty ifadesinden sonra monochrome=true kullanırsak scenario adımlarını tek renk olarak siyah gösterir
        // monochrome = false kullanırsak scenario adımlarını renkli gösterir
        //default = false

)
public class Failed_Runner {

}
