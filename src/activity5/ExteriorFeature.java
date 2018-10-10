package activity5;

public class ExteriorFeature implements Feature {

    String exteriorFeature;

    public ExteriorFeature() {
        this.exteriorFeature = "Generic";
    }

    public ExteriorFeature(String exteriorFeature) {
        this.exteriorFeature = exteriorFeature;
    }

    @Override
    public String getFeature() {
        return exteriorFeature;
    }

    @Override
    public void setFeature(String exteriorFeature) {

    }

    @Override
    public String toString() {
        return "ExteriorFeature (" + exteriorFeature + ")";
    }
}
