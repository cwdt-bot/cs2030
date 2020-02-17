class Cuboid extends Shape3D {
    protected final double height;
    protected final double width;
    protected final double length;

    Cuboid(double x, double y,double z) {
        this.height = x;
        this.width = y;
        this.length = z;
    }

    public double getSurfaceArea() {
        return 2 * (this.width * this.length + this.width * this.height
             + this.height * this.length);
    }

    Cuboid setHeight(double x) {
        return new Cuboid(x,this.width,this.length);
    }

    Cuboid setWidth(double x) {
        return new Cuboid(this.height, x,this.length);
    }

    Cuboid setLength(double x) {
        return new Cuboid(this.height,this.width,x);
    }

    public double getVolume() {
        return this.height * this.length * this.width;
    }

    public String toString() {
        return "Cuboid [" + String.format("%.2f",this.height)
             + " x " + String.format("%.2f", this.width)
                 + " x " + String.format("%.2f", this.length) + "]";

    }
}   

