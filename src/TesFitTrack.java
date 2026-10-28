public class TesFitTrack{
    public static void main(String []args){
        System.out.println("Sistem Keanggotaaan Gym FitTrack");

        Member[] daftarMember = new Member[4];

        daftarMember[0] = new Member("Budiono Siregar", "085211223344", "18 Oktober 2026", "Basic");
        daftarMember[1] = new Member("Reza Auditore", "0852100876", "09 Juni 2026", "Premium");
        daftarMember[2] = new Member("Sumanto", "0852765499", "31 Juli 2026", "VIP");
        daftarMember[3] = new Member("Amba Tukam", "081122334455", " Oktober 2026");

        daftarMember[1].setNoTelepon("62852765499");

        for (int i = 0; i < daftarMember.length; i++){
            System.out.println(daftarMember[i]);
        }
    }
}
