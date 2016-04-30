package Laporan6;

/**
 *
 * @author wahyuridiansyah
 */
public class PegawaiTetap extends Employee {

    public PegawaiTetap(String nama, String idKerja, String jabatan, int masukKerja, String istri, int anak) {
        super(nama, idKerja, jabatan, masukKerja, istri, anak);
    }

    public void info() {
        System.out.println("---------------------------------------------");
        System.out.println("    Hasil Rekapitulasi Data Pegawai Tetap    ");
        System.out.println("---------------------------------------------");
        System.out.println("Nama                : " + super.getNama());
        System.out.println("ID Karyawan         : " + super.getIdKerja());
        System.out.println("Gaji  (Rp)          : " + "Rp" + super.getGaji());
        System.out.println("Tunjangan Kerja     : " + "Rp" + super.tunjangan());
        System.out.println("Tunjangan Istri     : " + "Rp" + super.tunjanganIstri());
        System.out.println("Tunjangan Anak      : " + "Rp" + super.tunjanganAnak());
        System.out.println("Bonus (Rp)          : " + "Rp" + super.bonus());
        System.out.println("Total Pendapatan    : " + "Rp" + TotalPendapatan());
    }
}
