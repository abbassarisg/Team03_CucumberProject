@TopluCalistir
Feature: US_010 doktor randevulari

  Background:Ortak stepler

    Given Doktor url gider
    And Doktor Kişi ikonuna  tıklar
    And  Doktor sign in buttonuna tıklar
    And  Doktor rolü ile geçerli username "lokman" girer
    And  Doktor rolü ile gecerli password "*Lokman?" girer
    And  Doktor Sign in tıklar
    And  Doktor My Pages buttonuna tıklar
    And  Doktor My Appointment buttonuna tıklar

  @Us_010_Tc_001
  Scenario: Doktor, randevu listesini ve zaman dilimlerini "My Appointments" sekmesinden görebilmelidir.

    Then Doktor Zaman araligini gorur.
    Then Doktor randevu olan aralikta bir tarih secer
    Then Doktor randevu listesini gorur.
    And  Doktor sayfasi kapatilir
  @Us_010_Tc_002
  Scenario: Zaman araligi max 15 gun secerek Doktor "patient id, start date, end date, status" bilgilerini görebilmeli

    Then Randevu olan aralikta max on bes gun aralikla tarih belirler
    Then Uzerine kayitli olan randevularin detaylarini gorebilir
    And Doktor sayfasi kapatilir
  @Us_010_Tc_003
  Scenario: Randevu olmayan bir aralik secildiginde Doktor "patient id, start date, end date, status" bilgilerini göremez
    Then randevu olmayan bir aralik girer
    Then secilen aralikta randevu yoksa no found appointment uyarisini gorur
    And Doktor sayfasi kapatilir

  @Us_010_Tc_004
Scenario: Zaman araligi 15 gunden fazla secilirse  Doktor "patient id, start date, end date, status" bilgilerini göremez
  Then Zaman araligini on bes gunden fazla secer
  Then Days between begin date and end date must be max 15 day uyarisini alir
  And Doktor sayfasi kapatilir


