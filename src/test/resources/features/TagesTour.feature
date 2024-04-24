@tagesTour
Feature: TagesTour Testi
  Background: Siteye Giris
    Given Kullanici login sayfasina gider
    And Kullanici Login sayfasinda gecerli Admin Email i doldurur
    And Kullanici Login sayfasinda gecerli Admin Password u doldurur
    And Kullanici Anmelden butonuna tiklar

    Scenario: TagesTour
      Given Kullanici TagesTour ikonuna tiklar
      #And Kullanici DateiAuswählen butonuna tiklar
      #And Kullanici kayitli excel tablosunu yükler
      #And Kullanici DateiEinlesen butona tiklar
      #And Kullanici Hochladen butona tiklar
      #And Kullanici tablodan Ankunft altindaki ilk tik isaretine tiklar.
      #And Kullanici acilan tabloda secim yapar1
      #And Kullanici Speichern buttona tiklar1
      #Then Kullanici Status altinda "Lieferung erfolgreich, keine Besonderheiten" yazisinin görüldügünü dogrular

      #And Kullanici tablodan Ankunft altindaki ikinci tik isaretine tiklar.
      #And Kullanici acilan tabloda secim yapar2
      #And Kullanici Speichern buttona tiklar2
      #Then Kullanici "Lieferung erfolgreich, Menü vor Wohnungstür abgestellt" yazisinin görüldügünü dogrular

      #And Kullanici tablodan Ankunft altindaki ilk ucuncu isaretine tiklar.
      #And Kullanici acilan tabloda secim yapar3
      #And Kullanici Speichern buttona tiklar3
      #Then Kullanici "Lieferung nicht erfolgreich, Annahme verweigert" yazisinin görüldügünü dogrular

      #And Kullanici tablodan Ankunft altindaki ilk dördüncü isaretine tiklar.
      #And Kullanici acilan tabloda secim yapar4
      #And Kullanici Speichern buttona tiklar4
      #Then Kullanici "Lieferung nicht erfolgreich, TG nicht persönlich angetroffen" yazisinin görüldügünü dogrular

      #And Kullanici tablodan Ankunft altindaki besinci tik isaretine tiklar.
      #And Kullanici acilan tabloda secim yapar5
      #And Kullanici Speichern buttona tiklar5
      #Then Kullanici "TG gesundheitlich beeinträchtigt, Notfall" yazisinin görüldügünü dogrular
      #And Kullanici Zum Ziel den haritayi görmek icin navigasyon ikonuna tiklar
      #And Kullanici haritada teslimat yerinin görüldügünü Straße bilgisi ile dogrular