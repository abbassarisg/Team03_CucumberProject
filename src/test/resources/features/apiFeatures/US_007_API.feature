Feature: alinan randevular API ile dogrulanabilmeli

  Scenario: guncel tarihli randevu kontrol edilmeli
    Given guncel tarihli endpoint olusturuldu
    Then get request and get response
    And status kod 200 olmali
    And hasta id 310169 olmali
    And sayfayi kapatir

  Scenario: ileri tarihli randevu kontrol edilmeli
    Given ileri tarihli endpoint olusturuldu
    Then get request and get response
    And status kod 200 olmali
    And hasta id 310169 olmali
    And sayfayi kapatir
