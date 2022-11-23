
@US_005
Feature: US_005 hastalar hastahaneden randevu olusturabilmeli

  Background: ortak adimlar
    Given kullanici "medunnaUrl" anasayfasina gider
    When kullanici sayfada yer alan Make an Appointment butonuna tiklar

  @firstName1
  Scenario: TC01 kullanici "First Name" kismina herhangi bir karakter iceren deger yazmasi gerekir ve
            "First Name" kismi bos birakilamaz
    Then kullanici First Name kismina herhangi bir karakter girer
    And kullanici First Name kisminda herhangi bir karakter oldugunu dogrular
    And kullanici sayfayi kapatir

  @firstName2
  Scenario: TC02 kullanici "First Name" kismina herhangi bir karakter iceren deger yazmasi gerekir ve
            "First Name" kismi bos birakilamaz
    Then kullanici First Name kismini bos birakir
    And kullanici First Name kismini bos biraktiginda cikan uyari yazisini dogrular
    And kullanici sayfayi kapatir

  @lastName1
  Scenario: TC03 kullanici "Last Name" kismina herhangi bir karakter iceren deger yazmasi gerekir ve
            "Last Name" kismi bos birakilamaz
    Then kullanici Last Name kismina herhangi bir karakter girer
    And kullanici Last Name kisminda herhangi bir karakter oldugunu dogrular
    And kullanici sayfayi kapatir

  @lastName2
  Scenario: TC04 kullanici "Last Name" kismina herhangi bir karakter iceren deger yazmasi gerekir ve
            "Last Name" kismi bos birakilamaz
    Then kullanici Last Name kismini bos birakir
    And kullanici Last Name kismini bos biraktiginda cikan uyari yazisini dogrular
    And kullanici sayfayi kapatir






