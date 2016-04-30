package Laporan6;

/**
 *
 * @author wahyuridiansyah
 */
public class PegawaiTidakTetap extends Employee {

    private int jamLembur;
    private double pendapatanLembur;

    public PegawaiTidakTetap(String nama, String idKerja, String jabatan, int masukKerja, String istri, int anak, int jamLembur) {
        super(nama, idKerja, jabatan, masukKerja, istri, anak);
        this.jamLembur = jamLembur;
    }

    public double pendapatanLembur() {
        if (jamLembur > 10) {
            pendapatanLembur = (jamLembur - 10) * 10000;
        } else {
            pendapatanLembur = 0;
        }
        return pendapatanLembur;
    }

    @Override
    public double TotalPendapatan() {
        return getGaji() + pendapatanLembur();
    }

    public void info() {
        System.out.println("---------------------------------------------");
        System.out.println(" Hasil Rekapitulasi Data Pegawai Tidak Tetap ");
        System.out.println("---------------------------------------------");
        System.out.println("Nama        : " + super.getNama());
        System.out.println("ID Kerja    : " + super.getIdKerja());
        System.out.println("Gaji Lembur : " + "Rp" + pendapatanLembur());
        System.out.println("Total Gaji  : " + "Rp" + TotalPendapatan());
    }
}
