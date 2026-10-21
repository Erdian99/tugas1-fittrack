public class Member {
    private final String NAMA_DEFAULT = "Member";
    private final String NO_TELP_DEFAULT = "0812345678";
    private final String TANGGAL_DAFTAR_DEFAULT = "01 Januari 2026";
    private final String JENIS_PAKET_DEFAULT = "Basic";

    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;

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


    void Member1(){
        if(nama == null){
            System.out.println(NAMA_DEFAULT);
        }
        else{
            System.out.println("Nama" + nama);
        }
        if(noTelepon == null){
            System.out.println(NO_TELP_DEFAULT);
        }
        else{
            System.out.println("No Telepon" + noTelepon);
        }
        if(tanggalDaftar == null){
            System.out.println(TANGGAL_DAFTAR_DEFAULT);
        }
        else{
            System.out.println("Tanggal Daftar" + nama);
        }
        if(jenisPaket == null){    
           System.out.println(JENIS_PAKET_DEFAULT);
        }
        else{ 
            System.out.println("Jenis Paket" + nama);
        }
    }
    
}

