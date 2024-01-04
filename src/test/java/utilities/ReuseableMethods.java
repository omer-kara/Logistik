package utilities;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;


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
        cal.add(Calendar.MONTH, -1); // 1 ay öncesini almak için

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

    //istenilen uzunlukta bir şifre üret
    public static String generatePassword(int length) {
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

     String phoneNumber=   faker.instance().number().numberBetween(300, 899)
                + "-" + faker.instance().number().numberBetween(100, 999)
                + "-" + faker.instance().number().numberBetween(1000, 9999);
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





}
