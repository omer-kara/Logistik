@carwash
Feature: Car_Wash sayfasi Testi
  Background: Siteye Giris
    Given Kullanici login sayfasina gider
    And Kullanici Login sayfasinda gecerli admin Email i doldurur
    And Kullanici Login sayfasinda gecerli admin Password u doldurur
    And Kullanici Anmelden butonuna tiklar

    Scenario: Car-Wash
      Given Kullanici sol pencereden Car_Washi tiklar
     # When Kullanici Pflegeübersicht basligini görür
      And Kullanici bir Datum secer
      And Kullanici Bir Fahrer secer
      And Kullanici Kennzeichnen secer
      And Reinigung checkbox tan Innenreinigung u secer
      And Reinigung checkbox tan Ofenreinigung u secer
      And Reinigung checkbox tan Außenreinigung u secer
      And Kullanici Zahlungsart radiobuttondan keine Zahlung secer
      And Kullanici Zahlungsart radiobuttondan Kartenzahlung secer
      And Kullanici Zahlungsart radiobuttondan Barzahlung secer
      And Kullanici bir Betrag secer
      And Kullanici Notiz yazar
      And Speichern button atiklar