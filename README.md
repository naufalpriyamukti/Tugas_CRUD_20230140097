# 🚀 Aplikasi Manajemen Data KTP (CRUD)

Proyek ini adalah implementasi sistem *Client-Server* terpadu untuk melakukan operasi CRUD (Create, Read, Update, Delete) pada data Kartu Tanda Penduduk (KTP). Proyek ini dibangun menggunakan Spring Boot sebagai *backend* dan HTML/CSS/jQuery Ajax sebagai *frontend*.

---

## 🛠️ Teknologi yang Digunakan

* **Backend:** Java, Spring Boot, Spring Data JPA, Hibernate, Bean Validation
* **Database:** MySQL
* **Frontend:** HTML5, CSS3, JavaScript, jQuery (Ajax)
* **Build Tool:** Maven

---

## ⚙️ Persyaratan Sistem

Sebelum menjalankan aplikasi, pastikan sistem sudah terinstal:
1. Java Development Kit (JDK) 17 atau yang lebih baru.
2. MySQL Server (bisa menggunakan modul MySQL dari XAMPP).
3. IDE seperti IntelliJ IDEA, Eclipse, atau VS Code.

---

## 🚀 Cara Menjalankan Aplikasi

### 1. Konfigurasi Database
1. Buka XAMPP dan jalankan modul **MySQL**.
2. Akses `http://localhost/phpmyadmin` dan buat database baru dengan nama `spring`. (Tidak perlu membuat tabel secara manual).
3. Pastikan konfigurasi di `src/main/resources/application.properties` sudah sesuai:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/spring
   spring.datasource.username=root
   spring.datasource.password=
   spring.jpa.hibernate.ddl-auto=update

---

## 📸 Dokumentasi Screenshot & Uji API

Berikut adalah dokumentasi antarmuka website dan hasil pengujian REST API menggunakan **Postman**.

| Fitur / Endpoint | Deskripsi |
|---|---|---|
| **Tampilan Web** | Tampilan antarmuka Web Form dan Tabel Data KTP menggunakan HTML dan CSS. |
| **POST `/ktp`** | Pengujian API untuk menambahkan data KTP baru ke dalam database. | 
| **GET `/ktp`** | Pengujian API untuk mengambil dan menampilkan seluruh data KTP. | 
| **GET `/ktp/{id}`** | Pengujian API untuk mengambil detail data KTP berdasarkan ID spesifik. | 
| **PUT `/ktp/{id}`** | Pengujian API untuk memperbarui atau mengedit data KTP yang sudah ada. |
| **DELETE `/ktp/{id}`** | Pengujian API untuk menghapus data KTP dari database. | 

 | Screenshot |
 |---|
 | <img width="1919" height="1199" alt="Image" src="https://github.com/user-attachments/assets/06d59788-d5be-4303-94b4-abf3bd1a5761" /> |
 | <img width="1919" height="1198" alt="Image" src="https://github.com/user-attachments/assets/8d998ddc-586e-49c1-99e9-8a4e358db188" /> |
 | <img width="1919" height="1197" alt="Image" src="https://github.com/user-attachments/assets/3b4d0ab5-d902-4246-a43f-d03d0726f2ca" /> |
 | <img width="1919" height="1199" alt="Image" src="https://github.com/user-attachments/assets/fc17bc44-1c4e-4203-8e3b-bc9bc683baa3" /> |
 | <img width="1919" height="1198" alt="Image" src="https://github.com/user-attachments/assets/c1331bc6-30fd-4aba-8948-b17117553795" /> |
 | <img width="1919" height="1199" alt="Image" src="https://github.com/user-attachments/assets/79758725-3123-45c4-ac0b-fc74c016bf4f" /> |
