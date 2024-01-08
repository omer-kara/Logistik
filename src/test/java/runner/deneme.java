package runner;

import java.security.SecureRandom;

public class deneme {
    public static void main(String[] args) {
        System.out.println(generatePassword(8));
    }


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
