@login
Feature: Kayit Sayfasi

  Scenario: Kullanici bilgileri girerek kaydolur
    Given Kullanici login assassinate gider
    When Kullanici Registrierung butona tiklar
    And Kullanici Benutzer Name box a giris yapar
    And Kullanici Telefonnummer box a giris yapar
    And Kullanici Email Box a giris yapar
    And Kullanici Password Box agiris yapar
    And Kullanici AGB checkbox a tiklar
    And Kullanici Datenschutzbestimmungen checkbox a tiklar
    And Kullanici Senden button a tiklar
    And Kullanici Login sayfasinda gecerli Email i doldurur
    And Kullanici Login sayfasinda gecerli Password u doldurur
    And Kullanici Anmelden butonuna tiklar
    Then Kullanici Logistik Projesine Hosgeldiniz gorur