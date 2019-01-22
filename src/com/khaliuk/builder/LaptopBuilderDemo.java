package com.khaliuk.builder;

public class LaptopBuilderDemo {
    public static void main(String[] args) {
        Laptop laptop = new Laptop.LaptopBuilder("ASUS", "Zen Book Pro")
                        .setDisplaySize(15.6)
                        .setCpu("Intel Core i5-7300HQ")
                        .setRamCapacity(16)
                        .setHardDriveType("SSD")
                        .setHardDriveCapacity(512)
                        .setGraphicsCard("nVidia GeForce GTX 1050")
                        .setWeight(1.8)
                        .build();

        System.out.println("Laptop is built:");
        System.out.println(laptop.toString());
    }
}
