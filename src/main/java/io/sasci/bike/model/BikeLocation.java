package io.sasci.bike.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BikeLocation {
    private String city;
    private String country;
    private Double latitude;
    private Double longitude;
}
