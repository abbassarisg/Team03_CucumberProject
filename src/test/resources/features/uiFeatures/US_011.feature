@US_011
Feature:US_011_"My Appointments" Physician (Doctor) tarafından düzenlenebilmeli


  Background: Ortak stepler

    Given  Kullanici doktor olarak "medunnaUrl" anasayfasina gider
    When Kullanicilar  butonuna tiklar
    And Sign in sekmesine tiklar


  @NegativeTest
  Scenario Outline: TC_002,TC_003,TC_004 NegativeTest

    And Kullanici username "<username>" girer
    And Gecerli password "<password>" girer
    And Sign in butonuna tiklar
    Then Kullanici doktor olarak doktor sayfasina giris yapilamadigini goruntuler

    Examples:
      | username      | password      |
      | DoktorDemir   | Abdullah.31   |
      | DoktorDemirr  | Abdullah.27   |
      | DoktorDemir12 | Abdullah.2731 |

  @PozitiveTest
  Scenario: TC_01 PozitiveTest
    And Kullanici username "DoktorDemir" girer
    And Gecerli password "Abdullah.27" girer
    And Sign in butonuna tiklar
    Then Kullanici doktor olarak doktor sayfasina giris yapildigini goruntuler

  @TC_005
  Scenario: TC_005 Appointment olusturma

    And Kullanici username "DoktorDemir" girer
    And Gecerli password "Abdullah.27" girer
    And Sign in butonuna tiklar
    And Make an Appointment linkine tiklar
    And Acilan sayfada hasta bilgilerini(username,lastnname,SSN,email,phone,Appointment DateTime) girer
    And Send an Appointment Request butonuna tiklar
    Then Randevu kaydinin olustugu bilgisini(Appointment Registrarion Save!) gorur


  @TC_006
  Scenario:TC_006 Doktor olarak var olan randevuyu duzenlemeli

    And Kullanici username "DoktorDemir" girer
    And Gecerli password "Abdullah.27" girer
    And Sign in butonuna tiklar
    And MY PAGES sekmesine tiklar
    And My Appointments sekmesine tiklar
    And Edit butonuna tiklar
    And Guncellemek istedigi alana gerekli bilgileri girer
    And Save butonuna tiklar
    Then Guncelleme gerceklesti mesajini (The Appointment is updated with identifier) goruntuler

  @TC_007
  Scenario: TC_007 kullanıcı (doktor), "id, start and end date, Status, physician and patient" bilgilerini gorebilmeli

    And Kullanici username "DoktorDemir" girer
    And Gecerli password "Abdullah.27" girer
    And Sign in butonuna tiklar
    And MY PAGES sekmesine tiklar
    And My Appointments sekmesine tiklar
    Then Randevu sayfasunda hastanin id, start and end date, Status, physician and patient bilgilerini goruntuler


  @TC_008
  Scenario: TC_008 Doktor "Anamnesis, Treatment ve Diagnosis" alanlarını doldurdugunda Appointment guncelleyebilme

    And Kullanici username "DoktorDemir" girer
    And Gecerli password "Abdullah.27" girer
    And Sign in butonuna tiklar
    And MY PAGES sekmesine tiklar
    And My Appointments sekmesine tiklar
    And Edit butonuna tiklar
    And Anamnesis, Treatment ve Diagnosis alanlarına bilgileri girer
    And Save butonuna tiklar
    Then Guncelleme gerceklesti mesajini (The Appointment is updated with identifier) goruntuler

  @TC_009
  Scenario: TC_009	Doktor "Anamnesis, Treatment ve Diagnosis" alanlarını bos biraktiginda Appointment guncelleyememe


    And Kullanici username "DoktorDemir" girer
    And Gecerli password "Abdullah.27" girer
    And Sign in butonuna tiklar
    And MY PAGES sekmesine tiklar
    And My Appointments sekmesine tiklar
    And Edit butonuna tiklar
    And Anamnesis, Treatment ve Diagnosis alanlarıni bos birakir
    And Save butonuna tiklar
    Then This field is required (Bu alan gereklidir) uyarisini gorur

  @TC_010
  Scenario: TC_010	Doktor "prescription ve description" alanlarini doldurdugunda Appointment guncelleyebilme

    And Kullanici username "DoktorDemir" girer
    And Gecerli password "Abdullah.27" girer
    And Sign in butonuna tiklar
    And MY PAGES sekmesine tiklar
    And My Appointments sekmesine tiklar
    And Edit butonuna tiklar
    And prescription ve description alanlarına bilgileri girer
    And Save butonuna tiklar
    Then Guncelleme gerceklesti mesajini (The Appointment is updated with identifier) goruntuler


  @TC_011
  Scenario: TC_011	Doktor "prescription ve description" alanlarini bos biraktiginda Appointment guncelleyebilme

    And Kullanici username "DoktorDemir" girer
    And Gecerli password "Abdullah.27" girer
    And Sign in butonuna tiklar
    And MY PAGES sekmesine tiklar
    And My Appointments sekmesine tiklar
    And Edit butonuna tiklar
    And prescription ve description alanlarıni bos birakir
    And Save butonuna tiklar
    Then Guncelleme gerceklesti mesajini (The Appointment is updated with identifier) goruntuler

  @TC_012
  Scenario: TC_012 "Status" doktor tarafından "PENDING" olarak seçebilme

    And Kullanici username "DoktorDemir" girer
    And Gecerli password "Abdullah.27" girer
    And Sign in butonuna tiklar
    And MY PAGES sekmesine tiklar
    And My Appointments sekmesine tiklar
    And Edit butonuna tiklar
    And PENDING secenegini secer


  @TC_013
  Scenario: TC_013 "Status" doktor tarafından "COMPLETED" olarak seçebilme

    And Kullanici username "DoktorDemir" girer
    And Gecerli password "Abdullah.27" girer
    And Sign in butonuna tiklar
    And MY PAGES sekmesine tiklar
    And My Appointments sekmesine tiklar
    And Edit butonuna tiklar
    And COMPLETED secenegini secer


  @TC_014
  Scenario: TC_014 "Status" doktor tarafından "CANCELLED" olarak seçebilme

    And Kullanici username "DoktorDemir" girer
    And Gecerli password "Abdullah.27" girer
    And Sign in butonuna tiklar
    And MY PAGES sekmesine tiklar
    And My Appointments sekmesine tiklar
    And Edit butonuna tiklar
    And CANCELLED secenegini secer







































































