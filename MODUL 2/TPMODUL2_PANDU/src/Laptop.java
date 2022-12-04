public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop(String drive, int ram, Float processor, boolean webcam) {
        super(drive, ram, processor);
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
        this.webcam = webcam;
    }

    public void informasi() {
        System.out.println("Laptop ini memiliki drive tipe " + this.drive + "dengan ram sebesar " + this.ram
                + "GB dan processor secepat " + this.processor + "GHz");
    }

    public void bukagame(String nama_game) {
        System.out.println("Laptop berhasil membuka game" + nama_game);
    }

    public void kirimEmail(String email) {
        System.out.println("Laptop berhasil mengirim email ke  " + email);
    }

    public void kirimEmail(String email1, String email2) {
        System.out.println("Laptop berhasil mengirim email ke " + email1 + "dan " + email2);
    }

}