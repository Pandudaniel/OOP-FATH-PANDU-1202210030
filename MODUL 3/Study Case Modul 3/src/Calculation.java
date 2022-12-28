public class Calculation implements Runnable {
    public double radius, side, area;
    public double phi = 3.14;

    public void setSquare(double side) {
        if (side >= 1) {
            this.side = side;
            this.area = side * side;
        } else {
            throw new IllegalArgumentException("Side must be >= 1 !");
        }
    }

    public double getSquare() {
        return area;
    }

    public void setCircle(double radius) {
        if (radius >= 1) {
            this.side = radius;
            this.area = phi * radius * radius;
        } else {
            throw new IllegalArgumentException("Side must be >= 1 !");
        }
    }

    public double getCircle() {
        return area;
    }

    public void setTrapezoid(double a, double b, double t) {
        this.side = a;
        this.side = b;
        this.side = t;
        this.area = 0.5 * ((a + b) * t);
        if (this.side < 1) {
            throw new IllegalArgumentException("Side must be >= 1 !");
        }
    }

    public double getTrapezoid() {
        return area;
    }

    @Override
    public void run() {
        System.out.println();
        System.out.println("====Program will Start in====");
        for (int i = 3; i >= 1; i--) {
            System.out.println("Starting with thread in " + i);
        }
        try {
            Thread.sleep(230);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
