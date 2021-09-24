package org.launchcode.studio7;

public abstract class BaseDisc {
    String storageCapacity;
    String name;
    String size;

    public BaseDisc() {
    }


    public void laserRead() {
        System.out.println(this.name + " has started reading via the laser.");
    }

    public void laserWrite() {
        System.out.println(this.name + " has started writing to the disc.");
    }

    public String getStorageCapacity () {
        return storageCapacity;
    }

    public void setStorageCapacity ( String storageCapacity ) {
        this.storageCapacity = storageCapacity;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getSize () {
        return size;
    }

    public void setSize ( String size ) {
        this.size = size;
    }
}
