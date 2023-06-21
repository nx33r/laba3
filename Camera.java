public abstract class Camera {
    private String brand;
    private String model;
    private String lens;

    public Camera(String brand, String model, String lens) {
        this.brand = brand;
        this.model = model;
        this.lens = lens;
    }

    public abstract String takePhoto();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLens() {
        return lens;
    }

    public void setLens(String lens) {
        this.lens = lens;
    }
}
