class SolidCuboid extends Cuboid {
    protected final double density;

    SolidCuboid(double x, double y, double z, double p) {
        super(x,y,z);
        this.density = p;
    }

    @Override
    SolidCuboid setHeight(double x) {
        return new SolidCuboid(x,this.width, this.length, this.density);
    }

    @Override
    SolidCuboid setWidth(double x) {
        return new SolidCuboid(this.height, x,this.length, this.density);
    }

    @Override
    SolidCuboid setLength(double x) {
        return new SolidCuboid(this.height,this.width,x, this.density);
    }

    Double getMass() {
        return this.getVolume() * this.density;
    }

    @Override
    public String toString() {
        String prev = super.toString();
        return "Solid" + prev + " with a mass of " + String.format("%.2f",this.getMass());
    }

    Double getDensity() {
        return this.density;
    }
}