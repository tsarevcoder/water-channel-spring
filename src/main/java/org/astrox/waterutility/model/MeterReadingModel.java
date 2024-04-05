package org.astrox.waterutility.model;

public class MeterReadingModel {
    private long id;
    private int electricity;
    private int gas;
    private int water;
    private int hotWaterKitchen;
    private int coldWaterKitchen;
    private int hotWaterBath;
    private int coldWaterBath;

    public MeterReadingModel(long id, int electricity, int gas, int water, int hotWaterKitchen, int coldWaterKitchen, int hotWaterBath, int coldWaterBath) {
        this.id = id;
        this.electricity = electricity;
        this.gas = gas;
        this.water = water;
        this.hotWaterKitchen = hotWaterKitchen;
        this.coldWaterKitchen = coldWaterKitchen;
        this.hotWaterBath = hotWaterBath;
        this.coldWaterBath = coldWaterBath;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getElectricity() {
        return electricity;
    }

    public void setElectricity(int electricity) {
        this.electricity = electricity;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getHotWaterKitchen() {
        return hotWaterKitchen;
    }

    public void setHotWaterKitchen(int hotWaterKitchen) {
        this.hotWaterKitchen = hotWaterKitchen;
    }

    public int getColdWaterKitchen() {
        return coldWaterKitchen;
    }

    public void setColdWaterKitchen(int coldWaterKitchen) {
        this.coldWaterKitchen = coldWaterKitchen;
    }

    public int getHotWaterBath() {
        return hotWaterBath;
    }

    public void setHotWaterBath(int hotWaterBath) {
        this.hotWaterBath = hotWaterBath;
    }

    public int getColdWaterBath() {
        return coldWaterBath;
    }

    public void setColdWaterBath(int coldWaterBath) {
        this.coldWaterBath = coldWaterBath;
    }
}
