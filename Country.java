class Negara {
    private String namaNegara;
    private int populasi;
    private double luasWilayah;

    public Negara() {
        this("", 0, 0.0);
    }

    public Negara(String namaNegara, int populasi) {
        this(namaNegara, populasi, 0.0);
    }

    public Negara(String namaNegara, int populasi, double luasWilayah) {
        this.namaNegara = namaNegara;
        this.populasi = populasi;
        this.luasWilayah = luasWilayah;
    }

    public void info() {
        System.out.println("Nama Negara: " + this.namaNegara);
        System.out.println("Populasi: " + this.populasi);
        System.out.println("Luas Wilayah: " + this.luasWilayah + " km^2");
    }
}

class NegaraBerkembang extends Negara {
    private String programPembangunan;

    public NegaraBerkembang(String namaNegara, int populasi, double luasWilayah, String programPembangunan) {
        super(namaNegara, populasi, luasWilayah);
        this.programPembangunan = programPembangunan;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Program Pembangunan: " + this.programPembangunan);
    }
}

public class Country {
    public static void main(String[] args) {
        NegaraBerkembang negara1 = new NegaraBerkembang("Indonesia", 270_000_000, 1_904_000,
                "Pembangunan Infrastruktur");
        negara1.info();
    }
}