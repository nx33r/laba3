public class DigitalCamera extends Camera {
    private String resolution;
    private double zoom;
    private String memoryCardType;
    private int photosCount;

    public DigitalCamera(String brand, String model, String lens, String resolution, double zoom, String memoryCardType, int photosCount) {
        super(brand, model, lens);
        this.resolution = resolution;
        this.zoom = zoom;
        this.memoryCardType = memoryCardType;
        this.photosCount = photosCount;
    }

    @Override
    public String takePhoto() {
        return "Digital Camera Photo: Resolution - " + resolution + ", Zoom - " + zoom;
    }

    public void savePhoto() {
        this.photosCount++;
    }

    public void eraseMemory() {
        this.photosCount = 0;
    }

    public void changeSettings(String resolution, double zoom) {
        this.resolution = resolution;
        this.zoom = zoom;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public double getZoom() {
        return zoom;
    }

    public void setZoom(double zoom) {
        this.zoom = zoom;
    }

    public String getMemoryCardType() {
        return memoryCardType;
    }

    public void setMemoryCardType(String memoryCardType) {
        this.memoryCardType = memoryCardType;
    }

    public int getPhotosCount() {
        return photosCount;
    }

    public void setPhotosCount(int photosCount) {
        this.photosCount = photosCount;
    }
}
