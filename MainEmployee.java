package Laporan6;

/**
 *
 * @author wahyuridiansyah
 */
import java.util.Scanner;

public class MainEmployee {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name, no, wife;
        int tahunKerja, anak, lembur;
        for (int jabatan = 1; jabatan <= 16; jabatan++) {
            System.out.println("---------------------------------------------");
            System.out.println("Program Perhitungan Gaji PT. Petrokimia Gresik");
            System.out.println("---------------------------------------------");
            System.out.println("[Code: 001] Manager");
            System.out.println("[Code: 002] Pegawai Tetap");
            System.out.println("[Code: 003] Pegawai Tidak Tetap");
            System.out.println("[Code: 004] Keluar dari program");
            System.out.println();
            System.out.print("Input Code: ");
            jabatan = in.nextInt();
            if (jabatan == 001) {
                System.out.print("Nama Anda : ");
                name = in.next();
                System.out.print("ID Anda : ");
                no = in.next();
                System.out.print("Sudah Menikah? (Sudah/Belum): ");
                wife = in.next();
                System.out.print("Jumlah Anak : ");
                anak = in.nextInt();
                System.out.print("Tahun Masuk Kerja : ");
                tahunKerja = in.nextInt();
                System.out.println();
                Manager manager = new Manager(name, no, "Manager", tahunKerja, wife, anak);
                manager.TotalPendapatan();
                manager.info();
            } else if (jabatan == 002) {
                System.out.print("Nama Anda : ");
                name = in.next();
                System.out.print("ID Anda : ");
                no = in.next();
                System.out.print("Sudah Menikah? (Sudah/Belum): ");
                wife = in.next();
                System.out.print("Jumlah Anak : ");
                anak = in.nextInt();
                System.out.print("Tahun Masuk Kerja : ");
                tahunKerja = in.nextInt();
                System.out.println();
                PegawaiTetap pTetap = new PegawaiTetap(name, no, "Pegawai Tetap", tahunKerja, wife, anak);
                pTetap.TotalPendapatan();
                pTetap.info();
            } else if (jabatan == 003) {
                System.out.print("Nama Anda : ");
                name = in.next();
                System.out.print("ID Anda : ");
                no = in.next();
                System.out.print("Sudah Menikah? (Sudah/Belum): ");
                wife = in.next();
                System.out.print("Jumlah Anak : ");
                anak = in.nextInt();
                System.out.print("Tahun Masuk Kerja : ");
                tahunKerja = in.nextInt();
                System.out.print("Jumlah Jam Kerja : ");
                lembur = in.nextInt();
                System.out.println();
                PegawaiTidakTetap pTidakTetap = new PegawaiTidakTetap(name, no, "Pegawai Tidak Tetap", tahunKerja, wife, anak, lembur);
                pTidakTetap.TotalPendapatan();
                pTidakTetap.info();
            } else {
                System.out.println("---------------------------------------------");
                System.out.println("Terima kasih telah menggunakan program ini.");
                System.out.println("---------------------------------------------");
                break;
            }
        }
    }
}
