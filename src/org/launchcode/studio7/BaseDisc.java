package org.launchcode.studio7;

public class BaseDisc {
    private double storageCapacity;
    private double storageUsed;
    private String title;
    private String contents;

    public BaseDisc(double storageCapacity, double storageUsed, String title, String contents) {
        this.storageCapacity = storageCapacity;
        this.storageUsed = storageUsed;
        this.title = title;
        this.contents = contents;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public double getStorageUsed() {
        return storageUsed;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public void setStorageUsed(double storageUsed) {
        this.storageUsed = storageUsed;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
