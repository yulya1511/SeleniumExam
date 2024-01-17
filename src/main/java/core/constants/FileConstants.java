package core.constants;

public enum FileConstants {
    IMAGE_JPEG(System.getProperty("user.dir") + "/src/main/resources/images.jpeg"),
    NORWAY_JPG(System.getProperty("user.dir") + "/src/main/resources/Norway.jpg");

    private String path;

    FileConstants(String path) {
        this.path = path;
    }

    public String getPath() {
        return this.path;
    }
}
