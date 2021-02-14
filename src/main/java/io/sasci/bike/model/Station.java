package io.sasci.bike.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Station {
    private int empty_slots;
    private Extra extra;
    private int free_bikes;
    private String id;
    private double latitude;
    private double longitude;
    private String name;
    private String timestamp;
}
