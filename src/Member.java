public class Member {
    private static final String NAMA_DEFAULT = "Member";
    private static final String NO_TELP_DEFAULT = "0812345678";
    private static final String TANGGAL_DAFTAR_DEFAULT = "01 Januari 2026";
    private static final String JENIS_PAKET_DEFAULT = "Basic";

    private static final int MIN_DIGIT_TELP = 10;

    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;

    public Member(String nama, String noTelepon, String tanggalDaftar, String jenisPaket){
        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }
    public Member(String nama, String noTelepon, String tanggalDaftar){
        this(nama, noTelepon, tanggalDaftar, "Basic");
    }
    public String getNama(){
        return this.nama;
    }
    public String getNoTelepon(){
        return this.noTelepon;
    }
    public String getTanggalDaftar(){
        return this.tanggalDaftar;
    }
    public String getJenisPaket(){
        return this.jenisPaket;
    }
    public void setNama(String nama){
        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama;
        }
        else {
            System.out.println("Nama tidak boleh kosong!!");
        }
    }
    public void setNoTelepon(String noTelepon){
        if (noTelepon != null && noTelepon.startsWith("0") && noTelepon.length() >= MIN_DIGIT_TELP){
            this.noTelepon = noTelepon;
        }
        else{
            System.out.println("No telepon harus dimulai dari angka 0, dan minimal 10 angka");
        }
    }
    public void setTanggalDaftar(String tanggalDaftar){
        if (tanggalDaftar != null && !tanggalDaftar.trim().isEmpty()) {
           this.tanggalDaftar = tanggalDaftar;
        }
        else{
            System.out.println("Silahkan masukkan tanggal daftar!!");
        }
    }
    public void setJenisPaket(String jenisPaket){
        if (jenisPaket != null && (jenisPaket.equalsIgnoreCase("Basic") || jenisPaket.equalsIgnoreCase("Premium") || jenisPaket.equalsIgnoreCase("VIP"))){
            this.jenisPaket = jenisPaket;
        }
    }
} 