package org.astrox.waterutility.model.dto;

public record MeterReadingDto(long id, int electricity, int gas, int water, int hotWaterKitchen, int coldWaterKitchen, int hotWaterBath, int coldWaterBath) {
}

