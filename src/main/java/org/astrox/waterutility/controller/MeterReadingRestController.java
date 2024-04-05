package org.astrox.waterutility.controller;

import org.astrox.waterutility.exception.ReadingNotFoundException;
import org.astrox.waterutility.model.MeterReadingModel;
import org.astrox.waterutility.model.dto.MeterReadingDto;
import org.astrox.waterutility.repository.meterreading.MeterReadingRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/meters")
public class MeterReadingRestController {
    private final MeterReadingRepository meterReadingRepository;

    public MeterReadingRestController(MeterReadingRepository meterReadingRepository) {
        this.meterReadingRepository = meterReadingRepository;
    }
    @GetMapping("/all")
    public ResponseEntity<List<MeterReadingModel>> findAllMeters() {
        return ResponseEntity.ok(meterReadingRepository.findAllMeters());
    }
    @GetMapping("/meter/{id}")
    public ResponseEntity<MeterReadingModel> getMeterById(@PathVariable Long id) {
        MeterReadingModel meter = meterReadingRepository.findMeterById(id)
                .orElseThrow(() -> new ReadingNotFoundException("reading not found with id: " + id));
        return ResponseEntity.ok(meter);
    }
    @PostMapping("/save")
    public ResponseEntity<String> sendMeter(@RequestBody MeterReadingDto readingDto) {
        MeterReadingModel meterReadingModel = new MeterReadingModel(readingDto.id(), readingDto.electricity(), readingDto.gas(),
                readingDto.water(), readingDto.hotWaterKitchen(),readingDto.coldWaterKitchen(), readingDto.hotWaterBath(), readingDto.coldWaterBath() );
        meterReadingRepository.sendMeter(readingDto);
        return ResponseEntity.ok("Meter reading saved successfully");
    }

}
