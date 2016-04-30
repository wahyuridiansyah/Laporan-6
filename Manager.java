package Laporan6;

/**
 *
 * @author wahyuridiansyah
 */
public class Manager extends Employee {

    private double tunjanganJabatan;

    public Manager(String nama, String idKerja, String jabatan, int masukKerja, String istri, int anak) {
        super(nama, idKerja, jabatan, masukKerja, istri, anak);
    }

    public double tunjanganJabatan() {
        tunjanganJabatan = 0.1 * (perolehan() + tunjanganIstri() + tunjanganAnak());
        return tunjanganJabatan;
    }

    @Override
    public double TotalPendapatan() {
        return perolehan() + tunjanganAnak() + tunjanganIstri() + tunjanganJabatan();
    }

    public void info() {
        System.out.println("---------------------------------------------");
        System.out.println("      Hasil Rekapitulasi Data Manager");
        System.out.println("---------------------------------------------");
        System.out.println("Nama                : " + super.getNama());
        System.out.println("ID Karyawan         : " + super.getIdKerja());
        System.out.println("Gaji                : " + "Rp" + super.getGaji());
        System.out.println("Tunjangan Kerja     : " + "Rp" + super.tunjangan());
        System.out.println("Tunjangan Istri     : " + "Rp" + super.tunjanganIstri());
        System.out.println("Tunjangan Anak      : " + "Rp" + super.tunjanganAnak());
        System.out.println("Tunjangan Jabatan   : " + "Rp" + tunjanganJabatan());
        System.out.println("Bonus               : " + "Rp" + super.bonus());
        System.out.println("Total Pendapatan    : " + "Rp" + TotalPendapatan());
    }
}
