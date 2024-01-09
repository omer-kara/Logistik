Feature: Leistung sayfasi Testi
Background: Siteye Giris
  Given Kullanici login sayfasina gelir
  When Kullanici admin olarak gecerli bir Email girer
  And Kullanici admin olarak gecerli bir sifre girer
  And Kullanici Anmelden butonuna tiklar

  Scenario: Fahrtype Regulärfahrt secimi
    Given Kullanici sol pencereden Leistung tiklar
    And Kullanici Leistungsübersicht basligini görür
    And Kullanici Fahrtype olarak Sonderfahrt secer
    And Kullanici Fahrtype olarak Beifahrer secer
    And Kullanici Fahrtype olarak Regulärfahrt secer
    And Kullanici bir tarih secer
    And Kullanici bir Fahrer secer
    And Kullanici bir Tour secer
    And Kullanici Fahrzeug secer
    And Kullanici bir Start-km secer
    And Kullanici bir End-km secer
    And Kullanici bir Star-zeit secer
    And Kullanici bir End-zeit secer
    And Kullanici Anzahl Tischgäste secer
    And Kullanici Kindergarten secer
    And Kullanici Tiefkühlmenü secer
    And Kullanici Menu-Anzahl secer
    And Kullanici Menufix secer
    And Kullanici Mikrowelle secer
    And Kullanici TK-Würfel secer
    And Kullanici Kundennummer secer
    And Kullanici bir Notiz yazar
    And Kullanici Abschließen buttona tiklar


