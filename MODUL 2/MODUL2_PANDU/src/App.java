public class App {
    public static void main(String[] args) throws Exception {
        TransportasiAir transportasiAir = new TransportasiAir(4, 20000);
        transportasiAir.informasi();
        transportasiAir.berlabuh();
        transportasiAir.berlayar();

        Sampan sampan = new Sampan(20, 50000, 2);
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(2);

        Kapal kapal = new Kapal(20, 10000, "Diesel");
        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar(20);
        kapal.berlabuh();
    }
}
