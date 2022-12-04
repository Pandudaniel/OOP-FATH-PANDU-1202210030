public class App {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat1 = new Perangkat("seagate", 4, 2.80F);
        perangkat1.informasi();

        Handphone handphone1 = new Handphone("sandisk", 8, 3.20F, true);
        handphone1.informasi();
        handphone1.telfon(628735498);
        handphone1.kirimSMS(628542090);
        handphone1.kirimSMS(621654734, 628673419);

        Laptop laptop1 = new Laptop("HP", 16, 3.40F, true);
        laptop1.informasi();
        laptop1.bukagame("Counter-Strike: Global Offensive");
        laptop1.kirimEmail("pandudaniel17@gmail.com");
        laptop1.kirimEmail("pandudaniel17@gmail.com", "anggiatpandu@gmail.com");

    }
}