public class Kendaraan {
    String platNomor, tipe, merk;

    Kendaraan(String platNomor, String tipe, String merk) {
        this.platNomor = platNomor;
        this.tipe = tipe;
        this.merk = merk;
    }

    public void tampilkanInformasi() {
        System.out.println("Masukkan Plat Nomor: " + platNomor);
        System.out.println("Masukkan Jenis Kendaraan: " + tipe);
        System.out.println("Masukkan Merk: " + merk);
    }
}