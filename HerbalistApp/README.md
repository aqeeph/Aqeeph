# PROGRAMCI KATALOĞU

1.1 Gerçekleştirilen Platform ve Dil (Java,Eclipse?) ve Sürüm Adı

Gerçekleştirilen Platform: Papyrus
Dil: Java
Version: 2020-06 (4.16)
Build id: 2020-08-23T18:42:39Z
Proje türü: Maven
Proje Adı: Herbalist
1.2 Problemin Kısa Tanımı

Günümüzde birçok hastalık mevcut ve de bu hastalıklara iyi gelebilecek çesitli bitkiler var.

Bunların ilişkili olduğu bir meslek var:Aktarcılık.

Aktarların ve de Müşterilerinin işlerini kolaylaştırabilecek bir programın hazırlanmak istiyorum.

Program içeriği olarak yapılmak istenenler :

Hangi bitkinin hangi hastalığa iyi gelebileceğine dair ve de satış veya sipariş işlemleri için ürün miktarını da beraberinde bilgileri tutan bitki.txt dosyasını oluşturmak.

Hastalıklar hakkında bilgi ve de hastalığa iyi gelebilecek bitki adlarını tutan hastalık.txt dosyasını oluşturmak.

Bitkilerin türlerini belirtip ona göre daha kolay ürün satış işlemleri yapılabilinmesi için kategori.txt dosyasını oluşturmak.

Dosyadaki verilerin okunup listelenebilmesi.

Dosyadaki verilere yenilerinin eklenebilmesi.

Dosyadaki verilerin düzenlenebilmesi.

Arama ve ekleme işlemlerinin kolay yapılabilinmesi için çesitli veri yapılarının kullanılması.

İsteğe bağlı görsellik vb. program geliştirici eklemeler.

1.3 Kullanılan Sınıfların ve Metotlarının Kısa Açıklamaları

Paketler

Ağaç Paketi

Ağaçlar Paketi

Dert Paketi

Deva Paketi

Hash_table Paketi

Test Paketi

Veritabanı Paketi

Dosyalar

Ağaç Paketi

Ağaç.java

Node.java

Ağaçlar Paketi

Vector_Ağaç.java

Dert Paketi

Hastalık.java

Deva Paketi

Bitki.java

Kategori.java

Hash_table Paketi

Hash_Table.java

Test Paketi

Herbalist_App.java

******Test Paketi (Metotları Deneme Amaçlı Oluşturulmuş Sınıflar)********

Test_Agac.java
Test_Bitki.java
Test_Hastalik.java
Test_Kategori.java
Test.java
Ürün_Arama.java
*********************************
Herbalist_App.java
Oluşturulmuş olan veri yapılarından nesneler oluşturup metotlarını görsel eklentiler yardımı ile çalistiran arayüz ve de main sınıf.

Arayüzde kullanılan her bir buton bulunduğu yere göre özel bir metottur.

Mainde dosyalardan bilgileri okuyup veri yapılarına aktarma yapan ve de güncelleme yapmayı sağlayan metotlar vardır.
*********************************
Veritabanı Paketi

Kategori_veri_tabanı.java
bitki_kategorilerini_oku.java
Bitki_veri_tabani.java
bitki_verilerini_oku.java
Hastalik_veri_tabani.java
hastalik_verilerini_oku.java

Dosyalar

bitki.txt
hastalik.txt
kategori.txt

Ağaç Paketi

Ağaç.java

Ağaç veri yapısını oluşturmak için Node sınıfından yararlanılarak oluşturulmuş bir sınıf.

Arama ,listeleme(inorder preorder post order) ,silme ve ekleme metotları bulunmaktadır.

Node.java

Ağaç veri yapısını oluşturmak için gerekli bir nesne sınıfı.

İçerisinde Bitki Nesnesi Bulundurduğu için taşiyıcı bir nesne grubu da denebilir.

Yazdırma,minimum değer buldurma ve silme metotları bulunmaktadır.

Ağaçlar Paketi

Vector_Ağaç.java

Birden fazla ağaç veri yapısını bir arada tutan nesne sınıfı.Ağaçlarda arama metodu bulunmaktadır.

Dert Paketi

Hastalık.java

Hastalık ile ilgili bilgileri ve de faydalı olabilecek bitki isimleri listesi içeren sınıf.

Hastalığa ait bilgi ekleme,çikarma ve yazdırma yapan metotları içermektedir.

Deva Paketi

Bitki.java

Bitki ile ilgili bilgileri ve yararlı olabileceği hastalıkların isimlerinin listesini içeren sınıf.

Bitki bilgilerini yazdırma ve düzenleme yapan ayrıca kategorisini bulduran metotlar bulunmaktadır.

Kategori.java

Bitki kategorilerini vektörde tutan nesne sınıfı.

Kategori bilgilerini düzenleyen ve de yazdıran metotlar bulunmaktadır.

Hash_table Paketi

Hash_Table.java

Hastalık nesnelerini hastalığın adına göre hash tabloda tutan veri yapısını oluşturan sınıf.

Hash tabloda hastalık adına göre arama yapan metot ve de hastalık bilgilerini yazdıran metot bulunmaktadır.


******Metotları Deneme Amaçlı Oluşturulmuş Sınıflar********

Programın yapım aşamasında çikti kontrolü için bazı sınıflar oluşturulmuştur.

Genelde metot içermezler.

Test_Ağaç.java

Test_Bitki.java

Test_Hastalık.java

Test_Kategori.java

Test.java

Ürün_Arama.java

Veritabanı Paketi

Kategori_veri_tabanı.java

Kategori veri tabanını oluşturan sınıf.

bitki_kategorilerini_oku.java

Kullanılan metotlar

Kategori.txt dosyasından okuma işlemleri yapan sınıf.

Bitki_veri_tabanı.java

Kullanılan metotlar

Bitki veri tabanını oluşturan sınıf.

bitki_verilerini_oku.java

Kullanılan metotlar

Bitki.txt dosyasından okuma işlemleri yapan sınıf.

Hastalık_veri_tabanı.java

Kullanılan metotlar

Hastalık veri tabanını oluşturan sınıf.

hastalık_verilerini_oku.java

Kullanılan metotlar

Hastalık.txt dosyasından okuma işlemleri yapan sınıf.

 

1.4 Kullanılan Veri Yapıları ve Kısa Açıklamaları

Hash table

Verilere hash uygulayarak kaydedeceği yeri belirler.

İki değer alır key and value (K,V).Örnegin ; (“46” “Maraş”) , (“one” “1”)

Vector

Diziler gibi davranır.Boyutu değişkendir.Nesne türleri için özellestirilebilir.

Ağaç

Verilerin aranması ,eklenmesi ve belirli düzenlere göre listelenmesi işlemlerinde kolaylık sağlar.

1.5 Kullanılan dosyaların özellikleri ve kısa açıklamaları

Dosyalar

bitki.txt

Dosyada bitkilere ilişkin bilgiler bulunmaktadır.

(dosyadaki hali)

(Bitki adı#kategori numarası( “ID“ )# bitkinin latince ismi#bitkinin özellikleri( “_ “ ile birbirlerinden ayrılıdır )#paket sayısı#fiyatı# bitki resminin diskteki yeri#bitki resminin diskteki adı# bilgi sayısı (önerilen hastalıklar için)#önerilen hastalıklar ( “>>” ile birbirlerinden ayrılıdır) )

hastalık.txt

Dosyada hastalıklara ilişkin bilgiler bulunmaktadır.

(dosyadaki hali)

(Hastalık adı#belirtileri( “_” ile tutuluyor )#nedenleri( “_” ile tutuluyor )#tedavisi( “_” ile tutuluyor ) #bilgi_sayısı>>önerilen bitkiler(“>>” ile tutuluyor))

kategori.txt

Dosyada kategorilere ilişkin bilgiler bulunmaktadır.

(dosyadaki hali)

(kategori numarası( “ID“ (otomatik artan sayı(“0” dan başlar)))#kategorinin adı)

2.2 Kullanıcı Klavuzu

Program çalistirildiginda bir ara yüz ile çarsilasirsiniz.

Ara yüzde menüler arasında gezinerek kolayca işlemler yapabilirsiniz.

Müşteri ve Personel Menüsü programın hızlıca oluşturulmasından ve de şifre ile giriş işlemlerinin eklenmemesinden dolayı herkes tarafından kısıtlanmaksızın kullanılabiliyor.

2.3 Programın Kısıtlamaları

Ekleme işlemleri için daha önceden var olmama şartı aramaktadır.

Silme istemleri için veri tabanlarında aranıp bulunması şartı vardır.

Olmayan veri silinemez, düzenlenemez.

Fiyat aralığı belirtirken pozitif sayı kullanılmalı.

Max fiyat aralığı min fiyat aralığına eşit yada min fiyat aralığından daha büyük olmalı.

Ekleme işlemi yapıldığında program verinin eklendiğini belirtir ve ilk başta engeller.
