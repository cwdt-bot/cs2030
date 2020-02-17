class SolidSphere extends Sphere {
    protected final double density;

    SolidSphere(double x, double p) {
        super(x);
        this.density = p;
    }

    Double getMass() {
        return this.getVolume() * this.density;
    }

    @Override
    public String toString() {
        String prev = super.toString();
        return "Solid" + prev + " with a mass of " + String.format("%.2f",this.getMass());
    }

    @Override
    SolidSphere setRadius(double r) {
        return new SolidSphere(r, this.density);
    }

    Double getDensity() {
        return this.density;
    }
}