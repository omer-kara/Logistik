package utilities;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.SecureRandom;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.*;


public class ReuseableMethods {

    static Faker faker = new Faker();

    public static void bekle(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static String eskiTarihiGetir() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, -1); // 1 gün öncesini almak için

        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        return df.format(cal.getTime());
    }

    public static String guncelTarihiGetir() {
        Calendar cal = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        return df.format(cal.getTime());
    }

    public static String birgunileriTarihiGetir() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, +1); // 1 GUN SONRASINI ALMAKİCİN

        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        return df.format(cal.getTime());
    }

    public static LocalTime guncelSaatiGetir() {
        return LocalTime.now();
    }


    //istenilen uzunlukta bir şifre üret
    public static String generatetPassword(int length) {
        Faker faker = new Faker();
        String password = faker.regexify("[A-Za-z0-9]{" + length + "}");
        return password;
    }


    // SCROLL TO ELEMENT WITH JS
    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);



    }

    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    }





    public static String kelimeUret(int limit) {
        String kelime = "";
        Random r = new Random();
        for (int i = 0; i < limit; i++) {
            char c = (char)(r.nextInt(26) + 'a');
            kelime += c;
        }
        return kelime;
    }
    public static String stringSayiUret(int baslangic, int bitis){

        String sayi =""+faker.instance().number().numberBetween(baslangic, bitis);

        return sayi;


    }

    public static Integer integerSayiUret(int baslangic, int bitis){

        Integer sayi =faker.instance().number().numberBetween(baslangic, bitis);

        return sayi;

    }
    public static double generateBetweenZeroAndHundredDoubleRandomNumber() {
        Random random = new Random();
        double randomNumber = random.nextDouble() * 100; // 0 ile 100 arasında rastgele bir double sayı üretme
        randomNumber = Math.round(randomNumber * 100.0) / 100.0; // Noktadan sonra sadece 2 rakamı koruma
        return randomNumber;
    }

    public static String phoneNumberUret() {

     String phoneNumber=   "+49" + faker.instance().number().numberBetween(300, 899)
                +  faker.instance().number().numberBetween(100, 999)
                +  faker.instance().number().numberBetween(1000, 9999);
        return phoneNumber;
    }


    //Click Method
    public static void click(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].click();", element);
        }
    }

    public static WebElement waitForVisibility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    //Password olusturan kod
    public class SifreOlusturucu {

        public static String generatePassword(int uzunluk) {
            String harfler = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String rakamlar = "0123456789";
            String ozelKarakter = "!@#$%^&*()-_=+";

            SecureRandom random = new SecureRandom();
            StringBuilder sifre = new StringBuilder();

            // En az bir büyük harf
            sifre.append(harfler.charAt(random.nextInt(26) + 26));

            // En az bir küçük harf
            sifre.append(harfler.charAt(random.nextInt(26)));

            // En az bir rakam
            sifre.append(rakamlar.charAt(random.nextInt(10)));

            // Bir tane özel karakter
            sifre.append(ozelKarakter.charAt(random.nextInt(ozelKarakter.length())));

            // Geri kalan karakterler
            for (int i = 4; i < uzunluk; i++) {
                String karakterGrubu = harfler + rakamlar + ozelKarakter;
                sifre.append(karakterGrubu.charAt(random.nextInt(karakterGrubu.length())));
            }

            // Şifreyi karıştır
            char[] sifreDizi = sifre.toString().toCharArray();
            for (int i = 0; i < sifreDizi.length; i++) {
                int rastgeleIndex = random.nextInt(sifreDizi.length);
                char temp = sifreDizi[i];
                sifreDizi[i] = sifreDizi[rastgeleIndex];
                sifreDizi[rastgeleIndex] = temp;
            }

            return new String(sifreDizi);
        }
    }
/*
    //Telefon numarasi girici
    public class TelefonNumarasiDuzenleyici {

        public static void main(String[] args) {
            String telefonNumarasi = faker.phoneNumber().phoneNumber(); // Telefon numarasını buraya girin

            String duzenlenmisNumara = duzenleTelefonNumarasi(telefonNumarasi);
            System.out.println("Düzenlenmiş Telefon Numarası: " + duzenlenmisNumara);
        }

        public static String duzenleTelefonNumarasi(String numara) {
            // Telefon numarası 0 ile başlamıyorsa veya +49 ile başlamıyorsa düzenle
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

            return numara;

        }
    }

 */


}
