package Laporan6;

/**
 *
 * @author wahyuridiansyah
 */
public class Employee {

    private String nama, idKerja, jabatan, istri;
    public int masukKerja, anak;
    private double bonus, tunjanganKerja, tunjanganIstri, tunjanganAnak;
    public double gaji = 2500000;

    public Employee(String nama, String idKerja, String jabatan, int masukKerja, String istri, int anak) {
        this.nama = nama;
        this.idKerja = idKerja;
        this.jabatan = jabatan;
        this.masukKerja = masukKerja;
        this.istri = istri;
        this.anak = anak;
    }

    public String getNama() {
        return nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public String getIdKerja() {
        return idKerja;
    }

    public int getMasaKerja() {
        return 2016 - masukKerja;
    }

    public int getMasukKerja() {
        return masukKerja;
    }

    public String getIstri() {
        return istri;
    }

    public int getAnak() {
        return anak;
    }

    public double getGaji() {
        gaji = 2500000;
        return gaji;
    }

    public double bonus() {
        if (getMasaKerja() <= 5) {
            bonus = 0;
        } else if (getMasaKerja() > 5 && getMasaKerja() <= 10) {
            bonus = 0.05 * getGaji();
        } else {
            bonus = 0.1 * getGaji();
        }
        return bonus;
    }

    public double tunjangan() {
        if (getMasaKerja() <= 10) {
            tunjanganKerja = 0;
        } else {
            tunjanganKerja = 0.1 * getGaji();
        }
        return tunjanganKerja;
    }

    public double perolehan() {
        return getGaji() + bonus() + tunjangan();
    }

    public double tunjanganIstri() {
        if (getIstri().equalsIgnoreCase("Sudah")) {
            tunjanganIstri = 0.1 * perolehan();
        } else if (getIstri().equalsIgnoreCase("Belum")) {
            tunjanganIstri = 0;
        }
        return tunjanganIstri;
    }

    public double tunjanganAnak() {
        if (getAnak() <= 3) {
            tunjanganAnak = getAnak() * 0.15 * (perolehan() + tunjanganIstri());
        } else {
            tunjanganAnak = 3 * 0.15 * (perolehan() + tunjanganIstri());
        }
        return tunjanganAnak;
    }

    public double TotalPendapatan() {
        return perolehan() + tunjanganIstri() + tunjanganAnak();
    }
}
