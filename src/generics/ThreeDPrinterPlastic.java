package generics;

public class ThreeDPrinterPlastic {
    private Plastic material;

    public Plastic getMaterial() {
        return material;
    }

    public void setMaterial(Plastic material) {
        this.material = material;
    }
    public String toString() {
        return material.toString();
    }
}
