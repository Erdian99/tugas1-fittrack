/**
 * Class utama untuk menguji skenario validasi sistem keanggotaan FitTrack.
 * 
 * @author Erdian Wijaya
 * @version 1.0
*/
public class TesFitTrack{
    public static void main(String []args){
        System.out.println("Sistem Keanggotaaan Gym FitTrack");

        // 1. Array bertipe Member dengan kapasitas 4 
        Member[] daftarMember = new Member[4];

        // 2. Mengisi array dengan objek (Paket berbeda dan constructor tanpa paket)
        daftarMember[0] = new Member("Budiono Siregar", "085211223344", "18 Oktober 2026", "Basic");
        daftarMember[1] = new Member("Reza Auditore", "0852100876", "09 Juni 2026", "Premium");
        daftarMember[2] = new Member("Sumanto", "0852765499", "31 Juli 2026", "VIP");
        // constructor tanpa paket (otomatis terisi jenis paket Basic)
        daftarMember[3] = new Member("Amba Tukam", "081122334455", " Oktober 2026");

        // 3. Menguji setter dengan nilai tidak valid
        daftarMember[2].setNoTelepon("62852765499");
        
        // 4. Mencetak seluruh data member dari array
        System.out.println("---Daftar Seluruh Member Gym---");
        for (int i = 0; i < daftarMember.length; i++){
            System.out.println(daftarMember[i]);
        }
    }
}