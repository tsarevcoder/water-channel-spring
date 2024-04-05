package org.astrox.waterutility.model;


import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MeterReadingRowMapper implements RowMapper<MeterReadingModel> {

    @Override
    public MeterReadingModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new MeterReadingModel(
                rs.getLong("id"),
                rs.getInt("electricity"),
                rs.getInt("gas"),
                rs.getInt("water"),
                rs.getInt("hot_water_kitchen"),
                rs.getInt("cold_water_kitchen"),
                rs.getInt("hot_water_bath"),
                rs.getInt("cold_water_bath")
        );
    }
}

