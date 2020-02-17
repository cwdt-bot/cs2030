class Material {
    protected final String name;
    protected final double density;

    Material(String name, double p) {
        this.name = name;
        this.density = p;
    }

    String getName() {
        return this.name;
    }

    Double getDensity() {
        return this.density;
    }

}