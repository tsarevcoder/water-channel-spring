package org.astrox.waterutility.repository.meterreading;

import org.astrox.waterutility.model.MeterReadingModel;
import org.astrox.waterutility.model.MeterReadingRowMapper;
import org.astrox.waterutility.model.dto.MeterReadingDto;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MeterReadingRepositoryImpl implements MeterReadingRepository{
    private final JdbcClient jdbcClient;
    public MeterReadingRepositoryImpl(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }
    @Override
    public List<MeterReadingModel> findAllMeters() {
        return jdbcClient.sql("SELECT * FROM public.meter_reading")
                .query(new MeterReadingRowMapper())
                .list();
    }
    @Override
    public void sendMeter(MeterReadingDto meterReadingDto) {
        jdbcClient.sql("INSERT INTO public.meter_reading (id, electricity, water, gas, hot_water_kitchen, cold_water_kitchen, hot_water_bath, cold_water_bath) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?)")
                .params(meterReadingDto.id(), meterReadingDto.electricity(), meterReadingDto.water(),
                        meterReadingDto.gas(), meterReadingDto.hotWaterKitchen(), meterReadingDto.coldWaterKitchen(),
                        meterReadingDto.hotWaterBath(), meterReadingDto.coldWaterBath())
                .update();
    }

    @Override
    public Optional<MeterReadingModel> findMeterById(Long id) {
        String sql = "SELECT * FROM public.meter_reading WHERE id = ?";
        return jdbcClient.sql(sql)
                .param(id)
                .query(new MeterReadingRowMapper())
                .optional();
    }
}
