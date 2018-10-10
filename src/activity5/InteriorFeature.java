package activity5;

public class InteriorFeature implements Feature {

    String interiorFeature;

    public InteriorFeature() {
        this.interiorFeature = "Generic";
    }

    public InteriorFeature(String interiorFeature) {
        this.interiorFeature = interiorFeature;
    }

    @Override
    public String getFeature() {
        return interiorFeature;
    }

    @Override
    public void setFeature(String feature) {

    }

    @Override
    public String toString() {
        return "InteriorFeature (" + interiorFeature + ")";
    }
}
