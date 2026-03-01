# 🧼 Java Tabanlı Halı Yıkama Fabrikası Otomasyonu

Bu proje, Java programlama dili kullanılarak geliştirilmiş, **Nesne Yönelimli Programlama (OOP)** prensiplerini merkeze alan bir müşteri ve sipariş takip sistemidir.

## 🎯 Proje Özeti
Halı yıkama fabrikalarının günlük işleyişini dijitalleştirmek amacıyla tasarlanmıştır. Sistem üzerinden müşterilerin kayıtları tutulabilmekte, teslim alınan halıların türüne ve metrekaresine göre sipariş oluşturulabilmekte ve süreç takibi yapılabilmektedir.

## ⚙️ Teknik Altyapı ve Özellikler
* **Dil & Mimari:** Java (Standart Sürüm) kullanılarak, spagetti koddan uzak, nesne yönelimli (OOP) mimariyle geliştirildi.
* **Veritabanı Entegrasyonu:** Veri kalıcılığını sağlamak için **MySQL** veritabanı kullanıldı. JDBC sürücüsü ile bağlantı katmanı (DAO Pattern) oluşturuldu.
* **Modüller:**
  * Müşteri Kayıt ve Yönetim Modülü
  * Sipariş (Halı Türü, m² hesaplama, fiyatlandırma) Takip Sistemi
  * Durum Güncelleme (Alındı, Yıkanıyor, Teslim Edildi)

## 💻 Kurulum
1. `Database` klasöründeki `schema.sql` dosyasını MySQL çalışma ortamınızda (örn: phpMyAdmin veya MySQL Workbench) çalıştırın.
2. `DAO/DatabaseHelper.java` içerisindeki veritabanı bağlantı bilgilerini (`URL`, `USER`, `PASSWORD`) kendi yerel sunucunuza göre güncelleyin.
3. Projeyi bir Java IDE'si (Eclipse, IntelliJ IDEA) ile açarak derleyin.
