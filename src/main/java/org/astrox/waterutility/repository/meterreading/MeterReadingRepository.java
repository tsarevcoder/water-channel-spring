package org.astrox.waterutility.repository.meterreading;

import org.astrox.waterutility.model.MeterReadingModel;
import org.astrox.waterutility.model.dto.MeterReadingDto;

import java.util.List;
import java.util.Optional;

public interface MeterReadingRepository {
    List<MeterReadingModel> findAllMeters();
    void sendMeter(MeterReadingDto meterReadingDto);
    Optional<MeterReadingModel> findMeterById(Long id);
}

