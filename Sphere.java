class Sphere extends Shape3D {
    protected final double radius;

    Sphere(double r) {
        this.radius = r;
    }

    public String toString() {
        return "Sphere [" + String.format("%.2f", this.radius) + "]";
    }

    Sphere setRadius(double x) {
        return new Sphere(x);
    }

    public double getVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(this.radius,3);
    }

    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(this.radius,2);
    }
}