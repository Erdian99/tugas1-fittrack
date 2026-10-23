public class Member {
    private static final String NAMA_DEFAULT = "Member";
    private static final String NO_TELP_DEFAULT = "0812345678";
    private static final String TANGGAL_DAFTAR_DEFAULT = "01 Januari 2026";
    private static final String JENIS_PAKET_DEFAULT = "Basic";

    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;

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
        if (noTelepon != null && noTelepon.startsWith("0") && noTelepon.length() >= 10){
            this.noTelepon = noTelepon;
        }
        else{
            this.noTelepon = NO_TELP_DEFAULT;
        }
    }
    public void setTanggalDaftar(String tanggalDaftar){
        if (tanggalDaftar == null) {
            System.out.println("Silahkan masukkan tanggal daftar!!");
        }
        else{
            this.tanggalDaftar = tanggalDaftar;
        }
    }
    public void setJenisPaket(String jenisPaket){
        if (jenisPaket != null && (jenisPaket.equalsIgnoreCase("Basic") || jenisPaket.equalsIgnoreCase("Premium") || jenisPaket.equalsIgnoreCase("VIP"))){
            this.jenisPaket = jenisPaket;
        }
        else{
            this.jenisPaket = JENIS_PAKET_DEFAULT;
        }
    }
} 