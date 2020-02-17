class SolidShape3D {
    protected final Shape3D shape;
    protected final Material material;

    SolidShape3D(Shape3D shape, Material m) { 
        this.shape = shape;
        this.material = m;
    }

    double getMass() {
        return this.shape.getVolume() * this.material.getDensity();
    }

    @Override
    public String toString() {
        String prev = this.shape.toString();
        return "Solid" + prev + " with a mass of " + String.format("%.2f",this.getMass());
    }

    double getDensity() {
        return this.material.getDensity();
    }
}