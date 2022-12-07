public class Kapal extends TransportasiAir {
    protected String mesin;

    public Kapal(int jumlahKursi, int biaya, String mesin) {
        super(jumlahKursi, biaya);
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
        this.mesin = mesin;
    }

    public void informasi() {
        System.out.println("Transportasi Air jenis kapal dengan kursi berjumlah " + this.jumlahKursi
                + "ditetapkan dengan biaya sebesar Rp. " + this.biaya);
    }

    public void berlayar() {
        System.out.println("Transportasi Air jenis kapal sedang berlayar mesin " + this.mesin
                + "dengan kecepatan yang tidak stabil");
    }

    public void berlayar(int kecepatan) {
        System.out.println("Transportasi Air jenis kapal sedang berlayar mesin " + this.mesin
                + "dengan kecepatan stabil di kisaran " + kecepatan + "knot");
    }

    public void berlabuh() {
        System.out.println("Transportasi Air jenis kapal berlabuh di pantai");

    }
}
