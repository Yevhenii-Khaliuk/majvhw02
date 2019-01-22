package com.khaliuk.builder;

public class Laptop {
    private String vendor;
    private String model;
    private double displaySize;
    private String cpu;
    private int ramCapacity;
    private String hardDriveType;
    private int hardDriveCapacity;
    private String graphicsCard;
    private double weight;

    private Laptop(LaptopBuilder builder) {
        this.vendor = builder.vendor;
        this.model = builder.model;
        this.displaySize = builder.displaySize;
        this.cpu = builder.cpu;
        this.ramCapacity = builder.ramCapacity;
        this.hardDriveType = builder.hardDriveType;
        this.hardDriveCapacity = builder.hardDriveCapacity;
        this.graphicsCard = builder.graphicsCard;
        this.weight = builder.weight;
    }

    @Override
    public String toString() {
        return vendor + " " + model + " / " + displaySize + "\" display / "
                + cpu + " CPU / " + ramCapacity + " GB RAM / "
                + hardDriveType + " " + hardDriveCapacity + " GB / "
                + graphicsCard + " / " + weight + " kg";
    }

    public static class LaptopBuilder {
        private String vendor;
        private String model;
        private double displaySize;
        private String cpu;
        private int ramCapacity;
        private String hardDriveType;
        private int hardDriveCapacity;
        private String graphicsCard;
        private double weight;

        public LaptopBuilder(String vendor, String model) {
            this.vendor = vendor;
            this.model = model;
        }

        public LaptopBuilder setDisplaySize(double displaySize) {
            this.displaySize = displaySize;
            return this;
        }

        public LaptopBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public LaptopBuilder setRamCapacity(int ramCapacity) {
            this.ramCapacity = ramCapacity;
            return this;
        }

        public LaptopBuilder setHardDriveType(String hardDriveType) {
            this.hardDriveType = hardDriveType;
            return this;
        }

        public LaptopBuilder setHardDriveCapacity(int hardDriveCapacity) {
            this.hardDriveCapacity = hardDriveCapacity;
            return this;
        }

        public LaptopBuilder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public LaptopBuilder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }
    }
}
