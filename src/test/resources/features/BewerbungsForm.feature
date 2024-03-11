Feature: BewerbungsForm sayfasi Testi
  Background: Siteye Giris
    Given Kullanici login sayfasina gider
 Scenario: BewerbunsFormGiris
   When Bewerbungsform a tiklar
   And Vorname alanina giris yapar
   And Nachname alanina giris yapar
   And Email alanina giris yapar
   And Telefon alanina giris yapar
   And Straße HausNr alanina giris yapar
   And PLZ alanina giris yapar
   And Wohnort alanina giris yapar
   And Geburtsdatum alanina giris yapar
   And Geschlecht määnlich  radio buttonu tiklar
   And Geschlecht weiblich  radio buttonu tiklar
   And Geschlecht diverse  radio buttonu tiklar
   And Führerscheinklasse dropdown dan bir option secer
   And Startwunsch alanina bir tarih girer
   And Wochenarbeitstage alanindan Mo radiobutonunu secer
   And Wochenarbeitstage alanindan Di radiobutonunu secer
   And Wochenarbeitstage alanindan Mi radiobutonunu secer
   And Wochenarbeitstage alanindan Do radiobutonunu secer
   And Wochenarbeitstage alanindan Fr radiobutonunu secer
   And Wochenarbeitstage alanindan Sa radiobutonunu secer
   And Wochenarbeitstage alanindan So radiobutonunu secer
   And Beschäftigunsart alanindan Aushilfe radio butonu tiklar
   And Beschäftigunsart alanindan Teilzeit radio butonu tiklar
   And Beschäftigunsart alanindan Vollzeit radio butonu tiklar
   And Schwerbehinder alaninda Ja radiobutonu tiklar
   And Schwerbehinder alanina bir not girer
   And Schwerbehinder alaninda Nein radiobutonu tiklar
   And Notizen alanina bir not girer
   And Senden butonuna tiklanir









