public class Handphone extends Perangkat {

    protected boolean fingerprint;

    public Handphone(String drive, int ram, Float processor, boolean fingerprint) {
        super(drive, ram, processor);
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
        this.fingerprint = fingerprint;
    }

    public void informasi() {
        System.out.println("Handphone ini memiliki drive tipe " + this.drive + " dengan ram sebesar " + this.ram
                + "GB dan processor secepat " + this.processor + "GHz");
    }

    public void telfon(int no_hp) {
        System.out.println("Handphone berhasil menyambungkan telfon ke no " + no_hp);
    }

    public void kirimSMS(int no_hp) {
        System.out.println("Handphone berhasil mengirim SMS ke no " + no_hp);
    }

    public void kirimSMS(int no_hp1, int no_hp2) {
        System.out.println("Handphone berhasil mengirim SMS ke nomor " + no_hp1 + "dan " + no_hp2);
    }
}
