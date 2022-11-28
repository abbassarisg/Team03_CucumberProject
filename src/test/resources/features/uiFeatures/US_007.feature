# 1- Hasta sayfaya gider
# 2-Giriş' e tıklar
# 3-Hasta olarak kullanıcı bilgileri girilir
# 4- TekaraGiriş'e tıklar
# 5-Hasta bilgilerini ve telefonu girer ve tarih seçer
# 6-Send on appointment Request'e tıklar
# 7- Ekrand "Appointment registration saved!
# We will call you as soon as possible."
# ("Randevu kaydı kaydedildi! En kısa zamanda sizi arayacağız..")
# yazısını görür
@knn
Feature: US007 Medunna Exercises

  @knnPozitifTest01
  Scenario: TC001 Hastalar guncel tarih ile randevu oluşturabilmelidir.

    Given Hasta "medunnaUrl" sayfasına gider
    And Giriş' e tıklar
    Then kullanici 1 saniye bekler
    And Hasta olarak kullanıcı bilgileri girilir
    And TekrarGirişe tıklar
    And Hasta bilgilerini ve telefonu girer ve bugunun tarih seçer
    Then kullanici 1 saniye bekler
    And Send on appointment Request'e tıklar
    And Ekranda "Appointment registration saved! We will call you as soon as possible." ("Randevu kaydı kaydedildi! En kısa zamanda sizi arayacağız..") yazısını görür
  #Then Close the page

  @knnPozitifTest02
  Scenario: TC002 Hastalar gelecekteki tarih ile randevu oluşturabilmelidir.

    Given Hasta "medunnaUrl" sayfasına gider
    And Giriş' e tıklar
    Then kullanici 1 saniye bekler
    And Hasta olarak kullanıcı bilgileri girilir
    And TekrarGirişe tıklar
    And Hasta bilgilerini ve telefonu girer ve gelecek tarihi seçer
    Then kullanici 1 saniye bekler
    And Send on appointment Request'e tıklar
    And Ekranda "Appointment registration saved! We will call you as soon as possible." ("Randevu kaydı kaydedildi! En kısa zamanda sizi arayacağız..") yazısını görür
  #Then Close the page

  @knnPozitifTest03
  Scenario: TC003 Tarih sırası gun/ay/yıl (ay/gün/yıl) seklinde olmalıdır.
    Given Hasta "medunnaUrl" sayfasına gider
    And Giriş' e tıklar
    Then kullanici 1 saniye bekler
    And Hasta olarak kullanıcı bilgileri girilir
    And TekrarGirişe tıklar
    And Hasta bilgilerini ve telefonu girer ve gelecek tarihi seçer
    Then kullanici 3 saniye bekler
    And Tarihin gun-ay-yıl sekilde oldugu gorur
    #Then Close the page

  @knnNegatifTest01
  Scenario: TC004 Kullanıcı hatalı username giriş yapamamalı.

    Given Hasta "medunnaUrl" sayfasına gider
    And Giriş' e tıklar
    Then kullanici 1 saniye bekler
    And Hasta olarak yanlış username girilir
    And Ekranda Failed to sign in! Please check your credentials and try again.yazısını gorur

  @knnNegatifTest02
  Scenario: TC005 Kullanıcı hatalı password giriş yapamamalı.

    Given Hasta "medunnaUrl" sayfasına gider
    And Giriş' e tıklar
    Then kullanici 1 saniye bekler
    And Hasta olarak yanlış password girilir
    And Ekranda Failed to sign in! Please check your credentials and try again.yazısını gorur

  @knnNegatifTest03
  Scenario: TC006 Hastalar gecmis tarih ile randevu oluşturamamalı.

    Given Hasta "medunnaUrl" sayfasına gider
    And Giriş' e tıklar
    Then kullanici 1 saniye bekler
    And Hasta olarak kullanıcı bilgileri girilir
    And TekrarGirişe tıklar
    And Hasta bilgilerini ve telefonu girer ve dunun tarih seçer
    Then kullanici 1 saniye bekler
    And Send on appointment Request'e tıklar
    And Ekranda "Appointment date can not be past date!" yazısını görür
  #Then Close the page