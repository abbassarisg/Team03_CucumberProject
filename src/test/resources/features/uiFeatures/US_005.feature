
@US_005_UI
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

  @email1
  Scenario: TC05 kullanici "Email" kismina bir email adresi girer ve "Email" kismi bos birakilamaz.
    Then kullanici Email kismina bir email adresi girer
    And kullanici Email kisminda bir email adresi oldugunu dogrular
    And kullanici sayfayi kapatir

  @email2
  Scenario: TC06 kullanici "Email" kismina bir email adresi girer ve "Email" kismi bos birakilamaz.
    Then kullanici Email kismini bos birakir
    And kullanici Email kismini bos biraktiginda cikan uyari yazisini dogrular
    And kullanici sayfayi kapatir

  @ssn1
  Scenario: TC07 kullanici 3. ve 5. rakamdan sonra "-" iceren ve 9 rakamdan olusan bir numara girmesi gerekir ve
  "SSN" kismi bos birakilamaz
    Then kullanici SSN kismina uc ve bes rakamindan sonra - iceren ve dokuz rakamdan olusan bir numara girer
    And kullanici SSN kisminda uc ve bes rakamindan sonra - iceren ve dokuz rakamdan olusan bir numara oldugunu dogrular
    And kullanici sayfayi kapatir

  @ssn2
  Scenario: TC08 kullanici 3. ve 5. rakamdan sonra "-" iceren ve 9 rakamdan olusan bir numara girmesi gerekir ve
  "SSN" kismi bos birakilamaz
    Then kullanici SSN kismini bos birakir
    And kullanici SSN kismini bos biraktiginda cikan uyari yazisini dogrular
    And kullanici sayfayi kapatir

  @register
  Scenario: TC09 kullanici randevu alip kaydoldugunda, profillerini gorebilir ve uygulamada oturum acabilir
    Then kullanici sayfada sag ustte bulunan kisi ikonuna gelir ve register sekmesine tiklar
    And kullanici 2 saniye bekler
    And kullanici SSN kismina randevu alirken girdigi "ssn" numarasini girer
    And kullanici 2 saniye bekler
    And kullanici First Name kismina randevu alirken girdigi "firstName" ismini girer
    And kullanici 2 saniye bekler
    And kullanici Last Name kismina randevu alirken girdigi "lastName" ismini girer
    And kullanici 2 saniye bekler
    And kullanici Username kismina bir "userName" girer
    And kullanici 2 saniye bekler
    And kullanici Email kismina randevu alirken girdigi "email" adresini girer
    And kullanici 2 saniye bekler
    And kullanici New Password kismina bir "password1" girer
    And kullanici 2 saniye bekler
    And kullanici New Password confirmation kismina tekrar "password1" girer
    And kullanici 2 saniye bekler
    And kullanici Register butonuna tiklar
    And kullanici uygulamada oturum acmak icin sisteme kaydoldugunu dogrular
    And kullanici sayfayi kapatir















