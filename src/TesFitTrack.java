public class TesFitTrack{
    public static void main(String []args){
        System.out.println("Sistem Keanggotaaan Gym FitTrack");
        Member member1 = new Member();
        Member member2 = new Member();
        Member member3 = new Member();

        
        member1.setNama("Budiono Siregar");
        member1.setNoTelepon("085211223344");
        member1.setTanggalDaftar("18 Oktober 2026");
        member1.setJenisPaket("Basic");

        System.out.println("Nama            :" + member1.getNama());
        System.out.println("No Telepon      :" + member1.getNoTelepon());
        System.out.println("Tanggal Daftar  :" + member1.getTanggalDaftar());
        System.out.println("Jenis Paket     :" + member1.getJenisPaket());

        member2.setNama("Reza Auditore");
        member2.setNoTelepon("0852100876");
        member2.setTanggalDaftar("09 Juni 2026");
        member2.setJenisPaket("Premium");

        System.out.println("Nama            :" + member2.getNama());
        System.out.println("No Telepon      :" + member2.getNoTelepon());
        System.out.println("Tanggal Daftar  :" + member2.getTanggalDaftar());
        System.out.println("Jenis Paket     :" + member2.getJenisPaket());

        member3.setNama("Sumanto");
        member3.setNoTelepon("0852765499");
        member3.setTanggalDaftar("31 Juli 2026");
        member3.setJenisPaket("VIP");

        System.out.println("Nama            :" + member3.getNama());
        System.out.println("No Telepon      :" + member3.getNoTelepon());
        System.out.println("Tanggal Daftar  :" + member3.getTanggalDaftar());
        System.out.println("Jenis Paket     :" + member3.getJenisPaket());
    }
}
