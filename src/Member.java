/*
* Sistem keanggotaan Gym Fittrack
* Class Member merepresentasikan data anggota gym.
* Class ini menyimpan informasi profil dasar dan tipe paket keanggotaan
*
* @author Erdian Wijaya
* @version 1.0
*/
public class Member {

    /** Nilai default untuk nama, no telp, tanggal daftar, dan jenis paket. */
    private static final String NAMA_DEFAULT = "Member";
    private static final String NO_TELP_DEFAULT = "0812345678";
    private static final String TANGGAL_DAFTAR_DEFAULT = "01 Januari 2026";
    private static final String JENIS_PAKET_DEFAULT = "Basic";

    /** Batas minimal digit nomor telepon. */
    private static final int MIN_DIGIT_TELP = 10;

    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;
    
    private String errorNoTelepon = "";
    /** Membuat objek {@code Member} baru dengan menentukan seluruh atribut secara spesifik.
     * 
     * @param nama              Nama lengkap anggota (tidak boleh kosong atau hanya spasi saja)
     * @param noTelepon         Nomor telepon (harus diawali '0' dan minimal 10 digit)
     * @param tanggalDaftar     Tanggal pendaftaran anggota
     * @param jenisPaket        Jenis paket keanggotaan (Basic, Premium, atau VIP)
     */
    public Member(String nama, String noTelepon, String tanggalDaftar, String jenisPaket){
        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }
    /**
     * Membuat objek baru tanpa jenis paket, sehingga menampilkan nilai defaultnya (Basic).
     * 
     * @param nama          Nama lengkap anggota
     * @param noTelepon     Nomor telepon
     * @param tanggalDaftar Tanggal pendaftaran
     */
    public Member(String nama, String noTelepon, String tanggalDaftar){
        this(nama, noTelepon, tanggalDaftar, "Basic");
    }
    /**
     * Constructor default yang mengisi seluruh atribut dengan nilai defaul yang aman.
     */
    public Member(){
        this(NAMA_DEFAULT, NO_TELP_DEFAULT, TANGGAL_DAFTAR_DEFAULT, JENIS_PAKET_DEFAULT);
    }
    /**
     * Mengambil nama anggota.
     * 
     * @return Nama Anggota 
     */
    public String getNama(){
        return this.nama;
    }
    /**
     * Mengambil nomor telepon anggota.
     * 
     * @return Nomor telepon anggota
     */
    public String getNoTelepon(){
        return this.noTelepon;
    }
    /**
     * Mengambil tanggal pendaftaran anggota.
     * 
     * @return Tanggal pendaftaran anggota
     */
    public String getTanggalDaftar(){
        return this.tanggalDaftar;
    }
    /**
     * Mengambil jenis paket keanggotaan.
     * 
     * @return Jenis paket keanggotaan 
     */
    public String getJenisPaket(){
        return this.jenisPaket;
    }
    /**
     * Menetapkan nama anggota.
     * Validasi memastikan nama tidak {@code null} dan tidak hanya berisi spasi kosong.
     * 
     * @param nama Nama baru yang akan ditetapkan
     */
    public void setNama(String nama){
        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama;
        }
        else {
            System.out.println("Nama tidak boleh kosong!!");
        }
    }
    /**
     * Menetapkan nomor telepon anggota
     * Validasi memastikan nomor telepon tidak {@code null}, diawali dengan digit '0' dan minimal 10 digit .
     * 
     * @param noTelepon Nomor telepon baru yang akan ditetapkan
     */
    public void setNoTelepon(String noTelepon){
        if (noTelepon != null && noTelepon.startsWith("0") && noTelepon.length() >= MIN_DIGIT_TELP){
            this.noTelepon = noTelepon;
            this.errorNoTelepon = "";
        }
        else{
            this.errorNoTelepon = "[No telepon harus diawali angka 0, dan minimal 10 digit]";
        }
    }
    /**
     * Menetapkan tanggal pendaftaran anggota.
     * Validasi memastikan tanggal pendaftaran tidak {@code null} dan tidak kosong.
     * 
     * @param tanggalDaftar Tanggal pendaftaran baru yang akan ditetapkan
     */
    public void setTanggalDaftar(String tanggalDaftar){
        if (tanggalDaftar != null && !tanggalDaftar.trim().isEmpty()) {
           this.tanggalDaftar = tanggalDaftar;
        }
        else{
            System.out.println("Silahkan masukkan tanggal daftar!!");
        }
    }
    /**
     * Menetapkan jenis paket keanggotaan.
     * Validasi memastikan jenis paket hanya diisi nilai "Basic", "Premium", atau "VIP" (case-sensitive).
     * 
     * @param jenisPaket Jenis paket baru yang akan dipilih
     */
    public void setJenisPaket(String jenisPaket){
        if (jenisPaket != null && (jenisPaket.equalsIgnoreCase("Basic") || jenisPaket.equalsIgnoreCase("Premium") || jenisPaket.equalsIgnoreCase("VIP"))){
            this.jenisPaket = jenisPaket;
        }
    }
    /**
     * Mengembalikan bentuk string terformat dari data keanggotaan Gym Fittrack. 
     * 
     * @return String berupa rangkuman data anggota
     */
    @Override 
    public String toString(){
        String output = "Member Gym FitTrack:" +
                        "\n Nama            :" + this.nama +
                        "\n No. Telepon     :" + this.noTelepon +
                        "\n Tanggal Daftar  :" + this.tanggalDaftar +
                        "\n Jenis Paket     :" + this.jenisPaket +
                        "\n-----------------------------------";
        if (!this.errorNoTelepon.isEmpty()){
            output += "\n[Error]: " + this.errorNoTelepon + "\n-----------------------------------";
        }
    
        return output;
    }
}