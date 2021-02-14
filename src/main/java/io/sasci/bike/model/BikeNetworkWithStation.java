package io.sasci.bike.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BikeNetworkWithStation {
    @JsonIgnore
    private List<String> company;
    private String href;
    private String gbfs_href;
    private String id;
    private BikeLicence license;
    private String source;
    private BikeLocation location;
    private String name;
    private List<Station> stations;
}