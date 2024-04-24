@ausgaben
Feature: Ausgaben sayfasi Testi
  Background: Siteye Giris

    Given Kullanici login sayfasina gider
    And Kullanici Login sayfasinda gecerli Admin Email i doldurur
    And Kullanici Login sayfasinda gecerli Admin Password u doldurur

    And Kullanici Anmelden butonuna tiklar

  Scenario: Ausgaben
    Given Kullanici sol pencereden Ausgaben tiklar
    And Kullanici bir Datum1 secer
    And Kullanici bir Datum2 secer
    And Kullanici Zahlungsart auswahlen secer
    And Kullanici Bennunnung secer
    And Kullanici Ausgabenart auswahlen secer
    And Kullanici Verwendungsweck eingeben secer
    And Kullanici Fahrzeug secer
    And Kullanici Telefone secer
    And Kullanici Volumen secer
    And Kullanici Uhrzeit secer
    And Kullanici Belegbetragnetto yazar
    And Kullanici Eingeben a tiklar