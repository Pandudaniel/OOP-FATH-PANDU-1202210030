public class Perangkat {
    protected String drive;
    protected Integer ram;
    protected Float processor;

    public Perangkat(String drive, int ram, Float processor) {
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }

    public void informasi() {
        if (this.drive != "seagate" && this.ram != 4 && this.processor != 1.90F) {
            System.out.println(
                    "Perangkat tidak memiliki drive bertipe seagate, ram 4 GB dan juga processor berkekuatan 1.90 GHz");
        } else {
            System.out.println(
                    "Perangkat memiliki drive bertipe seagate, ram 4 GB dan juga processor berkekuatan 1.90 GHz");
        }

    }
}
