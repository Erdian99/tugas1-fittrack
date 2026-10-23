public class TesFitTrack{
    public static void main(String []args){
        System.out.println("Sistem Keanggotaaan Gym FitTrack");
        Member member = new Member();

        member.setNama("Budiono Siregar");
        member.setNoTelepon("085211223344");
        member.setTanggalDaftar("18 Oktober 2026");
        member.setJenisPaket("Basic");

        System.out.println("Nama            :" + member.getNama());
        System.out.println("No Telepon      :" + member.getNoTelepon());
        System.out.println("Tanggal Daftar  :" + member.getTanggalDaftar());
        System.out.println("Jenis Paket     :" + member.getJenisPaket());
        
    }
}
