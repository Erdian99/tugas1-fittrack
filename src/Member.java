public class Member{
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
        this.nama = nama;
    }
    public void setNoTelepon(String noTelepon){
        this.noTelepon = noTelepon;
    }
}
