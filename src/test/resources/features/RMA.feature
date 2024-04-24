@reklamation
  Feature: Rma sayfasi Testi
    Background: Siteye Giris
      Given Kullanici login sayfasina gider
      And Kullanici Login sayfasinda gecerli Admin Email i doldurur
      And Kullanici Login sayfasinda gecerli Admin Password u doldurur
      And Kullanici Anmelden butonuna tiklar
    Scenario: Rma Sayfasi
      When Kullanici Rma ikona tiklar
      And Kullanici gesendet radio butonunu secer
      And Kullanici Intern radio butonunu secer
      And Kullanici neue radio butonunu secer
      And Kullanici guncel tarihi secer
      And Kullanici rma tarihini secer
      And Kullanici rmaUhrzeit secer
      And Kullanici dropDown menuden bir Fahrer secer
      And Kullanici dropDown menuden bir Tour secer
      And Kullanici dropDown menuden bir Kundennummer secer
      And Kullanici dropDown menuden bir Kundenname secer
      And Kullanici dropDown menuden bir Kundenstraße secer
      And Kullanici dropDown menuden bir RMA secer
      And Kullanici dropDown menuden bir RMANotiz secer
      And Kullanici Rmanotiz2 alanina bir not yazar
      And Kullanici Zwischernspeichern butona tiklar
      And Kullanici Abschließen butona tiklar
      And Kullanici Laden butona tiklar



