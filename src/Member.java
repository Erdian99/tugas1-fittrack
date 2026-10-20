public class Member{
    private String nama = "Supri";
    private String noTelepon = "0812345678";
    private String tanggalDaftar = "1 Januari 2026";
    private String jenisPaket = "VIP";

    public String getNama(){
        return this.nama;
    }
    public void setNama(String nama){   
        this.nama = nama;
    }
    public String getNoTelepon(){
        return this.noTelepon;
    }
    public void setNoTelepon(String noTelepon){
        this.noTelepon = noTelepon;
    }
    public String getTanggalDaftar(){
        return this.tanggalDaftar;
    }
    public void setTanggalDaftar(String tanggalDaftar){
        this.tanggalDaftar = tanggalDaftar;
    }
    public String getJenisPaket(){
        return this.jenisPaket;
    }
    public void setJenisPaket(String jenisPaket){
        this.jenisPaket = jenisPaket;
    }
    void nama() {
        System.out.println("Masukkan Nama Anda: ");
    }
    void noTelepon() {
        System.out.println("Masukkan No Telepon Anda: ");
    }
    void tanggalDaftar() {
        System.out.println("Tanggal Daftar Anda: ");
    }
    void jenisPaket() {
        System.out.println("Pilih Jenis Paket Yang Di Inginkan: ");
    }
    
}
