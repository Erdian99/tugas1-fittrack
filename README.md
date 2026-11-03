# tugas1-fittrack
Nama: Erdian Wijaya

NPM : 250810701100068

### Deskripsi Singkat
Sistem Keanggotaan Gym FitTrack merupakan aplikasi berbasis pendataan berbasis Java yang dirancang untuk membantu pengelolaan data anggota gym secara digital. Aplikasi ini menyelesaikan permasalahan pencatatan manual pada buku tulis yang beresiko tercecer atau rusak. Fokus utama sistem ini terletak pada validasi data secara otomatis di mana setiap input profil anggota (seperti nomor telepon dan jenis paket) diverifikasi secara ketat sebelum disimpan guna mencegah kesalahan data operasional.


### Fitur Utama
* **Validasi Otomatis Data Member:** Memastikan nama dan tanggal pendaftaran tidak kosong, nomor telepon diawali dengan angka '0' dengan panjang minimal 10 digit, serta jenis paket sesuai pilihan resmi.
* **Perlindungan Data (Nilai Lama Dipertahankan):** Menolak pembaharuan data ketika pembentukan objek tidak sesuai ketentuan validasi tanpa menghapus atau merusak data awal yang valid. Misalnya nomor hp yang dimulai dengan angka '62' akan memicu error dan output tetap dengan nomor hp yang diawali dengan angka '0'.
* **Nilai Defaul Aman (Fallback System):** Mengisi atribut dengan nilai default jika terjadi kegagalan validasi saat pembentukan objek awal.
* **Pilihan Keanggotaan Otomatis:** Opsi pendaftaran cepat tanpa input jenis paket, secara otomatis menetapkan paket Basic.
* **Cetak Profil Terformat:** Menampilkan rangkuman seluruh informasi keanggotaan dalam format yang rapi dan mudah dibaca.
* **Sistem Penanggalan Terformat:** Tanggal pendaftaran di tetapkan menggunakan format "d MMMM yyyy", contoh: 31 Juli 2026. Penulisan tanggal dengan format berbeda pada setter akan di tolak dan mempertahankan nilai lama/default. Contoh format salah "15-10-2026".

## Konsep OOP yang Diterapkan

| Konsep OOP | Lokasi Penerapan | Alasan Pemilihan Konsep |
| :--- | :--- | :--- |
| **Encapsulation** | Seluruh atribut bersifat `private` pada class `Member` dengan *getter* dan *setter* `public`. | Melindungi atribut dari modifikasi langsung di luar kelas dan memusatkan kontrol validasi data. |
| **Constructor Overloading** | Dua constructor pada class `Member` (4 parameter dan 3 parameter). | Memberikan fleksibilitas pembuatan objek, baik dengan menentukan paket secara manual maupun menggunakan nilai *default*. |
| **Constructor Chaining** | `this(...)` pada constructor 3 parameter yang memanggil constructor 4 parameter. | Menerapkan prinsip DRY (*Don't Repeat Yourself*) agar inisialisasi paket default tidak ditulis berulang. |
| **Method Overriding** | Method `toString()` dari class `Object` yang di-override pada class `Member`. | Mengubah keluaran bawaan Java (referensi memori) menjadi tampilan teks profil member yang terstruktur dan berlabel. |
| **Abstraksi Konstanta** | Penggunaan `private static final` untuk nilai default dan batas digit. | Mencegah *magic numbers/strings* dan mempermudah pemeliharaan nilai batas di satu tempat. |

## Struktur Project
```text
tugas1-fittrack/
├── src/
│   ├── Member.java
│   └── TesFitTrack.java
├── .gitignore
└── README.md
```

## Prasyarat
* **Java Development Kit (JDK):** Versi 11 atau yang lebih baru (Disarankan JDK 17/21).
* **IDE yang Disarankan:** IntelliJ IDEA, Eclipse, atau Visual Studio Code.

## Cara Menjalankan Program

### Melalui IDE (IntelliJ IDEA)
1. Buka folder `tugas1-fittrack` di IntelliJ IDEA.
2. Pastikan SDK Java sudah terkonfigurasi.
3. Buka file `src/TesFitTrack.java`.
4. Klik tombol **Run** (ikon segitiga hijau) atau tekan `Shift + F10`.

### Melalui Command Line (Terminal/CMD)
1. Buka terminal dan arahkan ke direktori root project:
   ```bash
   cd path/to/tugas1-fittrack
   ```
2. Kompilasi seluruh berkas Java ke folder `bin` atau direktori saat ini:
   ```bash
   javac -d bin src/*.java
   ```
3. Jalankan program utama `TesFitTrack`:
   ```bash
   java -cp bin TesFitTrack
   ```

## Contoh Output

```text
Sistem Keanggotaaan Gym FitTrack
[ERROR]: Nomor telepon harus diawali angka 0, dan minimal 10 digit!
---Daftar Seluruh Member Gym---
Member Gym FitTrack:
 Nama            :Budiono Siregar
 No. Telepon     :085211223344
 Tanggal Daftar  :18 Oktober 2026
 Jenis Paket     :Basic
-----------------------------------
Member Gym FitTrack:
 Nama            :Reza Auditore
 No. Telepon     :0852100876
 Tanggal Daftar  :09 Juni 2026
 Jenis Paket     :Premium
-----------------------------------
Member Gym FitTrack:
 Nama            :Sumanto
 No. Telepon     :0852765499
 Tanggal Daftar  :31 Juli 2026
 Jenis Paket     :VIP
-----------------------------------
Member Gym FitTrack:
 Nama            :Amba Tukam
 No. Telepon     :081122334455
 Tanggal Daftar  : Oktober 2026
 Jenis Paket     :Basic
-----------------------------------
```
## Penjelasan Nilai Default

Ketika data yang dikirimkan pada saat pembentukan objek awal (melalui constructor) melanggar aturan validasi, sistem menggunakan nilai *default* berikut:

* **Nama (`NAMA_DEFAULT = "Member"`):** Digunakan jika nama diisi `null` atau spasi kosong agar nama anggota tetap teridentifikasi sebagai keanggotaan umum.
* **No. Telepon (`NO_TELP_DEFAULT = "0812345678"`):** Digunakan jika format nomor telepon salah saat pembuatan objek, sehingga terhindar dari nilai `null` dan sistem tetap menyimpan nomor sementara berkode area lokal yang valid.
* **Tanggal Daftar (`TANGGAL_DAFTAR_DEFAULT = "01 Januari 2026"`):** Digunakan jika tanggal pendaftaran kosong.
* **Jenis Paket (`JENIS_PAKET_DEFAULT = "Basic"`):** Digunakan ketika pilihan paket di luar *Basic*, *Premium*, atau *VIP*, atau ketika mendaftar menggunakan constructor tanpa paket.

---

## Batasan dan Pengembangan Lanjutan
* **Batasan Saat Ini:** Data member tersimpan sementara di memori (*volatile*) dan akan hilang begitu aplikasi dihentikan.
* **Pengembangan Lanjutan:** 
  1. Pengintegrasian sistem penyimpanan data permanen seperti database SQL/NoSQL atau penyimpanan berkas JSON/CSV.
  2. Penambahan fitur pencarian data member berdasarkan nama atau nomor telepon.
  3. Pembersihan input otomatis (misalnya mengonversi format nomor diawali `62` menjadi `0`).
