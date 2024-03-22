abstract class Suku {
    String nama;
    double jumlahPopulasi;

    Suku(String nama, double jumlahPopulasi) {
        this.nama = nama;
        this.jumlahPopulasi = jumlahPopulasi;
    }

    abstract public double hitungPersentasePopulasi();

    public String toString() {
        return "Nama Suku\t\t: " + nama + "\nJumlah Populasi\t: " + jumlahPopulasi;
    }
}

class SukuTerpencil extends Suku {
    double luasWilayah;

    SukuTerpencil(String nama, double jumlahPopulasi, double luasWilayah) {
        super(nama, jumlahPopulasi);
        this.luasWilayah = luasWilayah;
    }

    @Override
    public double hitungPersentasePopulasi() {
        return (this.jumlahPopulasi / 270_000_000) * 100; // Angka 270 juta adalah jumlah penduduk Indonesia
    }
}

class SukuUrban extends Suku {
    String kota;

    SukuUrban(String nama, double jumlahPopulasi, String kota) {
        super(nama, jumlahPopulasi);
        this.kota = kota;
    }

    @Override
    public double hitungPersentasePopulasi() {
        return (this.jumlahPopulasi / 270_000_000) * 100; // Angka 270 juta adalah jumlah penduduk Indonesia
    }
}

public class Etnis {
    public static void main(String[] args) {
        Suku sukuTerpencil = new SukuTerpencil("Suku Anak Dalam", 5000, 100);
        Suku sukuUrban = new SukuUrban("Suku Jawa", 150_000_000, "Jakarta");

        System.out.println(sukuTerpencil.toString());
        System.out.println(sukuUrban.toString());

        System.out.println("Persentase Populasi Suku Terpencil: " + sukuTerpencil.hitungPersentasePopulasi() + "%");
        System.out.println("Persentase Populasi Suku Urban: " + sukuUrban.hitungPersentasePopulasi() + "%");
    }
}